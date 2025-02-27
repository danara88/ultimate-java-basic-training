package module9;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class KUnaryAndBinaryOperators {
    public static void execute() {
        // Unary operator: Es una expresion lmabda que el tipo de dato que recibe tambiel lo retorna.

        // <Integer, Integer> Es muy repetitivo
        Function<Integer, Integer> incrementar = a -> a + 2;

        UnaryOperator<Integer> incrementar2 = a -> a + 2;

        // Binary operator: Recibe solo un generico, recibe dos argumentos y devuelve el mismo generico
        BinaryOperator<Integer> multiplicar = (a, b) -> a * b;

        var r = multiplicar.apply(1, 2);

        System.out.println(r);
    }
}
