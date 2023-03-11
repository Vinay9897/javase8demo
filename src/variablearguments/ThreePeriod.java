package variablearguments;

import java.util.Arrays;

public class ThreePeriod {
    // fixedDeposit
    public static int[] fdDetails(int... number) {
        int[] arr = new int[number.length];
        int j = 0;
        for (int val : number) {
            System.out.println(val);
            arr[j++] = val;
        }
        return arr;
    }

    public static void main(String[] args) {
        // ThreePeriod obj1 = new ThreePeriod();
        int[] arr1 = ThreePeriod.fdDetails(10, 20, 30);
        System.out.println(Arrays.toString(arr1));
    }
}
