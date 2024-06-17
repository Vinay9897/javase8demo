package stream.foreachdemo;

import java.util.*;

public class ForEachDemo {

    public static void main(String[] args) {

        //list
        List<String> list = Arrays.asList("a", "b", "c", "d", "e");

        System.out.println();
        // using traditional for loop
        for(int i = 0;i<list.size();i++){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();

        // using (Advanced for loop)
        for(String str : list){
            System.out.print(str+ " ");
        }
        System.out.println();

        //using for-each loop
        list.forEach(val -> System.out.print(val+" "));
        System.out.println();

        // using for-each loop with stream
        list.stream().filter(val -> val == "a").forEach(System.out::print);
        System.out.println();

        //map
        Map<String ,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        map.put("e",5);
        // Bi-Consumer
        map.forEach((key,val) -> System.out.println(key +" " + val));
        map.entrySet().stream().forEach(obj ->System.out.println(obj));
    }

}
