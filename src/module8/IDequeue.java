package module8;

import java.util.ArrayDeque;
import java.util.Deque;

public class IDequeue {
    public static void execute() {
        /**
         * Dequeue: Estrutura de datos que nos permite sacar elementos
         * del inicio y del final.
         */
        Deque<String> q = new ArrayDeque<>();
        q.addFirst("Goku");
        q.addFirst("Vegetta");
        q.addLast("Freezer");
        q.addLast("Cell");

        System.out.println(q);

        q.removeFirst();
        System.out.println(q);

        q.removeLast();
        System.out.println(q);

        q.pollFirst(); // Si no queremos que nos lance una excepcion, usemos esto
        q.pollLast();  // Si no queremos que nos lance una excepcion, usemos esto
    }
}


