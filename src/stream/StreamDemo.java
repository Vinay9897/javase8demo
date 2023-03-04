package stream;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Employee> lstStream = Employee.getEmployeeList();
        // Converting a List into Stream
        Stream<Employee> streamList = lstStream.stream();
        System.out.println("*****Printing the stream*****");
        streamList.forEach(System.out::println);

        // Filtering based on Employee's time in the organization
        System.out.println("*****Filtering the stream*****");
        Stream<Employee> filter_streamList = lstStream.stream();
        Stream<Employee> filter_data = filter_streamList.filter(emp -> emp.getYearsInOrg() < 1);
        filter_data.forEach(System.out::println);

        // Sorting based on Employee ID
        System.out.println("*****Sort the stream*****");
        Stream<Employee> sort_data = lstStream.stream();
        Stream<Employee> sort_stream = sort_data.sorted((emp1, emp2) -> emp1.getId() - emp2.getId());
        sort_stream.forEach(System.out::println);

        // System.out.println("*****Piplelining all the functionalities*****");
        Stream<Employee> empStrem_pipeline = lstStream.stream();
        empStrem_pipeline.filter(emp -> emp.getYearsInOrg() >= 0)
                .sorted((emp1, emp2) -> emp1.getId() - emp2.getId())
                .forEach((e) -> System.out.println(e.getId() + ":" + e.getName()));
    }
}

class Employee {
    private Integer id;
    private String name;
    private Integer yearsInOrg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYearsInOrg() {
        return yearsInOrg;
    }

    public void setYearsInOrg(Integer yearsInOrg) {
        this.yearsInOrg = yearsInOrg;
    }

    public Employee(Integer id, String name, Integer yearsInOrg) {
        super();
        this.id = id;
        this.name = name;
        this.yearsInOrg = yearsInOrg;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", yearsInOrg=" + yearsInOrg + ", name=" + name
                + "]";
    }

    public static List<Employee> getEmployeeList() {
        Employee e1 = new Employee(101, "Roger", 0);
        Employee e2 = new Employee(104, "Chris", 2);
        Employee e3 = new Employee(103, "Samuel", 0);
        Employee e4 = new Employee(102, "Brian", 3);
        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        return empList;
    }
}
