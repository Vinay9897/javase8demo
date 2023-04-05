package inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.Math.*;

public class Practice5 {

    static public void main(String[] args) {
        List string = new ArrayList();
        Integer b = 5;
        int a = --b + b--;
        System.out.println(a + " " + b);
        // int $ = 3;
        // System.out.println($);
        // int True = 3;
        // short f =4;
        // short f1 =4;
        // int f2= f +f1;
        // int val = (int) (Math.random() * 3);
        // System.out.println(val);
        // float val1 = -28.5F;
        // int number = (int) Math.abs(val1);
        // number += 3;
        // System.out.println(number);
        // float val2 = -28.5F;
        // int number2 = (int) Math.nextUp(val2);
        // System.out.println(--number2);
        // String s = Boolean.toString(true); / "true"
        String s = Integer.toString(1); // "1"
        // String s = Float.toString(23.0f); // "23.0"
        // String s = Double.toString(23.0); // "23.0"
        Integer i = Integer.valueOf(s);
        String s11 = new String("Java11");
        String s2 = "hiyooohello";
        int index = s2.lastIndexOf("h", 4);
        System.out.println(index);
        // "hiyooohello"
        // char s1 = 65;
        int[] arr1 = { 129, 2, 3, 4, 5, 6 };
        int[] arr2 = { (byte) 129, 2, 3, 4, 5, 6 };
        ArrayList list = new ArrayList<>(Arrays.asList(arr1));
        ArrayList lis = new ArrayList<>(Arrays.asList(arr2));
        System.out.println(Arrays.equals(arr1, arr2)); // content
        System.out.println(list.equals(lis)); // reference
        // int arr[] = { 2, 9, 4, 12, 54, 1, 68 };
        // // Arrays.sort(arr);
        // System.out.println(Arrays.binarySearch(arr, 9));
        // Boolean bool = Boolean.FALSE;
        // System.out.println(bool);
        int val = 10;
        System.out.printf("%d", (val << 2));
    }

}
