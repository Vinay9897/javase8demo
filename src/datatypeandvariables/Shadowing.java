package datatypeandvariables;

import java.util.Arrays;

public class Shadowing {

}

// Reference type Shadowing

// class Bar {
// int barNum = 28;
// }

// class Foo {
// Bar myBar = new Bar();

// void changeIt(Bar myBar) {
// myBar.barNum = 99;
// System.out.println("myBar.barNum in changeIt is " + myBar.barNum);
// myBar = new Bar();
// myBar.barNum = 420;
// System.out.println("myBar.barNum in changeIt is now " + myBar.barNum);
// }

// public static void main(String[] args) {
// Foo f = new Foo();
// System.out.println("f.myBar.barNum is " + f.myBar.barNum);
// f.changeIt(f.myBar);
// System.out.println("f.myBar.barNum after changeIt is "
// + f.myBar.barNum);
// }
// }

// Primitive type
class Foo1 {
    static int size = 7;

    static void changeIt(int size) {
        size = size + 200;
        System.out.println("size in changeIt is " + size);
    }

    public static void main(String[] args) {
        Foo1 f = new Foo1();
        // int size = 90;
        System.out.println("size = " + size);
        changeIt(size);
        System.out.println("size after changeIt is " + size);
        int[] nums = new int[10];
        if (nums instanceof Object) {
            System.out.println("true");
        }

        // final int x = 5;
        // int y = x++;//CTE
        // System.out.println(" " + 7 + 2 + " ");

        // StringBuilder sb = new StringBuilder(10);
        // sb.append("abcdefghijklm");
        // sb.insert(1, "abcdefghijklm");//StringIndexOutOfBoundsException: offset 1,
        // length 0
        // sb.insert(0, true);
        // sb.insert(0, 1l);
        // sb.insert(0, 4.6d);
        // sb.insert(0, 'c');
        // System.out.println(sb.toString());

        // int[] arr = new int[4];
        // arr[0] = 1;
        // arr[1] = 'c';
        // arr[2] = (int) 4.3;
        // arr[3] = 2 & 2;
        // System.out.println(Arrays.toString(arr));

        // int[] arr;
        // int[] spade;
        // int[] king = new int[5];
        // int[] jack = new int[4];
        // arr = king;
        // arr[0] = 1;
        // System.out.println(arr.length);// 5
        // arr = jack;
        // System.out.println(arr.length);// 4

        // String[] strs = new String[5];
        // for (String str : strs)
        // System.out.println(str);

        // char ch = (char) 65;
        // System.out.println(ch);

        // int[][] a = { { 1, 2 }, { 3, 4 } };
        // int[] b = (int[]) a[1];
        // System.out.println(b[0]);
        // Object o = a;
        // int[][] a2 = (int[][]) o;
        // // int[] b2 = (int[]) o;
        // System.out.println(b[1]);

        // byte[][] ba = { { 1, 2, 3, 4 }, { 1, 2, 3 } };

        // String s1 = "abc";
        // String s2 = s1;
        // s1 += "d";
        // System.out.println(s1 + " " + s2 + " " + (s1 == s2));

        // StringBuilder sb1 = new StringBuilder("abc");
        // StringBuilder sb2 = sb1;
        // sb1.append("d");
        // System.out.println(sb1 + " " + sb2 + " " + (sb1 == sb2));

        // int trueInt = 1;
        // int falseInt = 0;
        // if (trueInt)// illegal
        // if (trueInt == true) // illegal
        // if (1) // illegal
        // if (falseInt == false) // illegal
        // {}
        // if (trueInt == 1) // legal
        // {}
        // if (falseInt == 0) //legal
        // {}

        // boolean boo = false;
        // if (boo = true) {
        // }
        doStuff();
    }

    static boolean doStuff() {
        for (int x = 0; x < 3; x++) {
            System.out.println("in for loop");
            return true;
        }
        return true;
    }

}

// reference type problem
// class Fizz {
// int x = 5;
// int y = 7;

// public static void main(String[] args) {
// Fizz f1 = new Fizz();
// Fizz f2 = new Fizz();
// Fizz f3 = FizzSwitch(f1, f2);
// System.out.println((f2 == f3) + " " + (f2.y == f3.y));
// }

// static Fizz FizzSwitch(Fizz x, Fizz y) {
// final Fizz z = x;
// final Fizz k = y;
// z.x = 6;
// k.y = 6;
// return k;
// }
// }

// class Mirror {
// int size = 7;

// public static void main(String[] args) {
// Mirror m1 = new Mirror();
// Mirror m2 = m1;
// int i1 = 10;
// int i2 = i1;
// go(m2, i2);
// System.out.println(m1.size + " " + i1 + " " + i2);
// }

// static void go(Mirror m, int i) {
// m.size = 8;
// i = 12;
// }
// }

// class Wind {
// int id;

// Wind(int i) {
// id = i;
// }

// public static void main(String[] args) {
// new Wind(3).go();
// // commented line
// }

// void go() {
// Wind w1 = new Wind(1);
// Wind w2 = new Wind(2);
// System.out.println(w1.id + " " + w2.id);
// }
// }

// class Happy {
// int id;

// Happy(int i) {
// id = i;
// }

// public static void main(String[] args) {
// Happy h1 = new Happy(1);
// Happy h2 = h1.go(h1);
// System.out.println(h2.id);
// }

// Happy go(Happy h) {
// Happy h3 = h;
// h3.id = 2;
// h1.id = 3;
// return h1;
// }
// }

// class Ouch {
// static int ouch = 7;

// public static void main(String[] args) {
// new Ouch().go(ouch);
// System.out.print(" " + ouch);
// }

// void go(int ouch) {
// ouch++;
// for (int ouc = 3; ouc < 6; ouc++)
// ;
// System.out.print(" " + ouch);
// }
// }
