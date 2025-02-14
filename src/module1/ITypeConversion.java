package module1;

public class ITypeConversion {
    public static void execute() {
        byte a = 1; // Different data type
        int b = 15; // Different data type

        /**
         * Implicit cast:
         * This will be allowed because Java first look into both variables data types and the data type of the variable:
         * a is a byte (1 byte) and b is an int (4 bytes). Then Java will pass the
         * smallest data type (the byte) and it will be passed to the longest one (int)
         */
        // byte -> short -> int -> long -> float -> double
        int c = a + b;
        System.out.println(c);

        // Explicit cast
        int x = 15;
        double y = 15.015;
        int z =  (int)(x + y);
        System.out.println(z);

        int w = x + (int) y;
        System.out.println(w);

        String j = "1.1";
        int k = 5;
        double l  = Double.parseDouble(j) + k;
        // Integer.parseInt()
        System.out.println(l);
    }
}
