package module8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ACollections {
    public static void execute() {
        Collection<Number> collection = new ArrayList<>();

        // Añadir un elemento a la colección
        collection.add(1);

        // Añadir elementos con un solo metodo
        Collections.addAll(collection, 2, 3, 4, 5);

        // Remueve un elmento de la lista
        collection.remove(1);

        System.out.println(collection);

        // Transformar una colección a un arreglo
        Number[] arrayOfElements = collection.toArray(new Number[4]);

        // Verificar si la coleccion esta vacía
        System.out.println(collection.isEmpty());

        // Limpia la colección
        collection.clear();

        Collection<Number> collectionV2 = new ArrayList<>();
        collectionV2.add(1); // Esto hace que el collection sea diferente a collectionV2

        // Comparar dos colecciones
        var areEqual = collection.equals(collectionV2);

        System.out.println(areEqual);

        // Concatenar dos colecciones
        collection.addAll(collectionV2);
    }
}
