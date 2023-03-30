package inheritance;

import java.util.*;

public class Randomdemo {
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
    }
}
