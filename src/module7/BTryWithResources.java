package module7;

import java.io.FileReader;
import java.io.IOException;

public class BTryWithResources {
    public static void execute() {
        // Try-with-resource
        // Se ecarga de usar un recurso, y cerrarlo.
        try (
                // Puedo usar multiples recursos
                // Estors recursos deben de implementar la interfaz Closable
                FileReader fr = new FileReader("input.txt");
                FileReader fr2 = new FileReader("input.txt");
        ) {
            var data = fr.read();
            var data2 = fr2.read();

            System.out.println(data2);
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Archivo no encontrado");
        }
    }
}
