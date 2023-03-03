package lambdaexpression;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

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
}

public class LambdaDemo {

}
