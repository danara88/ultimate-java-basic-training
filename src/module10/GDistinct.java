package module10;

import java.util.List;

public class GDistinct {
    public static void execute() {
        List<UserV3> users = List.of(
                new UserV3(18, "Daniel", "Rodriguez"),
                new UserV3(15, "Javier", "Torres"),
                new UserV3(21, "Beto", "Jimenez"),
                new UserV3(15, "Javier", "Torres")
        );

        // Eliminar los duplicados
        users.stream()
                .map(x -> {
                    System.out.println(x.surname); // En lugar de hacer esto, es mejor usar el método "peek()"
                    return x.name;
                })
                .distinct() // Elimina todos los elementos duplicados dentro de un stream

                // Este método nos sirve para inspeccionar
                .peek(System.out::println) // Nos permite realizar una operacion en el pipeline, sin modificar el funcionamiento
                .forEach(System.out::println);
    }
}

class UserV3 implements Comparable<UserV3> {
    public String name;
    public String surname;
    public int age;

    public UserV3(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public int compareTo(UserV3 o) {
        return 0;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
