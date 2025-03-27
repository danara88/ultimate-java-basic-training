package module10;

import java.util.List;
import java.util.stream.Collectors;

public class LGrouping {
    public static void execute() {
        List<UserV8> users = List.of(
                new UserV8(18, "Daniel", "Rodriguez", "rodriguez@gmail.com", Mandos.MEDIO),
                new UserV8(15, "Javier", "Torres", "torres@gmail.com", Mandos.MEDIO),
                new UserV8(21, "Beto", "Jimenez", "jimenez@gmail.com", Mandos.ALTO),
                new UserV8(32, "Alejandro", "Martinez", "martinez@gmail.com", Mandos.ALTO)
        );

        var grouped = users.stream()
                .collect(Collectors.groupingBy(x -> x.mando));

        System.out.println(grouped); // {ALTO=[Beto, Alejandro], MEDIO=[Daniel, Javier]}
    }
}

class UserV8 implements Comparable<UserV8> {
    public String name;
    public String surname;
    public String email;
    public int age;
    public Mandos mando;

    public UserV8(int age, String name, String surname, String email, Mandos mando) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.mando = mando;
    }

    @Override
    public int compareTo(UserV8 o) {
        return 0;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

enum Mandos {
    ALTO,
    MEDIO
}

