package module8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GComparatorInterface {
    public static void execute() {
        List<EjemploComparableV3> lista = new ArrayList<EjemploComparableV3>();
        lista.add(new EjemploComparableV3("Felipe", 15));
        lista.add(new EjemploComparableV3("Chanchito feliz", 22));

        // Ordernar el listado
        Collections.sort(lista, new EdadComparator());

        System.out.println(lista);
    }
}


/**
 * Implementando la interfaz comparator.
 * Si tenemos que comparar objetos muchas veces en la app
 * es mejor crear una clase que implemente Comparator para reutilizarla.
 */
class EdadComparator implements Comparator<EjemploComparableV3> {
    @Override
    public int compare(EjemploComparableV3 o1, EjemploComparableV3 o2) {
        return o1.getEdad().compareTo(o2.getEdad());
    }
}

class EjemploComparableV3 implements Comparable<EjemploComparableV3> {
    private String nombre;
    private Integer edad;

    public EjemploComparableV3(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Necesario para poder comparar elementos.
     */
    @Override
    public int compareTo(EjemploComparableV3 otro) {
        // Comprar el nombre (comparar un string con otro string)
        return this.nombre.compareTo(otro.nombre);
    }

    @Override
    public String toString() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }
}
