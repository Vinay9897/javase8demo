package functionalinterface.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo  {
    // first way, worst way,  implement the interface Consumer and override accept method
//    @Override
//    public void accept(Integer i) {
//        System.out.println(i);
//    }


    // second way , best way directly use the lambda expression to call
    //    the consumer functional interface



    public static void main(String[] args) {

        Consumer<Integer> consumerDemo = (t) -> System.out.println(t);
        consumerDemo.accept(10);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        Consumer<List<Integer>> consumerList = (list1) -> {
            list.forEach(System.out::println);
            System.out.println("List" + list1);
        };
        consumerList.accept(list);

        list.forEach(consumerDemo);  // optional way, passing the consumer instance
        list.forEach((t) -> System.out.println(t)); // best way , directly use the consumer with lambda expression,
//        list.forEach(consumerList);
    }
}
