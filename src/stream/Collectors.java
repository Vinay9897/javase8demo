package stream;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.stream.*;;
// Collectors which provides implementations of the Collector interface through 
// many useful static methods like toList(), toMap(), groupingBy(), maxBy(), minBy() etc.

public class Collectors {
    // The collect()method converts a stream of employees
    // into a List of employees we have used the collect() method of Stream.
    // The collect() method is declared as:
    // <R, A> R collect(Collector<? super T, A, R> collector);
    public static void main(String[] args) {
        List<Employee> lstEmp = Employee.getEmpList();
        // displaying the sample data
        System.out.println("*****Sample Data*****");
        lstEmp.forEach((e) -> System.out.println(e.getId() + ":" + e.getName() + ":" + e.getSal()));
        // displaying the data after applying filter and increasing salary
        System.out.println("*****Data after applying filter and increasing salary*****");

        // List<Employee> lstNewEmp = lstEmp.stream().filter(emp -> emp.getYearsInOrg()
        // < 1)
        // .map(e -> { e.setSal(e.getSal() + 5000); return e; })
        // .collect(Collectors.toList());
        // lstNewEmp.forEach((e) -> System.out.println(e.getId() + ":" + e.getName() +
        // ":" + e.getSal()));

        // Optional<Integer> max = lstEmp.stream().map(e ->
        // e.getSal()).reduce(Integer::max); // Finding the maximum
        // // salalry
        // List<Employee> lstMaxEmp = lstEmp.stream()
        // .filter(e -> e.getSal().equals(max.get())) // Finding employees with the
        // maximum salary
        // .collect(Collectors.toList());
        // System.out.println("\nEmployees having maximum salary after increment:");
        // lstMaxEmp.forEach(e -> System.out.println(e.getId() + ":" + e.getName() + ":"
        // + e.getSal()));

    }
}

class Employee {
    private Integer id;
    private String name;
    private Double sal;
    private Integer yearsInOrg;

    public String getName() {
        return name;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
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

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", yearsInOrg=" + yearsInOrg + "]";
    }

    public Employee(Integer id, String name, Double sal, Integer yearsInOrg) {
        super();
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.yearsInOrg = yearsInOrg;
    }

    public static List<Employee> getEmpList() {
        Employee e1 = new Employee(101, "Roger", 15000D, 0);
        Employee e2 = new Employee(104, "Chris", 25000D, 2);
        Employee e3 = new Employee(103, "Samuel", 30000D, 0);
        Employee e4 = new Employee(102, "Brian", 10000D, 3);
        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        return empList;
    }
}
