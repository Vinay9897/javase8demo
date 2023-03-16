package interfacedemo;

public class ExecuteLoan {
    public static void main(String[] args) {
        Customer customer = new Customer();
        IBank bank = new AligarhBranch();
        customer.setCustomerID(111);
        customer.setCustomerName("ABD");
        String accountNumber = bank.createAccount(customer);
        System.out.println("AccountNumber is : " + accountNumber);
        double goldloan = bank.issueGoldLoan(customer);
        System.out.println("GoldenLoan amount is : " + goldloan);
        double vehicleloan = bank.issueVehicleLoan("bike", customer);
        System.out.println("VehicleLoan amount is :" + vehicleloan);
        double homeLoan = bank.issueHomeLoan(customer);
        System.out.println("HomeLoan amount is : " + homeLoan);

    }
}
