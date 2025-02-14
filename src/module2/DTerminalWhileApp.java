package module2;

import java.util.Scanner;

enum Action {
    start,
    exit
}

public class DTerminalWhileApp {
    public static void execute() {
        Action action = Action.start;
        Scanner scanner = new Scanner(System.in);

        while (action != Action.exit) {
            System.out.println("Do you want to continue? (y/n)");
            String prompt = scanner.next();

            if(prompt.equals("n")) {
                action = Action.exit;
            }
        }
    }
}
