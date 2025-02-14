package module1;

import java.util.Arrays;

public class CArrays {
    public static void execute() {
        int[] ages = new int[4];
        System.out.println(Arrays.toString(ages));

        ages[0] = 17;
        ages[1] = 18;
        ages[2] = 19;
        ages[3] = 20;
        System.out.println(Arrays.toString(ages));
        System.out.println(ages.length);

        Arrays.sort(ages); // Mutable operation
        System.out.println(Arrays.toString(ages));

        // New way to define arrays
        int[] agesV2  = {16, 17, 18, 19};
        // agesV2[5] = 30; // Not allowed
        System.out.println(Arrays.toString(agesV2));
    }
}
