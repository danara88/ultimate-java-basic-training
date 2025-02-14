package module1;

import java.util.Scanner;

public class LScanner {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine(); // Each word inserted is a token. You should use nextLine to capture all the worlds
        System.out.println(value);

        byte value2 = scanner.nextByte();
        System.out.println(value2);

        System.out.println("Insert your age:");
        byte age = scanner.nextByte();
        System.out.println("Your ages is " + age);
    }
}
