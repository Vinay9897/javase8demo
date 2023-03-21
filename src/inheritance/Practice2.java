package inheritance;

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
        // if (sb1 == sb2)
        // System.out.println("Same");
        // if (sb1.equals(sb2))
        // System.out.println("Equals");

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
        // String test = "ad";
        // condition: "a" not equal "aaa" so loop doesn't go inside
        // for (; test.compareTo("aaa") == 0; test = test + "a") {
        // System.out.println(test.length());
        // }
        // System.out.println(test); // a
        // System.out.println(test.compareTo("abcd")); // 2
        System.out.println("d".compareTo("ae")); // 3
        System.out.println("bcde".compareTo("abcd")); // 1
    }
}

class Practice3 extends Practice2 {
    String name;

    public Practice3(String name) {
        super("vinay");
        System.out.println("Practice3");
    }
}