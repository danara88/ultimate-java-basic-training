package module9;

public class BLambdaExpressions {
    public static void execute() {
        // Expresión lambda: Es una función anónima
        // Es anónima porque no tiene nombre.
        push(message -> System.out.println("Imprimiendo de lamda: " + message));

        // Podemos acceder a variables fuera de una función lamda sin problema
        var texto = "Imprimiendo de lamda: ";
        NotificableV1 lambda = message -> System.out.println(texto + message);
        push(lambda);
    }

    static void push(NotificableV1 n) {
        n.push("Chanchito feliz");
    }
}

interface NotificableV1 {
    void push(String message);
}

class NotificationV1 implements NotificableV1 {
    @Override
    public void push(String message) {
        System.out.println("Enviando desde Notification, " + message);
    }
}
