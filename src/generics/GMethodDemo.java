package generics;

public class GMethodDemo {

    public static <E> void display(E[] list) {
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + ", ");
    }

    public static void main(String[] args) {
        String[] cities = { "A", "B", "C", "d" };
        GMethodDemo.<String>display(cities);
    }
}