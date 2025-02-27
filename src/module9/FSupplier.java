package module9;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Supplier;

public class FSupplier {
    public static void execute() {
        List<String> l = List.of("12A23BC672", "A68G67JG5D", "OSH84NDJ");

        // Supplier: No recibe argumentos, pero devuelve un valor
        Supplier<LocalDate> ahora = LocalDate::now;

        // La interfaz Supplier tiene un método llamada "get".
        // Cuando se llama get, es cuando now se ejecuta.
        // También nos ayuda a retrasar la ejecución de un método y cuando ocupamos
        // que un dato sea preciso.
        System.out.println(ahora.get());
    }
}
