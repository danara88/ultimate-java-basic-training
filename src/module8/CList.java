package module8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CList {
    public void execute() {
        List<Integer> list = new ArrayList<>();

        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10);

        // Obteer un elemento por su indice
        var element = list.get(2);
        System.out.println(element);

        // Obtener el indice donde se encuentra un numero
        var elementIndexOf = list.indexOf(10);
        System.out.println(elementIndexOf);
        var lastElementIndexOf = list.lastIndexOf(10);
        System.out.println(lastElementIndexOf);

        // Crear una lista (el indice 2 no lo saca)
        System.out.println(list.subList(0, 2));
        System.out.println(list); // El sublist es inmutable
    }
}
