package module7;

import java.io.IOException;

public class CThrowExceptions {
    public static void execute() {
        try {
            verificarEdad(-2);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    // Le decimos al compilador que el metodo puede que lance un exception de IOException
    public static void verificarEdad(int edad) throws IOException {
        if(edad < 0) {
            throw new IOException("La edad debe ser positiva");
        }
    }
}
