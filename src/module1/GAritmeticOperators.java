package module1;

public class GAritmeticOperators {
    public static void execute() {
        int sum = 2 + 2;
        int substraction =  2 - 1;
        int multiple = 2 * 2;
        float division = 2f / 333f; // double division = 2.0 / 3.0 This will change to double automatically
        int module = 2 / 2;

        int i = 5;
        ++i; // Increment in one
        i++; // Increment in one

        // First the i will increment in one and then the values is passed to println method
        System.out.println(++i);

        // First the value of i will be taken and then it will be passed to println method and the value will be increased.
        System.out.println(i++);

        int x = 5;
        int y = x++;

        System.out.println(x);
        System.out.println(y);

        System.out.println(sum);
        System.out.println(substraction);
        System.out.println(multiple);
        System.out.println(division);
        System.out.println(module);
    }
}
