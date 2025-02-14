package module1;

public class APrimitiveAndReferenceTypes {
    public static void execute() {
        // Primitive types: Data types that stores a value
        // Predefined and built into the language
        // Typically those starts with lower case.
        byte age = 20;
        int bigNumber = 1000;
        float bigFloat = 100000.22f;
        double bigDouble = 100000.24d;
        boolean isActive = true;
        char gender = 'M';

        System.out.println(age);
        System.out.println(bigNumber);
        System.out.println(bigFloat);
        System.out.println(bigDouble);
        System.out.println(isActive);
        System.out.println(gender);

        // Reference types: Store references to objects
        // Types created by the programmer. Except String
        // Typically those starts with capital letter.
        // Ex. Strings, Classes, Arrays, etc

        // Strings are immutable
        String name = "John"; // Literal String
        int total = name.length();
        System.out.println(total);
        String replacedText = name.replace("John", "hello");
        System.out.println(replacedText);
    }
}
