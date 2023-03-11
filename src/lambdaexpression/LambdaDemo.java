package lambdaexpression;

import java.util.List;
import java.util.ArrayList;
// import java.util.Collections;

interface DemoInterface1 {
    void noArguments();
}

interface DemoInterface2 {
    void noArguments(String s, Integer i);
}

interface DemoInterface3 {
    void noArguments(Integer i);
}

class Employee {
    Integer empId;
    String empName;
    String country;

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getEmpId() {
        return this.empId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Employee(Integer empId, String empName, String country) {
        this.empId = empId;
        this.empName = empName;
        this.country = country;
    }

    public String toString() {
        return "empId : " + empId + ", empName : " + empName + ", country : " + country;
    }
}

public class LambdaDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Robert", "Canada");
        Employee e2 = new Employee(102, "Vinay", "India");
        Employee e3 = new Employee(103, "Dhiruj", "Assam");
        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        System.out.println("Before sort : " + empList);
        empList.sort((emp1, emp2) -> emp1.getCountry().compareTo(emp2.getCountry()));
        System.out.println("After sort : " + empList);

        // Example 1: To access a method with no arguments
        System.out.println("Example 1: No argument lambda expression ");
        DemoInterface1 demoInterface1 = () -> System.out.println("No Arguments");
        demoInterface1.noArguments();
        System.out.println();

        // Example 2: To access a method with 2 arguments
        System.out.println("Example 2: Multiple arguments lambda expression ");
        DemoInterface2 demoInterface2 = ((str, val) -> System.out
                .println("String : " + str + " " + "Integer : " + val));
        demoInterface2.noArguments("Vinay", 24);
        System.out.println();

        // Example 3: To access a method with 1 argument
        System.out.println("Example 3: One argument lambda expression to print square of the given Integer number");
        DemoInterface3 demoInterface3 = ((val) -> System.out.println(val));
        demoInterface3.noArguments(56);
        System.out.println();
    }
}
