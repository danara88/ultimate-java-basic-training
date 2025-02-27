package module9;

import java.util.function.Function;

public class HCompose {
    public static void execute() {
        Function<Integer, Double> mitad = x -> x / 2.0;

        var z = mitad.apply(10);
        System.out.println(z);

        // Composicion (Approach 1)
        // Primer se ejecuta el apply y se pasa el valor a "mitad"
        // después el resultado pasa a las demás expresiones.
        var y = mitad
                .andThen(x -> x + 2)
                .andThen(x -> x * 2)
                .apply(2);

        System.out.println(y); // Output: 6.0

        // Composicion (Approach 2)
        // Cambia el orden de ejecución.
        // Primero se ejecuta el apply (de abajo hacia arriba),
        // luego ejecuta (Integer x) -> x + 2
        // y después (Integer x) -> x + 2
        // Y por último se ejecuta "mitad"
        y = mitad.compose((Integer x) -> x + 2).compose((Integer x) -> x + 2).apply(2);

        System.out.println(y); // Output: 3.0
    }
}
