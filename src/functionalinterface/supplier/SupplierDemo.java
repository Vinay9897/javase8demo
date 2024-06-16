package functionalinterface.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class SupplierDemo  {
//    @Override
//    public String get() {
//        return "Hi i am Supplier";
//    }

    public static void main(String[] args) {

        Supplier<String> supplier = () -> "Hello I am Supplier";
        Supplier<Optional<String>> s2 = () -> Optional.of("Hello I am Optional");
        List<String> list= Arrays.asList("e", "u", "l", "l");
        List<String> list2= Arrays.asList();
        System.out.println(supplier.get());
        System.out.println(list.stream().findAny().orElseGet(supplier));
        System.out.println(list2.stream().findAny().or(s2));

    }
}


