package inheritance;

import java.util.*;

interface D {
    public void define();
}

class A {
    A() {
        System.out.println("A");
    }

    public final void display() {
        System.out.println("Display method in A");
    }

}

class B extends A implements D {
    B() {
        // super();
        System.out.println("B");
        super.display();
    }

    public void define() {
        System.out.println("define");
    }

    public static void main(String[] args) {
        B b = new B();
        b.define();
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

// class Base {
// public Base(String name) {
// System.out.println(name);
// }

// public static void method(int a) {
// System.out.println("Base method");
// }
// }

// class Derived extends Base {

// public Derived(String name) {
// super(name);
// System.out.println("Derived method");
// }

// public static void method() {
// System.out.println("Derived method");
// }

// public static void main(String[] args) {
// new Derived("Bob");
// }
// }
