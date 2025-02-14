package module2;

public class BLogicOperators {
    public static void execute() {
        boolean a = true;
        boolean b = false;

        boolean c = a || b;
        boolean d = a && b;

        System.out.println(c);
        System.out.println(d);

        // Si el valor es falso, la transforma a true o viceversa
        boolean x = !a;
        System.out.println(x);
    }
}
