package module2;

import java.util.Scanner;

public class GExercise {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        String[] availableOptions = {"1. Calculadora 🧮", "2. Hackear la nada 😎", "3. Salir"};

        terminal: while (true) {
            System.out.println("Ingresa opción:");
            for(String optionAvailable: availableOptions) {
                System.out.println(optionAvailable);
            }
            byte userPrompt = scanner.nextByte();

            switch (userPrompt) {
                case 1:
                    _calculatorApp();
                    break;
                case 2:
                    _hackNasaApp();
                    break;
                case 3:
                    break terminal;
            }
        }
    }

    private static void _calculatorApp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora");
        System.out.println("Ingresa primer numero:");
        int num1 = scanner.nextInt();
        System.out.println("Ingresa segundo numero:");
        int num2 = scanner.nextInt();
        System.out.println("El resultado es: " + num1 + num2);
    }

    private static void _hackNasaApp() {
        System.out.println("Hackeando la nada");
        System.out.println("###");
        System.out.println("#####");
        System.out.println("##########");
        System.out.println("Hackeaste la nasa 👀");
    }
}
