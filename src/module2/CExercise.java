package module2;

import java.util.Scanner;

public class CExercise {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int number = scanner.nextInt();

        String resultMessage = number % 2 == 0 ? "El número es par !!" : "El número no es par" ;
        System.out.println(resultMessage);
        if(number % 3 == 0 && number % 4 == 0) {
            System.out.println("El número es divisible entre 3 y 4");
            return;
        }

        if(number % 3 == 0) {
            System.out.println("El número es divisible entre 3");
            return;
        }

        if(number % 4 == 0) {
            System.out.println("El número es divisible entre 4");
        }
    }
}
