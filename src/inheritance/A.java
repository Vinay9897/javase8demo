package inheritance;

import java.util.*;

interface D {
    public void define();
}

public class A {
    static int a = 1;

    // constructor
    A() {
        System.out.println("Constructor A");
    }

    // if the method visibility is private then it is not accessible
    // public static void display() {
    // System.out.println("Display method in A");
    // }

}

class B extends A implements D {
    // static int a = 9;

    B() {
        System.out.println("constructor B");
        display();
    }

    // this method has no connection with parent method
    public static final void display() {
        System.out.println("method B");
    }

    @Override
    public void define() {
        System.out.println("define in B");
    }

    public static void main(String[] args) {

        B b = new B();
        b.display();
        String s = null;
        System.out.println(s);
        List<Double> list = new ArrayList<Double>();
        list.add(Math.PI);
        list.add(new Random().nextDouble());
        System.out.println(list);
        int a = 3;
        a = ++a + a++;
        a = --a - a--;
        System.out.println(a);
        String digit = "0123456789";
        System.out.println((digit.indexOf("4")));
        List<Integer> list1 = new ArrayList<>(2);
        list1.add(0);
        list1.add(0);
        list1.add(0);

        for (int x : list1)
            System.out.print(x + " ");
    }
}

// learn
// Constructor Overriding
// Method Overriding
class Base {
    public Base(String name) {
        System.out.println(name + " in BaseClass");
    }

    public void method(int a) {
        System.out.println("Base method");
    }

    public static void method2() {
        System.out.println("base method 2");
    }
}

class Derived extends Base {

    public Derived(String name) {
        super(name);
        System.out.println(name);
    }

    private static void method() {
        System.out.println("Derived method");
    }

    // public static void method2() {
    // System.out.println("derived method 2");
    // }

    public static void main(String[] args) {
        // System.out.println(B.a);
        Base b = new Base("BaseName"); // only base constructor invoked
        method2();
        b.method(2);

        // System.out.println("*********************************");
        // Derived d = new Derived("DerivedName"); // parent constructor then child
        // constructor invoked
        // // method2();

        System.out.println("*********************************");
        Base db = new Derived("DerivedName");// parent constructor then child
        // constructor invoked
        method2();
        method();
    }
}
