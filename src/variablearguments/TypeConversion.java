package variablearguments;

public class TypeConversion {
    static double num4 = 23d;
    static long num3 = 32357354;
    static float num2 = 23;
    static int num1 = 3;
    static short num = 2;

    public static void main(String[] args) {
        // num = (short) num1;
        // num1 = (int) num2;
        // num2 = num3;
        // num3 = (long) num2;
        // long x = (long) 88843.57; // Line 1
        // float y = x; // Line 2
        // double z = x + y; // Line 3
        // System.out.println(z);

        // System.out.println("********Before Type Conversion****************");
        // System.out.println("short : " + num + " int : " +
        // num1 + " float : " + num2 + " long : " + num3 + " double : " + num4);
        // System.out.println("********After Type Conversion****************");
        // System.out.println("short : " + num + " int : " +
        // num1 + " float : " + num2 + " long : " + num3 + " double : " + num4);

        // int i = 1, j = -1;
        // switch (i) {
        // case 0, 1:
        // j = 1;

        // case 2:
        // j = 2;
        // break;
        // default:
        // j = 0;
        // }
        // System.out.println("j=" + j);

        // int f = 12;
        // switch (f) { // Line 1
        // case 9 + 1:
        // System.out.println("Twelve"); // Line 2
        // case 0:
        // System.out.println("Zero"); // Line 3
        // case (int) 12.0:
        // System.out.println("Decimal");
        // case 11:
        // System.out.println("Eleven");
        // default:
        // System.out.println("Default");
        // }

        int[] arr[] = new int[2][];
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[0][0] = 1;
        // arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
