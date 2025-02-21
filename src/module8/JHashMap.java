package module8;

import java.util.HashMap;
import java.util.Map;

public class JHashMap {
    public static void execute() {
        Map<String, String> myMap = new HashMap<>();

        myMap.put("daniel@ddaniel.com", "Daniel Aranda");
        myMap.put("felipe@felipe.com", "Felipe Hernandez");
        myMap.put("fernando@fernando.com", "Fernando Herrera");

        System.out.println(myMap.get("daniel@ddaniel.com"));

        myMap.remove(("daniel@ddaniel.com"));

        System.out.println(myMap.get("daniel@ddaniel.com")); // null

        // Si la primera llave retorna null, entonces devulveme un valor default
        System.out.println(myMap.getOrDefault("daniel@ddaniel.com", "Default value"));

        System.out.println(myMap.containsKey(("daniel@ddaniel.com")));

        myMap.replace("felipe@felipe.com", "Felipe Updated"); // Remplazar el valor de una llave

        System.out.println(myMap.get("felipe@felipe.com"));

        // Itera cada una de las llaves
        for(var key : myMap.keySet()) {
            System.out.println(key);
        }

        // Itera cada uno de los valores
        for(var value : myMap.values()) {
            System.out.println(value);
        }

        // Iterar cada uno de los pares del hash map
        for(var entry : myMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
