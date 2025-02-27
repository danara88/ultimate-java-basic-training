package module9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class IPredicates {
    public static void execute() {
        // Predicates: Devuleve un boolean y recibe una condicion
        Predicate<String> masDeTres = x -> x.length() > 3;

        var resultado = masDeTres.test("Chanchito feliz");

        System.out.println(resultado);

        List<String> l = new ArrayList<String>();
        Collections.addAll(l, "Felipe", "Daniel", "Lc");

        var filtrado = l.stream().filter(masDeTres);
        System.out.println("Filtrado: " + filtrado.toList());
    }
}
