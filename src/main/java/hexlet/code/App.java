package hexlet.code;

import hexlet.code.game.Engine;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {

        System.out.println("Please enter the game number end press Enter\n1 - Greet\n"
                + "2 - Even\n3 - Calc\n4 - Exit");

        Scanner scan = new Scanner(System.in);
        String choice = scan.next();

        System.out.println("Your choice - " + choice + "\n");

        switch (choice) {
            case ("1") -> Engine.greeting();
            case ("2") -> {
                Engine.greeting();
                Engine.getName();
                System.out.println("Answer 'yes' if number even otherwise answer 'no'\n");
                Engine.startEvenGame();
            }
            case ("3") -> {
                Engine.greeting();
                Engine.getName();
                System.out.println("What is the result of the expression?\n");
                Engine.startCalcGame();
            }
            default -> System.out.println("Goodbye my friend's!");
        }
    }
}
