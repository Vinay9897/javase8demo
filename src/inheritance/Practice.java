package inheritance;

public class Practice {
    String color = null;
    static int var1 = 200;
    public static final int val = 32;
    public int val2 = 32;

    public static void print() {
        System.out.println(var1);
    }

    public void print(int var2) {
        System.out.println(var2);
        var1 = var2 + var1;
        print();
    }

    Practice() {

    }

    Practice(Practice p) {
        this.color = p.color;
    }

    public static void main(String[] args) {
        // Practice p = new Practice();
        Practice p = new Practice();
        p.color = "White";
        Practice p1 = new Practice(p);
        System.out.println(p.val2);
        System.out.println(p1.color + " " + p.color);
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(a++ > 10 || ++b <= 22);
        System.out.println(a + " " + b);
        String name = "fred";
        System.out.println("H" + // Saying lo
                name);
        System.out.println("Good /* Moring " +
                "greeting */ day!");
        System.out // Hi beta
                .println("Welcome" + name);
        p.print(100);
        System.out.println("***********************************");
        int[] ar = { 10, 0 };
        int i = 0;
        try {
            i = ar[i] / ar[i + 1];
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("NullPointer Exception");
        }
        // catch (ArithmeticException e) {
        // System.out.println("change denominator");
        // }

        System.out.println("***********************************");
        System.out.println("heeloworldiamkingof\'king\'sozameindias");

        int x, y = 1;
        x = 10;
        if (x != 10 && x / 0 == 0)
            System.out.println(y);
        else
            System.out.println(++y);
        System.out.println("***********************************");
        int fi = 128890;
        String st = "pokemdjslomn";
        System.out.printf("%15d", fi);
        System.out.println();
        System.out.printf("%0,15d", fi);
        System.out.println();
        System.out.printf("%+,15d", fi);
        System.out.println();
        System.out.printf("%-20s | %0,15d %n", st, fi);
        System.out.println("hello");

    }
}