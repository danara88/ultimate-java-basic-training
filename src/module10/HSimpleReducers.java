package module10;

import java.util.List;
import java.util.Objects;

public class HSimpleReducers {
    public static void execute() {
        List<UserV4> users = List.of(
                new UserV4(18, "Daniel", "Rodriguez"),
                new UserV4(15, "Javier", "Torres"),
                new UserV4(21, "Beto", "Jimenez"),
                new UserV4(15, "", "Torres")
        );

        // anyMatch
        var anyMatchStream = users.stream()
                .map(x -> x.name)
                .anyMatch(name -> Objects.equals(name, "Daniel"));
        System.out.println(anyMatchStream);

        // allMacth
        var allMatchStream = users.stream()
                .map(x -> x.name)
                .allMatch(String::isEmpty);
        System.out.println(allMatchStream);

        // noneMatch
        var noneMatchStream = users.stream()
                .map(x -> x.name)
                .noneMatch(String::isEmpty);
        System.out.println(noneMatchStream);

        // findAny
        var findAnyStream = users.stream()
                .map(x -> x.name)
                .findAny();
        System.out.println(findAnyStream.get()); // Optional: Sirve para evitar el NullPointerException

        // findFirst
        var findFirstStream = users.stream()
                .map(x -> x.name)
                .findFirst();
        System.out.println(findFirstStream.get()); // Optional: Sirve para evitar el NullPointerException

        // min
        var minStream = users.stream()
                .map(x -> x.age)
                .min(Integer::compareTo);
        System.out.println(minStream.get());

        // max
        var maxStream = users.stream()
                .map(x -> x.age)
                .max(Integer::compareTo);
        System.out.println(maxStream.get());

        // Optinal: Significa que potencialmente el elemnto que queremos obener
        // puede estar vacio.
    }
}

class UserV4 implements Comparable<UserV4> {
    public String name;
    public String surname;
    public int age;

    public UserV4(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public int compareTo(UserV4 o) {
        return 0;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
