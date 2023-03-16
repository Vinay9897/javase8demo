package interfacedemo;

public class AligarhBranch implements IBank {
    public double issueVehicleLoan(String vehicleType, Customer customer) {
        if (vehicleType.equals("bike"))
            return 100000;

        return 40000;
    }

    public double issueHomeLoan(Customer customer) {
        return 30000;
    }

    public double issueGoldLoan(Customer customer) {
        return 50000;
    }

    public boolean applyForCreditCard(Customer customer) {
        return true;
    }

    @Override
    public String createAccount(Customer customer) {
        // TODO Auto-generated method stub
        return "Account Created";
    }
}
