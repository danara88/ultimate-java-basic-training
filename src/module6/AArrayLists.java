package module6;

import java.util.ArrayList;
import java.util.Arrays;

public class AArrayLists {
    public static void execute() {
        String[] numerosEnString = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

        // Array Lists es un arreglo dinámico
        var texts = new ArrayList<String>(Arrays.asList(numerosEnString));
        // texts.addAll(Arrays.asList(numerosEnString));

        // texts.add("Daniel");
        // texts.add("Gerardo");

        var firstElement = texts.getFirst();
        var lastElement = texts.getLast();
        var element = texts.get(1);

        System.out.println("element = " + texts);
        System.out.println("firstElement = " + firstElement);
        System.out.println("lastElement = " + lastElement);
        System.out.println("element = " + element);
    }
}