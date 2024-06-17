package stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaxService {
    public static List<Employee> evaluateTaxUsers(String tax) {
        if(tax.equalsIgnoreCase("tax"))
        return DataBase.getEmployees().stream().filter(emp -> emp.getSalary() > 50000).collect(Collectors.toList());
        else
            return  DataBase.getEmployees().stream().filter(emp -> emp.getSalary() < 50000).collect(Collectors.toList());
    }

    public static List<Employee> salaryWise(String type) {
        return (type.equalsIgnoreCase("salary"))
                ? DataBase.getEmployees().stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).collect(Collectors.toList())
                :
                DataBase.getEmployees().stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());

    }

    public static void main(String[] args) {
       Employee emp = new Employee();
       emp.setSalary(30000);
       emp.setName("Vinay");
        Employee emp2 = new Employee();
        emp2.setSalary(51000);
        emp2.setName("Satyam");
        Employee emp3 = new Employee();
        emp3.setSalary(50000);
        emp3.setName("Ankit");
        Employee emp4 = new Employee();
        emp4.setSalary(500000);
        emp4.setName("Shashi Kant");

        DataBase dataBase = new DataBase();
        dataBase.addEmployee(emp);
        dataBase.addEmployee(emp2);
        dataBase.addEmployee(emp3);
        dataBase.addEmployee(emp4);

        evaluateTaxUsers("taxx").stream().forEach(System.out::println);
        salaryWise("salary").forEach(System.out::println);

    }

}
