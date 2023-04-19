package staticmethod;

import staticdemo.Loan;
// import staticdemo.Loan.*;

// To demonstrate the working of static methods in an interface

interface Renumerator {
    public abstract double deductFoodFee(); // abstract method() Must be overridden by all implementing classes

    // Need not be overridden
    final public static double HEALTH_INSURANCE_PERCENTAGE = 5.0;
    final double PENSION_PERCENTAGE = 5.0;

    // default implemention can be redefined
    public default double deductHealthInsurancePremium(double employeeSalary) {
        return (employeeSalary * HEALTH_INSURANCE_PERCENTAGE / 100);
    }

    public static double deductForPension(double employeeSalary) { // Static method of the interface
        return (employeeSalary * PENSION_PERCENTAGE / 100);
    }
}

public class RenumeratoreTest extends Loan {
    RenumeratoreTest() {
        super();
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        Double pension = Renumerator.deductForPension(20000);
        System.out.println(pension);
        Loan l = new Loan();
        System.out.println(l.number);
    }
}
