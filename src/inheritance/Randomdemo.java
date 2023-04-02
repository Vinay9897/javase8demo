package inheritance;

import java.util.*;

public class Randomdemo {
    public void draw(String s) {

    }

    public void draw(int i, double f) {

    }

    public void draw(int i, long f) {

    }

    public String draw(int i) {
        return "";
    }

    public static void main(String[] args) {
        // Random random = new Random();
        // System.out.println(random.nextInt());
        // System.out.println(random.nextDouble());
        // System.out.println(random.nextLong());
        // Random random = new Random(111);
        // System.out.println(random.nextInt(170) + 1);
        // System.out.println(random.nextInt(6) + 1);
        // System.out.println(random.nextInt(6) + 1);

        List list = Arrays.asList("a", "b", "c");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }

        int X = 5;
        final byte a = 3;
        // final String X = "ch";
        switch (X + "d") {

            case "3":
                System.out.println("1");
                // break;
            case "2 + 2":
                System.out.println("2");
                break;
            case "3 + a":
                System.out.println("3");
                // break;
            default:
                System.out.println("default");
        }
        int b, c, d;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        // if (flag)
        // b = c = d = 4;
        // System.out.println(b + " " + c + " " + d);
        /*
         * these variables will be valid only
         * when they are confirmed to be intialized
         */
        // int i = 0;
        // for (System.out.println(i); i <= 3; System.out.println(i + "+ bye ")) {
        // // System.out.println(i + "in");
        // i++;
        // }

    }
}
