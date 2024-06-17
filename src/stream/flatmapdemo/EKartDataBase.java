package stream.flatmapdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EKartDataBase {

    public static List<Customer> getAll(){
        return Stream.of(
                new Customer(1,"vinay","vinayyadav91190@gmail.com", Arrays.asList("09328740","3825908")),
                new Customer(2,"shantanu","shantanu91190@gmail.com", Arrays.asList("09328740","3825908")),
                new Customer(3,"yash","yash91190@gmail.com", Arrays.asList("09328740","3825908")),
                new Customer(4,"jay","jay91190@gmail.com", Arrays.asList("09328740","3825908"))
        ).collect(Collectors.toList());
    }
}
