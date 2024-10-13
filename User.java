package Mcq_exam_conduct;

import java.util.ArrayList;
import java.util.List;

public class User {
    String name;
    List<Question> questions = new ArrayList<>();
    List<Integer> answers = new ArrayList<>();
    String result;

    public User(String name) {
        this.name = name;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void submitAnswer(int answer) {
        answers.add(answer);
    }

    public void calculateResult() {
        int score = 0;
        for (int i = 0; i < questions.size(); i++) {
            if (answers.get(i) == questions.get(i).getCorrectChoice()) {
                score++;
            }
        }
        double percentage = (double) score / questions.size() * 100;
        if (percentage >= 60) {
            result = "Pass";
        } else {
            result = "Fail";
        }
    }

    public String getResult() {
        return result;
    }
}
