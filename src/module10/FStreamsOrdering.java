package module10;

import java.util.Comparator;
import java.util.List;

public class FStreamsOrdering {
    public static void execute() {
        // Orden de streams
        List<UserV2> users = List.of(
                new UserV2(18, "Daniel", "Rodriguez"),
                new UserV2(15, "Javier", "Torres"),
                new UserV2(21, "Beto", "Jimenez")
        );

        users.stream()
                //.sorted((a, b) -> a.name.compareTo(b.name));
                .sorted(Comparator.comparing(a -> a.age))
                .forEach(System.out::println);
    }
}

class UserV2 implements Comparable<UserV2> {
    public String name;
    public String surname;
    public int age;

    public UserV2(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public int compareTo(UserV2 o) {
        return 0;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

