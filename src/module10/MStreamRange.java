package module10;

import java.util.stream.IntStream;

public class MStreamRange {
    public static void execute() {
        // Crear streams pero de determinadas iteraciones
        // No incluye el 5
        IntStream.range(1, 5).forEach(System.out::println);

        // Si incluye el 5
        IntStream.rangeClosed(1, 5).forEach(System.out::println);
    }
}
