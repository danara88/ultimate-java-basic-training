package module9;

public class AAnonimumClasses {
    public static void execute() {
        push(new Notification());

        // Clases anónimas
        // Usar la clase anónima si solo la utilizaremos una sola vez.
        push(new Notificable() {
            @Override
            public void push(String message) {
                System.out.println("Enviado desde clase anónima " + message);
            }
        });
    }

    static void push(Notificable n) {
        n.push("Chanchito feliz");
    }
}

// Necesitamos una interfaz funcional
// para trabajar con expresiones lambda.
interface Notificable {
    // Tiene que tener una y exclusivamente un método abstracto
    void push(String message);
}

class Notification implements Notificable {
    @Override
    public void push(String message) {
        System.out.println("Enviando desde Notification, " + message);
    }
}