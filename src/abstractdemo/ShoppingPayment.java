package abstractdemo;

public class ShoppingPayment extends RRPaymentServices {
    static int counter;
    String paymentID;

    // construtor
    ShoppingPayment(double balance, int customerID) {
        super(balance, customerID);
        this.balance = balance;
        this.customerID = customerID;
    }

    public String getPaymentID() {
        return paymentID;
    }

    void payBills(double amount) {
        if (paymentID.length() != 5 || paymentID.charAt(0) == 'S')
            System.out.println(" Invalid PaymentID!!!");
    }
}
