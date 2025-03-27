package module10;

import java.util.stream.Stream;

public class DDivideStreams {
    public static void execute() {
        Stream<Integer> s = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // pageSize = 10
        // page = 5
        // skip: (page - 1) * pageSize
        // limit: pageSize
        // s.limit(5).skip(2).forEach(System.out::println);

        //  s.dropWhile(i -> i < 3).forEach(System.out::println);

        s.takeWhile(i -> i < 3).forEach(System.out::println);
    }
}
