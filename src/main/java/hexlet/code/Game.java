package hexlet.code;

import java.util.Scanner;

public class Game {

    private static boolean evenNumber;
    private static int flag = 0;
    private static final int LOOPS = 3;
    private static final int FACTOR = 100;

    public static void getAnswer(String person) {
        System.out.println("Question: " + getRandomNumber());
        System.out.print("Your answer: ");

        Scanner scan = new Scanner(System.in);
        String answer = scan.next();

        if (correctInput(answer)) {
            if (evenNumber && answer.equals("yes") || (!evenNumber && answer.equals("no"))) {
                System.out.println("Correct!");
                flag++;
                if (flag < LOOPS) {
                    getAnswer(person);
                } else {
                    System.out.println("Congratulation! " + person);
                }
            } else if (evenNumber && answer.equals("no")) {

                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\n"
                        + "Let's try again " + person + "!");
            } else if (!evenNumber && answer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n"
                        + "Let's try again " + person + "!");
            }
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. \n"
                    + "Let's try again " + person + "!");
        }
    }

    public static int getRandomNumber() {
        int randomNumber = (int) (Math.random() * FACTOR);
        evenNumber = randomNumber % 2 == 0;
        return randomNumber;
    }

    private static boolean correctInput(String input) {
        return input.equals("yes") || input.equals("no");
    }
}
