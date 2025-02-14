package module3;
/**
 * ¿Cuál es la diferencia entre argumento y parámetro?
 * Argumento: Son los valores que le pasamos al metodo cuando lo llamemos en el código.
 * Parámetros: Son las variables que definimos en un metodo para utilizarlo dentro de este.
 */
public class AMethodOverloading {
    public static void execute() {
        // Method Overloading: Consiste en definir el mismo metodo mas de 1 vez cambiando la cantidad
        // de argumentos que se le pasan.
        int resultado = suma(1,2);
        int resultado2 = suma(1,2, 3);
        String resultado3 = suma();

        System.out.println(resultado);
        System.out.println(resultado2);
        System.out.println(resultado3);
    }

    static int suma(int a, int b) {
        return a + b;
    }

    static int suma(int a, int b, int c) {
        return a + b + c;
    }

    static String suma() {
        return "Hello!";
    }
}
