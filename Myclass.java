package Mcq_exam_conduct;

import java.util.Scanner;

public class Myclass {
    public static void main(String[] args) {
        Exam exam = new Exam();
        Scanner scanner = new Scanner(System.in);

        addQuestions(exam); // Add 15 questions

        while (true) {
            System.out.println("1. Add user and take test");
            System.out.println("2. Print result of all");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    User user = new User("User");
                    exam.addUser(user);
                    exam.conductTest(user);
                    break;
                case 2:
                    exam.printResultOfAll();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        }
    }

    private static void addQuestions(Exam exam) {
        exam.addQuestion(new Question("1+1?", "1", "2", "3", "4", 2));
        exam.addQuestion(new Question("1 * 2 ?", "2", "1", "4", "5", 1));
        exam.addQuestion(new Question("2 - 1 ?", "1", "3", "4", "5", 1));
        exam.addQuestion(new Question("4 / 2 ?", "2", "1", "4", "5", 1));
        exam.addQuestion(new Question("4 * 2 ?", "8", "1", "4", "5", 1));
        exam.addQuestion(new Question("4 * 3 ?", "12", "1", "4", "5", 1));
        exam.addQuestion(new Question("4 - 2 ?", "2", "1", "4", "5", 1));
        exam.addQuestion(new Question("1 + 2 ?", "3", "1", "4", "5", 1));
        exam.addQuestion(new Question("3 * 3 ?", "9", "1", "4", "5", 1));
        exam.addQuestion(new Question("4 * 4 ?", "16", "1", "4", "5", 1));
        exam.addQuestion(new Question("5 * 5 ?", "25", "1", "4", "5", 1));
        exam.addQuestion(new Question("6 * 6 ?", "36", "1", "4", "5", 1));
        exam.addQuestion(new Question("7 * 7 ?", "49", "1", "4", "5", 1));
        exam.addQuestion(new Question("8 * 8 ?", "64", "1", "4", "5", 1));
        exam.addQuestion(new Question("9 * 9 ?", "81", "1", "4", "5", 3));
    }

    }

