package datatypeandvariables;

import java.util.*;

public class DataDemo {
    static float c;
    static double d;
    // int x = 1, y = x + 1, z;
    // int j, k = j + 1, m = 1;

    public static void main(String[] args) {
        System.out.println("Byte.MIN_VALUE :" + Byte.MIN_VALUE + " Byte.MAX_VALUE :" + Byte.MAX_VALUE);
        Byte x = Byte.MAX_VALUE; // x = 127
        // x += 5; //operator += is undefined for the argument type(s) Byte, int
        System.out.println(++x); // -127
        System.out.println(++x); // -126
        System.out.println(++x); // -125

        x = Byte.MIN_VALUE; // x = -128 // java.lang.Number
        System.out.println(x); // -128
        System.out.println(--x);// 127
        System.out.println(--x);// 126
        System.out.println(--x);// 125

        System.out.println("***************Integer***************");
        System.out.println("Integer.MIN_VALUE : " + Integer.MIN_VALUE + " Integer.MAX_VALUE : " + Integer.MAX_VALUE);
        int a = 5; // integer literal
        // Hexadecimal Values
        a = 0xF; // 15
        a = 0xFF;// 255
        a = 0XFFF;// 4095
        System.out.println("Float.MIN_VALUE : " + Float.MIN_VALUE + " Float.MAX_VALUE : " + Float.MAX_VALUE);
        // 32 bit, Float have precision of 7 digits
        System.out.println("Double.MIN_VALUE : " + Double.MIN_VALUE + " Double.MAX_VALUE : " + Double.MAX_VALUE);
        // 64 bit, Double have precision of 15-16 digit

        // If value doesn't intialised will give compile time error(in methods)
        System.out.println("Float default : " + c);
        System.out.println("Double defalut : " + d);
        c = 3.1434890548308438208430f; // Float have precision of 7 digits
        d = 3.1483408482803543850348; // Double have precision of 15-16 digits
        System.out.println("Float : " + c);
        System.out.println("Double : " + d);
        System.out.println(10 / 2);// integral division
        // System.out.println(10 / 0); arithmetic Exception
        System.out.println(0 / 0.0); // NaN
        System.out.println(-10 / 2); // -5
        System.out.println(8 % 2.5); // 0.5
        System.out.println(10 / 4.0); // real division //2.5
        System.out.println(10 / 0.0); // Infinity
        System.out.println(-10 / 0.0);// -Infinity

        System.out.println("***************Anamoly in Floating data***************");
        double x1 = .1;
        double x2 = .2;
        double sum = x1 + x2;
        System.out.printf("x1 + x2 = %f sum = %f equal= %b %n ", x1 + x2, sum, (x1 +
                x2 == sum));
        if (sum == .3) {
            System.out.println("yes");
        } else {
            System.out.println("yes, but actually No");
        }
        System.out.println("***************Character***************");
        char symbol = '\0'; //
        symbol = '\''; // '
        symbol = (char) 0; //
        symbol = '\\'; // \
        symbol = '\"'; // "
        System.out.println(symbol);
        System.out.println("***************String***************");// io
        String firstName = "Vinay";
        String lastName = "Yadav";
        String fullName = String.format("%s %s", firstName, lastName); // java.util.Formatter
        System.out.printf("Your full name is %S%n", fullName); // java.io.PrintStream
        System.out.println("******Integral with Underscore************");
        double num1 = 2.718; // 2.718
        // double num2 = 2._718; // incorrect, underscore used b/w digits only
        double num3 = 2.7_1_8; // 2.718
        // double num4 = _2.718; // incorrect ,underscore used b/w digits only
        System.out.printf("num1 = %f, num3 = %f%n", num1, num3);

        // double num5 = 0, num6 = 0;
        // System.out.println(num5);
        // byte a1 = 3;
        // byte b = 8;
        // byte c = (byte) (a1 + b);
        // System.out.println(c);
        // int f = (int)3902.493;
        int f = 2123089900;
        short i = (byte) Short.MAX_VALUE + 9;
        System.out.println(i);
        byte b = (byte) 300l;

    }
}
