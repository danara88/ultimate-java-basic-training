package module7;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class AMultipleExceptions {
    public static void execute() {
        try {
            FileReader fileReader = new FileReader("input.txt");
            var x = 10/ 0;
        } catch (FileNotFoundException | ArithmeticException e) {
            System.out.println("Archivo no existente o excepcion aritmetica");
        }

        System.out.println("App continua ..");
    }
}
