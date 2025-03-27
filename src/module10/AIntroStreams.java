package module10;

import java.util.List;

public class AIntroStreams {
    public static void execute() {
        List<User> users = List.of(
                new User(18, "Daniel", "Rodriguez"),
                new User(15, "Javier", "Torres"),
                new User(21, "Beto", "Jimenez")
        );

        // Forma tradicional para contar ciertos elementos dentro de un array
        // incluyendo una condición.
        // Programación imperativa: Le decimos al código cómo queremos
        // que se haga la operación.
        int count = 0;
        for(User user : users) {
            if (user.age < 18) {
                count++;
            }
        }

        // Programación delarativa: No le indicamos cómo queremos realizar la operación.
        // Simplemente indicamos qué es lo que queremos que haga.
        // Transforma nuesta lista en una cañería. Le agregamos una cañería.
        // Para que al final nos devuelva un objeto deseado.
        var names = users.stream()
                .map(user -> user.name)
                .toList();

        var adults = users.stream()
                .filter(user -> user.age >= 18)
                .count();

        System.out.println(names);
        System.out.println(adults);
    }
}

class User {
    public String name;
    public String surname;
    public int age;

    public User(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }
}
