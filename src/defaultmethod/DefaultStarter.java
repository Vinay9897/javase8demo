package defaultmethod;
// Rule 1: Classes always win. A method defined in the class or its superclass takes 

//precedence over the default method definition that is available in the interface.

// Rule 2: Otherwise, sub-interfaces win: the method with the exact signature
// in the most specific default-functionality providing interface will be selected.

// Rule 3: If the choice continues to be ambiguous, the class that inherits multiple
// interfaces should explicitly select the default method implementation to be used just
// by overriding it and the overridden method should have an explicit call to the desired default behavior.

// interface can't have protected and private methods
//interface
interface Greeting {
    default void hello() {
        System.out.println(" hello from A");
    }

    public int he(); // methods can be public,abstract
    // variable can be public static final
}

// interface
// interface can extends one interface
interface GreetingExtn extends Greeting {
    default void hello() {
        System.out.println(" hello from Greeting");
    }
}

class Greet { // comment and uncomment this class to try more possibilities
    public void hello() {
        System.out.println("hello from Greet");
    }
}

// class can implements the multiple interface
public class DefaultStarter extends Greet implements Greeting, GreetingExtn {
    public static void main(String[] args) {
        new DefaultStarter().hello();
    }

    @Override
    public int he() {
        // TODO Auto-generated method stub
        return 0;
    }
}