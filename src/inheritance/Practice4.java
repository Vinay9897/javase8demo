package inheritance;

public class Practice4 {
    final String value1 = "1";
    static String value2 = "2";
    String value3 = "3";
    {
        // CODE SNIPPET 1
        value2 = "a";
        value3 = "a";
    }
    static {
        // CODE SNIPPET 2
        value2 = "a";
    }
    static {
        value2 = "a";
    }

}

class Order {
    static String result = "";

    {
        result += "c";

    }
    {
        result += "r";
        System.out.println(result);
    }
    static {
        result += "u";
        System.out.println(result);
    }

}

class OrderDriver {
    public static void main(String[] args) {
        // new Order();
        // System.out.print(Order.result + " "); // ucr
        // System.out.print(Order.result + " ");// ucr
        // System.out.print(Order.result + " ");// ucr
        // new Order();
        // new Order();

        // System.out.print(Order.result + " ");// ucrcr
        String st = null;
        // st.toString();
        // System.out.print("a");
        try {
            System.out.print("b");
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.print("c");
            throw new RuntimeException("1");
        } catch (RuntimeException e) {
            System.out.print("d");
            throw new RuntimeException("2");
        } finally {
            System.out.print("e");
            throw new RuntimeException("3");
        }
    }
}

class Rodent {
    protected static Integer chew() {
        System.out.println("Rodent is chewing");
        return 1;
    }

}

class Beaver extends Rodent {
    protected static Integer chew() {
        System.out.println("Beaver is chewing on wood");
        return 2;
    }

    public static void main(String[] args) {
        Beaver beaver = new Beaver();
        beaver.chew();
        // Rodent rodent = new Rodent();
        // rodent.chew();
        Rodent bRodent = new Beaver();
        bRodent.chew();
    }
}

class Mammal {
    // public Mammal() {
    // System.out.print("Mammal");
    // }
    public Mammal(int age) {
        System.out.println();
    }
}

class Platypus extends Mammal {
    public Platypus() {
        super(12);
        System.out.print("Platypus");
    }

    public static void main(String[] args) {
        new Mammal(5);
    }
}

class Mouse {
    private int numTeeth = 7;
    private int numWhiskers;
    private int weight;

    public Mouse(int weight) {
        this(weight, 16); // calls constructor with 2 parameters
    }

    public Mouse(int weight, int numTeeth) {
        this(13, numTeeth, 6); // calls constructor with 3 parameters
    }

    public Mouse(int weight, int numTeeth, int numWhiskers) {
        this.weight = weight;
        this.numTeeth = numTeeth;
        this.numWhiskers = numWhiskers;
    }

    public void print() {
        System.out.println(weight + " " + numTeeth + " " + numWhiskers);
    }

    public static void main(String[] args) {
        Mouse mouse = new Mouse(15);
        mouse.print();
    }
}
