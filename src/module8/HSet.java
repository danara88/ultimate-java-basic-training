package module8;

import java.util.*;

public class HSet {
    public static void execute() {
        /**
         * Los sets te garantizan que no haya elementos duplicados dentro.
         * NO TE GARANTIZAN UN ORDENAMIENTO.
         * Para ordernarlo mejo crear una coleccion, ordenarlos y luego pasarlos por un set.
         * El HashSet solo acepta Collections en su Constructor
         */
        Set<String> conjunto = new HashSet<>(Arrays.asList("Lunes", "Martes", "Miercoles", "Jueves", "Viernes"));
        conjunto.add("Sabado");
        conjunto.remove("Sabado");

        Collection<String> names = new ArrayList<>();
        names.add("Daniel");

        Set<String> conjuntoV2 = new HashSet<>(names);

        System.out.println(conjunto);
        System.out.println(conjuntoV2);

        Set<String> conjuntoV1 = new HashSet<>(Arrays.asList("Viernes","Sabado","Domingo"));

        // Union
        // Agrega los elementos a otro conjubnto solo los que no se repiten
        // conjunto.addAll(conjuntoV1);
        // System.out.println(conjunto);

        // Difference
        // conjunto -> [Miercoles, Martes, Viernes, Lunes, Domingo, Jueves, Sabado]
        // conjunto.removeAll(conjuntoV1);
        // System.out.println(conjunto); // [Miercoles, Martes, Lunes, Jueves]

        // Intersection
        conjunto.retainAll(conjuntoV1);
        System.out.println(conjunto); // Viernes
    }
}
