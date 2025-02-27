package module9;

public class CReferenceMethods {
    public static void execute() {
        // Podemos pasar una función lambda
        push(message -> metodo(message));

        // Otra manera: Podemos pasar la referencia del método
        push(Demo::metodoInstanciaStatic);

        // Pasando una referencia de un metodo
        // Si agregamos los (), estaríamos ejecutandolo.
        // Aquí solo queremos la referencia
        push(System.out::println);

        // Cuando tenemos un constructor
        Demo demo = new Demo("mi mensaje");
        push(demo::metodoInstancia);

        // Manera equivalente cuando tenemos un constructor
        push(Demo::new);
    }

    static void metodo(String message) {

    }

    static void push(NotificableV3 n) {
        n.push("Chanchito feliz");
    }
}

// Interfaz funcional
interface NotificableV3 {
    void push(String message);
}

class Demo {

    public Demo(String messgage) {

    }

    public static void metodoInstanciaStatic(String message) {

    }

    public void metodoInstancia(String message) {

    }
}
