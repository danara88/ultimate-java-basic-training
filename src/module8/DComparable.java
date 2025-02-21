package module8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DComparable {
    public static void execute() {
        /**
         * Comparable: Es una interfaz que nos permite ordenar elementos de una colección.
         */
        List<EjemploComparable> lista = new ArrayList<EjemploComparable>();
        lista.add(new EjemploComparable("Felipe"));
        lista.add(new EjemploComparable("Chanchito feliz"));

        // Ordernar el listado
        Collections.sort(lista);

        System.out.println(lista);
    }
}

class EjemploComparable implements Comparable<EjemploComparable> {
    private String nombre;

    public EjemploComparable(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Necesario para poder comparar elementos.
     */
    @Override
    public int compareTo(EjemploComparable otro) {
        // Comprar el nombre (comparar un string con otro string)
        return this.nombre.compareTo(otro.nombre);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
