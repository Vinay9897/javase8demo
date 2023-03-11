package staticdemo;

public class Loan {
    // To count the number of objects created using static variable and method
    private static int loanCounter;
    static {
        loanCounter = 100;
    }
    int loanNo;
    int accountNo;
    int loanAmount;

    Loan() {
        loanCounter++;
    }

    Loan(int loanNo, int accountNo, int loanAmount) {
        this.loanNo = loanNo;
        this.accountNo = accountNo;
        this.loanAmount = loanAmount;
        loanCounter++;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(int loanNo) {
        this.loanNo = loanNo;
    }

    public static int getLoanCounter() {
        return loanCounter;
    }

    public static void main(String[] args) {
        // Loan loan1 = new Loan();
        // Loan loan2 = new Loan(132, 3842, 300);
        System.out.println(Loan.getLoanCounter()); // using class
        System.out.println(Loan.getLoanCounter());
        // System.out.println(loan1.getLoanCounter());
        // System.out.println(loan2.getLoanCounter());

    }
}
