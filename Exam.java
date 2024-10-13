package Mcq_exam_conduct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Exam {
	private List<Question> questions = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void conductTest(User user) {
        Scanner scanner = new Scanner(System.in);
        List<Question> shuffledQuestions = new ArrayList<>(questions);
        Collections.shuffle(shuffledQuestions);
        user.questions = shuffledQuestions.subList(0, Math.min(5, shuffledQuestions.size()));

        for (Question question : user.questions) {
            System.out.println(question.questiontext);
            System.out.println("1. " + question.option1);
            System.out.println("2. " + question.option2);
            System.out.println("3. " + question.option3);
            System.out.println("4. " + question.option4);
            System.out.print("Your choice (1-4): ");
            int choice = scanner.nextInt();
            user.answers.add(choice);
        }
        int counter = 0;
        for (int i = 0; i < user.questions.size(); i++) {
            if (user.answers.get(i) == user.questions.get(i).correctchoice) {
                counter++;
            }
        }

        if (counter >= 3) {
            user.result = "pass";
            System.out.println("Congratulations! You passed.");
        } else {
            user.result = "Fail";
            System.out.println("Better luck next time.");
        }
    }

    public void printResultOfAll() {
        int count = 0;
        for (User user : users) {
            System.out.println(user.name + " " + user.result);
            if (user.result.equals("pass")) {
                count++;
            }
        }
        System.out.println("Total users: " + users.size());
        System.out.println("Pass students: " + count);
        System.out.println("Pass percentage: " + (count / users.size())*100 + "%");
    }

	public void addUserAndConductTest() {
		// TODO Auto-generated method stub
		
	}
}



