package superdemo;

class Loan {
    protected int tenure;
    protected float interestRate;
    protected int principal = 20;

    Loan(int tenure, float interestRate, int principal) {
        this.tenure = tenure;
        this.interestRate = interestRate;
        this.principal = principal;
    }
}

class HomeLoan extends Loan {
    protected int principal;

    HomeLoan() {
        super(2, 2.5f, 4);
        principal = super.principal;
    }

    HomeLoan(int tenure, float interestRate) {
        super(2, 2.4f, 4);// first prefrence
    }

    public double calculateEMI() {
        double simpleInterest = (principal * tenure * interestRate) / 100;
        double emi = (simpleInterest + principal) / tenure;
        int additionalTaxes = 200;
        System.out.println(principal);
        return additionalTaxes + emi;
    }

}

public class ExecutionLoan {
    public static void main(String[] args) {
        // double principle = 200000;
        // HomeLoan loan = new HomeLoan(3, 2.5f); // second prefrence
        HomeLoan loan = new HomeLoan();
        double hloan = loan.calculateEMI();
        System.out.println("HomeLoan is : " + hloan);
    }
}
