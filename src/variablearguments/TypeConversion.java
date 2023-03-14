package variablearguments;

public class TypeConversion {
    static double num4 = 23d;
    static long num3 = 32357354;
    static float num2 = 23;
    static int num1 = 3;
    static short num = 2;

    public static void main(String[] args) {
        num = (short) num1;
        num1 = (int) num2;
        num2 = num3;
        num3 = (long) num2;

        System.out.println("********Before Type Conversion****************");
        System.out.println("short : " + num + " int : " +
                num1 + " float : " + num2 + " long : " + num3 + " double : " + num4);
        System.out.println("********After Type Conversion****************");
        System.out.println("short : " + num + " int : " +
                num1 + " float : " + num2 + " long : " + num3 + " double : " + num4);
    }
}
