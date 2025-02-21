package module8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FComparatorClass {
    public static void execute() {
        /**
         * Comparator: Es una clase que nos permite cambiar el algoritmo que se utiliza para
         * comparar dos elementos
         */
        List<EjemploComparableV2> lista = new ArrayList<EjemploComparableV2>();
        lista.add(new EjemploComparableV2("Felipe", 30));
        lista.add(new EjemploComparableV2("Chanchito feliz", 22));

        // Ordernar el listado
        Collections.sort(lista, new Comparator<EjemploComparableV2>() {
            @Override
            public int compare(EjemploComparableV2 o1, EjemploComparableV2 o2) {
                return o1.getEdad().compareTo(o2.getEdad());
            }
        });

        System.out.println(lista);
    }
}

class EjemploComparableV2 implements Comparable<EjemploComparableV2> {
    private String nombre;
    private Integer edad;

    public EjemploComparableV2(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Necesario para poder comparar elementos.
     */
    @Override
    public int compareTo(EjemploComparableV2 otro) {
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
