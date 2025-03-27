package module10;

import java.util.List;
import java.util.stream.Stream;

public class CFlatMap {
    public static void execute() {
        var stream = Stream.of(List.of(1,2,3), List.of(4,5,6), List.of(7,8,9));

        // FlatMap: Aplanar el array
        stream.flatMap(l -> l.stream()).forEach(System.out::println);
    }
}
