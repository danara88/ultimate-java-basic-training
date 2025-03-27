package module10;

import java.util.List;
import java.util.Optional;

public class IReduce {
    public static void execute() {
        List<UserV5> users = List.of(
                new UserV5(18, "Daniel", "Rodriguez"),
                new UserV5(15, "Javier", "Torres"),
                new UserV5(21, "Beto", "Jimenez"),
                new UserV5(32, "Alejandro", "Martinez")
        );

        // Primera forma de utilizar el reduce
        Optional<String> names = users.stream()
                .limit(3)
                .map(x -> x.name)
                // Con esta manera el acc va a tener el valor del primer string
                .reduce((acc, el) -> acc + ", " + el );
        var value = names.orElse("No name found");
        System.out.println(value);

        // Segunda forma de utilizar el reduce
        int sumaAges = users.stream()
                .map(x -> x.age)
                // De esta manera el acc va a tener el valor de 0
                .reduce(0, (acc, el) -> acc + el);

        System.out.println(sumaAges);
    }
}

class UserV5 implements Comparable<UserV5> {
    public String name;
    public String surname;
    public int age;

    public UserV5(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public int compareTo(UserV5 o) {
        return 0;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
