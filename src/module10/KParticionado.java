package module10;

import java.util.List;
import java.util.stream.Collectors;

public class KParticionado {
    public static void execute() {
        List<UserV7> users = List.of(
                new UserV7(18, "Daniel", "Rodriguez", "rodriguez@gmail.com"),
                new UserV7(15, "Javier", "Torres", "torres@gmail.com"),
                new UserV7(21, "Beto", "Jimenez", "jimenez@gmail.com"),
                new UserV7(32, "Alejandro", "Martinez", "martinez@gmail.com")
        );

        var result = users.stream()
                // logica para dividir nuestros usuarios
                .collect(Collectors.partitioningBy(x -> x.age > 18));

        System.out.println("result = " + result.get(true));
    }
}

class UserV7 implements Comparable<UserV7> {
    public String name;
    public String surname;
    public String email;
    public int age;

    public UserV7(int age, String name, String surname, String email) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    @Override
    public int compareTo(UserV7 o) {
        return 0;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
