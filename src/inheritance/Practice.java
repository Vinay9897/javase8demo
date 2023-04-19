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
            System.out.println("y :" + y);
        else
            System.out.println(++y);
        System.out.println("***********************************");
        int fi = 128890;
        float fo = 21.32f;
        String st = "pokemdjslomn";
        System.out.printf("|%15f|%n", fo);
        System.out.printf("|%0,15.3f|%n", fo);// 21.32f;
        System.out.printf("|%,15f|%n", fo);
        System.out.printf("|%+,15f|%n", fo);
        System.out.printf("|%-,15f|%n", fo);

        System.out.printf("|%15d|", fi);// 128890;
        System.out.println();
        System.out.printf("|%0,15d|", fi);
        System.out.println();
        System.out.printf("|%,15d|", fi);
        System.out.println();
        System.out.printf("|%-15d|", fi);
        System.out.println();
        System.out.printf("%-20s | %0,15d %n", st, fi);

        String str = "hello";
        String str12 = "vinay";
        System.out.printf("|%-10s|%2s %n", str, str12);// |hello |vinay
        System.out.printf("|%-10S| %2S %n", str, str12);// |HELLO | VINAY
        System.out.printf("|%-5.3s|%2.6s %n", str, str12);// |hel |vi
        System.out.printf("%s, %s \n", str, str12);// hello, vinay
        System.out.printf("%2$s %1$s %n", str, str12);// vinay hello
        System.out.printf("%2$s %2$s %n", str, str12);// vinay vinay
        System.out.printf("%1$s %1$s %n", str, str12);// hello hello

    }
}
