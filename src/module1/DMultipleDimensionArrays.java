package module1;

import java.util.Arrays;

public class DMultipleDimensionArrays {
    public static void execute() {
        // Array of arrays
        int[][] nums = { { 0, 1 }, { 2, 3 }, { 4, 5 } };
        System.out.println(Arrays.deepToString(nums));

        // 3 x 2
        int[][] numsV2 = new int[3][2];
        // 1 row and 1 column
        numsV2[0][0] = 5;

        // 2 row and 1 column
        numsV2[1][0] = 1;

        System.out.println(Arrays.deepToString(numsV2));
    }
}
