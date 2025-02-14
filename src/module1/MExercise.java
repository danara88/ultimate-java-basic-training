package module1;

import java.util.Scanner;

public class MExercise {
    public static void execute() {
        /**
         * Calculator that receives two numbers and return the sum of the two numbers
         */
        System.out.println("---------- WELCOME ------------");
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert first number:");
        double number1 = scanner.nextDouble();
        System.out.println("Number 1 inserted: " + number1);

        System.out.println("Insert second number:");
        double number2 = scanner.nextDouble();
        System.out.println("Number 2 inserted: " + number2);

        System.out.println();
        System.out.println("Calculating sum ....");
        System.out.println();
        double sum = number1 + number2;
        System.out.println("The sum of both numbers (" + number1 + " + " + number2 + ") is " + sum);
    }
}
