package stream;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    static List<Employee> employees;
    public DataBase() {
        employees = new ArrayList<>();
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public static List<Employee> getEmployees() {
        return employees;
    }


}
