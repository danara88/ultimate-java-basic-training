package module9;

import java.util.function.Predicate;

public class JPredicateCompose {
    public static void execute() {
        Predicate<String> tieneAt = s -> s.contains("@");
        Predicate<String> minSeis = s -> s.length() > 5;
        Predicate<String> dominioTinenePunto = s -> {
            var at = s.indexOf("@");
            if (at == -1) {
                return false;
            }

            var dominio = s.substring(at);
            System.out.println(dominio);

            return dominio.indexOf(".") > 1 && dominio.length() > 4;
        };

        var nuevoPredicate = tieneAt.and(minSeis).and(dominioTinenePunto);

        System.out.println(nuevoPredicate.test("holamundo@gmail.com"));
    }
}
