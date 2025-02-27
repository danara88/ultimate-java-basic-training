package module9;

import java.util.function.Function;

public class GFunction {
    public static void execute() {
        // Function: Recibe un objeto y retorna un objeto
        Function<Integer, Double> mitad = x -> x / 2.0;

        // Recibe un valor que después pasará al la función lambda
        var z = mitad.apply(10); // output: 5
        System.out.println(z);
    }
}
