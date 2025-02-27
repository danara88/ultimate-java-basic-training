package module9;

import java.util.List;
import java.util.function.Consumer;

public class DConsumer {
    public static void execte() {
        List<String> l = List.of("12A23BC672", "A68G67JG5D", "OSH84NDJ");

        // Consumer: La interfaz retorna void y recibe un parámetro
        //  l.forEach(el -> System.out.println(el));
        l.forEach(System.out::println);
        l.forEach(DConsumer::sendPush);

        // Podemos encadenar funciones. Cuando termine una, inmediatamente
        // la otra se ejecuta.
        Consumer<String> notify = el -> System.out.println("Enviando a, " + el);
        Consumer<String> store = el -> System.out.println("Guardando");

        // Esto es un encadenamiento
        l.forEach(notify.andThen(store));
    }

    public static void sendPush(String id) {
        System.out.println("Envidando notificación push, " + id);
    }
}
