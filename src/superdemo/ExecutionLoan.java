package superdemo;

class Loan {
    protected int tenure;
    protected float interestRate;

    Loan(int tenure, float interestRate) {
        this.tenure = tenure;
        this.interestRate = interestRate;
    }
}

class HomeLoan extends Loan {

    HomeLoan() {
        super(2, 2.5f);
    }

    HomeLoan(int tenure, float interestRate) {
        super(2, 2.4f);// first prefrence
    }

    public double calculateEMI(double principle) {
        double simpleInterest = (principle * tenure * interestRate) / 100;
        double emi = (simpleInterest + principle) / tenure;
        int additionalTaxes = 200;
        return additionalTaxes + emi;
    }

}

public class ExecutionLoan {
    public static void main(String[] args) {
        double principle = 200000;
        HomeLoan loan = new HomeLoan(3, 2.5f); // second prefrence
        // HomeLoan loan = new HomeLoan();
        double hloan = loan.calculateEMI(principle);
        System.out.println("HomeLoan is : " + hloan);
    }
}
