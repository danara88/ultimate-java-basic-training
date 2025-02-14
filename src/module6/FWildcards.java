package module6;

import java.util.ArrayList;

public class FWildcards {
    public static void execute() {
        System.out.println(Utils.max(4.2,2.3));
    }
}

class Utils {
    // Generic method
    public static <T extends Number> T max(T a, T b) {
        return a.doubleValue() > b.doubleValue() ? a : b;
    }

    // Wilcards: Nos ayuda a definir genéricos más facil
    // Desventaja: No puedes acceder al tipo T especificado.
    // Se prefiere mejor trabajar con Genericos, ya que ahi tenemos type safety y
    // podemos acceder al tipo.
    public static void sorter(MyListV3<? extends AttendableV3> list) {
        // Podemos obtener elementos de la lista: MyListV3<? extends Attendable> list
        // Pero no podemos añadir elementos a la lista. Mejor usar: MyListV3<? super Attendable> list
    }
}

class MyListV3<T> {
    private final ArrayList<T> _data;

    public MyListV3() {
        _data = new ArrayList<>();
    }

    public MyListV3<T> add(T t) {
        _data.add(t);
        return this;
    }

    public T get(int index) {
        return _data.get(index);
    }
}

interface AttendableV3 {
    void attend();
}
