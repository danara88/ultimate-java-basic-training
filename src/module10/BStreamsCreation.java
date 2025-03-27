package module10;

import java.util.ArrayList;
import java.util.stream.Stream;

public class BStreamsCreation {
    public static void execute() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] xs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Metodo 1: Crear streams usando Arrays
        // Arrays.stream(xs).forEach(x -> arrayList.add(x));

        // Metodo 2: Crear streams usando of
        // Stream.of(1,2,3);

        // Metodo 3: Crear streams con limit usando iterate
        // Stream infinito
        // No se va a ejecutar hasta que lo recorramos
        var s = Stream.iterate(0, x -> x + 1);
        s.limit(5).forEach(System.out::println);

        System.out.println("============================");

        // Metodo 4: Crear streams con limit usando generate
        // Stream infinito
        // No se va a ejecutar hasta que lo recorramos
        Stream.generate(() -> (int) (Math.random() * 10))
                .limit(10)
                .forEach(System.out::println);
    }
}
