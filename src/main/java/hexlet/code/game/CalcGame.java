package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Scanner;

public class CalcGame {

    private static int resultCalc;

    public static void gameRules() {
        System.out.println("What is the result of the expression?\n");
    }

    public static int getAnswerCalcGame() {
        System.out.println("Question: " + calcOutput());
        System.out.print("Your answer: ");

        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static boolean checkAnswerCalcGame(int answer, String person) {
        if (resultCalc == answer) {
            return true;
        } else {
            Engine.incorrectInput("" + answer, "" + resultCalc, person);
            return false;
        }
    }

    private static String calcOutput() {
        int a = Engine.getRandomNumber();
        int b = Engine.getRandomNumber();
        String operation = Engine.getRandomOperation();

        if (operation.equals(" + ")) {
            resultCalc = a + b;
        } else if (operation.equals(" - ")) {
            resultCalc = a - b;
        } else {
            resultCalc = a * b;
        }
        return a + operation + b;
    }
}
