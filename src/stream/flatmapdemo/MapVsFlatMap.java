package stream.flatmapdemo;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

    public static void main(String[] args) {

    List<Customer> customers = EKartDataBase.getAll();

    // List<Customer> to List<String>  Data Transformation
//        mapping : one to one , customer -> customer.getEmail()
    List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
    emails.forEach(System.out::println);

        // List<Customer> to List<String>  Data Transformation
//        mapping : one to many , customer -> customer.getPhoneNumbers()
        List<List<String>> phoneNumbers = customers.stream().map(customer -> customer.getPhoneNumbers()).collect(Collectors.toList());
        System.out.println(phoneNumbers);


        List<String> phoneNumbers2 = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(phoneNumbers2);

    }
}
