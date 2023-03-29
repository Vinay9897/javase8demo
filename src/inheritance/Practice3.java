package inheritance;

import hotelbookingmanagement.*;
import hotelbookingmanagement.innerpackage.*;
// import hotelbookingmanagement.innerpackage.MiniEvent;
// import hotelbookingmanagement.EventManager;
import java.util.*;
import java.util.ArrayList;

public class Practice3 {
    // private static int $;
    // public static void main(String[] main) {
    // String a_b;
    // System.out.print($);
    // System.out.print(a_b);
    // }
    EventManager ev = new EventManager();
    MiniEvent mini = new MiniEvent();

}

interface HasTail {
    int getTailLength();
}

abstract class Puma implements HasTail {

    public int getTailLength() {
        return 4;
    }// can't reduce visibility
}

class Cougar extends Puma {
    // public static void main(String[] args) {
    // Puma puma = new Cougar();
    // System.out.println(puma.getTailLength());
    // }

    // public int getTailLength(int length) {
    // return 2;

    // boolean keepGoing = true;
    // int count = 0;
    // int x = 3;
    // while (count++ < 3) {
    // int y = (1 + 2 * count) % 3;
    // switch (y) {

    // case 0:
    // x -= 1;
    // System.out.println("case0 " + x);
    // break;
    // case 1:
    // x += 5;
    // System.out.println("case1" + x);
    // break;
    // case 2:
    // x += 1;
    // System.out.println("case2" + x);
    // break;
    // default:
    // x -= 1;
    // break;

    // }
    // }
    // System.out.println(x);

    // }
}

// class Deer {
// Deer() {
// System.out.print("Deer");
// }

// public Deer(int age) {
// System.out.print("DeerAge");
// }

// private boolean hasHorns() {
// return false;
// }

// public static void main(String[] args) {
// Reindeer deer = new Reindeer(5);
// System.out.println("," + deer.hasHorns());
// Deer deer = new Reindeer(5);
// System.out.println("," + deer.hasHorns());
// Deer deer = new Deer(5);
// System.out.println("," + deer.hasHorns());
// }
// }

// class Reindeer extends Deer {
// Reindeer(int age) {
// // super(age);by programer
// // super() by emplicitly
// System.out.print("Reindeer");
// }

// public boolean hasHorns() {
// return true;
// }
// }

// class Egret {
// private String color;

// public Egret() {
// this("white");
// }

// public Egret(String color) {
// this.color = color;
// }

// public static void main(String[] args) {
// Egret e = new Egret();
// System.out.println("Color:" + e.color);
// }
// }

// class BearOrShark {
// public static void main(String[] args) {
// int luck = 10;
// if ((luck > 10 ? luck++ : --luck) < 10) {
// System.out.print("Bear");
// }
// if (luck < 10)
// System.out.print("Shark");
// int a = ;
// a = -a;
// System.out.println(Integer.MIN_VALUE - 5);
// boolean b;
// while (b = false)
// ;
// System.out.println(b);
// }
// }

class WaterBottle {
    private String brand;
    private boolean empty;

    public static void main(String... args) {
        WaterBottle wb = new WaterBottle();
        System.out.print("Empty = " + wb.empty);
        System.out.print(", Brand = " + wb.brand);
        String s = "viany";
        double d = 0xE;
        s.length();
        long l = 38293392030l;// if number range > int.MAX_VALUE then write l/L at end

        // long x = 10;
        // int y = 5;
        // y *= x;

        byte a = 5;
        byte b = 4;
        int c = a + b;
        long c2 = a + b;
        float c3 = a + b;
        double c4 = a + b;
        // short c5 = a + b;
        ArrayList ls = new ArrayList();
        for(int i=0; i<10 ; ) {
            4: i = i++;
            5: System.out.println("Hello World");
            6: }

    }

}
