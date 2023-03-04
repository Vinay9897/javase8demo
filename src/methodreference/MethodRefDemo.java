package methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

interface Shape {
    void Display();
}

class Employee {

    private Integer empId;
    private String empName;
    private String country;

    public Employee(Integer empId, String empName, String country) {
        this.empId = empId;
        this.empName = empName;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", country=" + country + "]";
    }

    public static int compareByCountry(Employee emp1, Employee emp2) {
        return emp1.getCountry().compareTo(emp2.getCountry());
    }

}

public class MethodRefDemo {

    public static void methodDisplay() {
        System.out.println("display something");
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Aron", "Spain");
        Employee e2 = new Employee(102, "Cindia", "Portugal");
        Employee e3 = new Employee(103, "Zidane", "France");
        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        System.out.println("Before sorting : " + empList);
        empList.sort(Employee::compareByCountry);
        System.out.println("After sorting : " + empList);

        Shape s = MethodRefDemo::methodDisplay;
        s.Display();

        System.out.println();

        List<Integer> empListIDs = new ArrayList<>();
        for (Employee id : empList) {
            empListIDs.add(id.getEmpId());
        }
        System.out.println("Printing Even Employee Ids");
        evalute(empListIDs, (id) -> id % 2 == 0);
        System.out.println("Printing Odd Employee Ids");
        evalute(empListIDs, (id) -> id % 2 == 1);

        System.out.println();
        // computeIDs
        // for (Employee e : empList) {
        // double sal = computeIDs(e, e1 -> {e1.getEmpId() * 1.1});
        // }
    }

    public static void evalute(List<Integer> empListID, Predicate<Integer> predicateArg) {
        for (int empId : empListID) {
            if (predicateArg.test(empId))
                System.out.println(empId);
        }
    }

    // To demonstrate the working of Function Interface
    public static double computeIDs(Employee e, Function<Employee, Double> fn) {
        return fn.apply(e);
    }
}