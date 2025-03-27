package module10;

import java.util.List;
import java.util.stream.Collectors;

public class JCollectors {
    public static void execute() {
        /**
         * Collectior: Nos proporciona ya funcionaldiades hechas sin la necesidad de usar
         * un reduce.
         */
        List<UserV6> users = List.of(
                new UserV6(18, "Daniel", "Rodriguez", "rodriguez@gmail.com"),
                new UserV6(15, "Javier", "Torres", "torres@gmail.com"),
                new UserV6(21, "Beto", "Jimenez", "jimenez@gmail.com"),
                new UserV6(32, "Alejandro", "Martinez", "martinez@gmail.com")
        );

        var userLists = users.stream()
                .map(x -> x.email)
                .collect(Collectors.joining(" , "));

        var sumAges = users.stream()
                .map(x -> x.age)
                .collect(Collectors.summarizingInt(x -> x));

        var setUsers = users.stream()
                .map(x -> x.email)
                .collect(Collectors.toSet());

        var emailAsKey = users.stream()
                .collect(Collectors.toMap(x -> x.email, x -> x));

        System.out.println("userLists = " + userLists);
        System.out.println("sumAges = " + sumAges.getSum());
        System.out.println("average = " + sumAges.getAverage());
        System.out.println("setUsers = " + setUsers);
        System.out.println("emailAsKey = " + emailAsKey); //  {jimenez@gmail.com=Beto, rodriguez@gmail.com=Daniel, martinez@gmail.com=Alejandro, torres@gmail.com=Javier}
    }
}

class UserV6 implements Comparable<UserV6> {
    public String name;
    public String surname;
    public String email;
    public int age;

    public UserV6(int age, String name, String surname, String email) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    @Override
    public int compareTo(UserV6 o) {
        return 0;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
