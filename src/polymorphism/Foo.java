package polymorphism;

import java.io.IOException;

public class Foo {

    // static
    static int a = 6;

    // overload doStuff
    public void doStuff(int y, String s) {
        System.out.println(s);
    }

    // overrride
    public void eat() throws Exception {
        // throws an Exception
    }

    // constructor
    Foo() {

    }

    public Foo(String foodName) {
        System.out.println("Foo");
    }

}

class Bar extends Foo {

    // non-parameterized constructor
    Bar() {
    }

    // constructor
    public Bar(String foodName) {
        System.out.println("Bar");
        // TODO Auto-generated constructor stub
    }

    // Overload doStuff
    public void doStuff(int y, long s) throws IOException {
    }

    // override
    public void eat() {
        /* no Exceptions */}

    public static void main(String[] args) { // exception effect only those class, in which they
        // occur

        new Bar("Barr");
        // static
        a = 8;
        System.out.println(a);

        // overload
        Foo f = new Bar();
        Bar b = new Bar();
        f.doStuff(2, "s");
        // b.doStuff(2, 4); // IOException

        // override
        Foo a = new Bar();
        Bar d = new Bar();
        d.eat(); // ok
        // a.eat(); //compile time error

    }
}

class Animal {
    public static void eat() {
        System.out.println("Generic Animal Eating Generically");
    }
}

class Horse extends Animal {
    public static void eat() { // whoa! - it's private!
        System.out.println("Horse eating hay, oats, "
                + "and horse treats");
    }

    public void eat(String s) {
        System.out.println("Eating horse" + s);
    }

    public void buck() {
    }

    public static void main(String[] args) {
        Animal ani = new Animal();
        Animal hor = new Horse();// Animal reference, Horse Object
        Horse horr = new Horse();
        // ani.buck();// because doesn't have buck()
        ani.eat();
        hor.eat();
        horr.eat();
    }
}
