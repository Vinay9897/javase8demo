package functionalinterface.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,6,7,7);

        Predicate<Integer> predicate = i -> i % 2 == 0;

        System.out.println(predicate.test(5));

        list.stream().filter(val -> val % 2 == 0).forEach(System.out::println);
        System.out.println(list.stream().allMatch(val -> val % 2 == 0));
        System.out.println(list.stream().anyMatch(val -> val % 2 == 0));

    }
}
