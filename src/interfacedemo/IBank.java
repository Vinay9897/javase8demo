package interfacedemo;

public interface IBank {
    int CAUTIONMONEY = 2000;

    String createAccount(Customer customer);

    double issueVehicleLoan(String vehicleType, Customer customer);

    double issueHomeLoan(Customer customer);

    double issueGoldLoan(Customer customer);
}
