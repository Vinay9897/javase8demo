package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Practice2 {

    String name;

    public Practice2(String name) {
        System.out.println(name);
    }
    // Question 5 method overloading , argument datatype should be differnt
    // return type may vary
    // public static double setVar(int a, double d, int c) {
    // return d;
    // }

    // public static int setVar(int a, int b, int c) {
    // return a;
    // }
    public static void main(String[] args) {
        new Practice3("Bob");
        // System.out.println(setVar(2, 4.5, 6));

        // Question 1 Answer:-RuntimeError, java.lang.StringIndexOutOfBoundsException
        // String product = "Pen";
        // product.toLowerCase().concat("BOX".substring(4, 6));
        // System.out.println(product.substring(4, 6));

        // question2
        // String s1 = "abc";
        // String s2 = s1;
        // s1 += "d"; // concade override the string(create a new String)
        // System.out.println(s1 + " " + s2 + " " + (s1 == s2));
        // StringBuffer sb = new StringBuffer("abc");
        // StringBuffer sb2 = new StringBuffer(sb);
        // System.out.println(sb + " " + sb2 + " " +
        // (sb.toString().equals(sb2.toString()))); // return true
        // sb.append("d");
        // System.out.println(sb + " " + sb2 + " " +
        // (sb.toString().equals(sb2.toString()))); // return false,because
        // different object,we cannot matche stringbuilders

        // Question3
        // Answer : RuntimeException, String.length()" because "s1" is null
        // RuntimeException , Bitwise operator used
        // String s1 = "23";
        // if (s1 == null | s1.length() == 0) {
        // System.out.println("String is empty");
        // }

        // Question4
        // Answer:- nothing print , StringBuilder returns true
        // when only when passed the same object as an argument.
        // StringBuilder sb1 = new StringBuilder("Test");
        // StringBuilder sb2 = new StringBuilder("Test");
        // System.out.println("Compare 2 diffent stringbuilder(diff reference) " + (sb1
        // == sb2));
        // System.out.println("Compare 2 diff stringbuilder(diff reference) " +
        // sb1.equals(sb2));// always return false,we can't check stringbuilder with
        // equals

        // Question6
        // Answer :- Primitive variable can be compared with == only
        // int a = 5;
        // int b = 5;
        // System.out.println(a == b);

        // Question7
        // Answer :- CompileTime Error, 2 4
        // float fValue = 23;
        // int ivalue = fValue; // float can't convert to int implicitly
        // double dvalue = fValue;
        // long lvalue = fvalue; // float can't convert to long implicitly

        // Question8
        // this.charAt(k)-anotherString.charAt(k)
        String test = "a";
        // condition: "a" not equal "aaa" so loop doesn't go inside
        for (; test.compareTo("aaa") == 0; test = test + "a") {
            System.out.println(test.length());
        }
        System.out.println(test); // a
        System.out.println(test.compareTo("aaa")); // -2
        System.out.println("z".compareTo("abcd")); // 25
        // System.out.println("d".compareTo("ae")); // 3
        // System.out.println("bcde".compareTo("abcd")); // 1

        // Question 9
        String st = "Java";
        StringBuilder sb = new StringBuilder("Java");
        StringBuffer sbb = new StringBuffer("Java");
        // System.out.println(st == sb);// CTE,Incompatible operand types String and
        // StringBuilder
        // System.out.println(st == sbb);//CTE,Incompatible operand types String and
        // StringBuffer
        // System.out.println(sb == sbb);//CTE,Incompatible operand types StringBuilder
        // and
        // StringBuffer
        // System.out.println(st.equals(sb)); // false
        // System.out.println(st.equals(sbb)); // false
        // System.out.println(sb.equals(sbb)); // false

        // System.out.println(st == sb.toString()); // false ,because reference are not
        // // same
        // System.out.println(st == sbb.toString()); // false

        // System.out.println(sb.toString() == sbb.toString()); // false

        // System.out.println(st.equals(sb.toString())); // true,because equals check
        // // values
        // System.out.println(st.equals(sbb.toString())); // true
        // System.out.println(sb.toString().equals(sbb.toString())); // true

        // StringBuilder s1 = new StringBuilder("a");
        // StringBuilder s2 = s1.append("a");
        // System.out.println("Compare To StringBuilder(same reference) " +
        // (s1.equals(s2))); // true
        // System.out.println("Compare To StringBuilder(same reference) " + (s1 == s2));
        // // true

        // int i = 0, j = 11;
        // do {
        // if (i > j) {
        // break;
        // }
        // j--;
        // System.out.println(i + " " + j);
        // } while (++i < 5);
        // Integer i = new Integer("3");
        System.out.println("String".replace('g', 'g') == new String("String"));// false
        System.out.println("String".replace('g', 'g') == "String"); // true
        // StringBuilder sb = new StringBuilder("stringbuilder");
        // System.out.println(sb.delete(0, sb.length()));
        // List li = new ArrayList();
        // li.add("ds");
        // System.out.println(li); // ds
        // System.out.println(Boolean.valueOf("tRuE") == Boolean.TRUE); // true,
        // valueOf() method ignore the case

        String s = "hi";
        String s4 = "hi";
        String s5 = s4.intern(); // hi
        // //s and t, s.intern() == t.intern() is true if and only if s.equals(t) is
        // true

        System.out.println((s.intern() == s4.intern())); // true
    }
}

class Practice3 extends Practice2 {
    String name;

    public Practice3(String name) {
        super(name);
        System.out.println("Practice3");
    }
}