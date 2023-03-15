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

    HomeLoan(int tenure, float interestRate) {
        super(tenure, interestRate);

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
        HomeLoan loan = new HomeLoan(4, 4.4f);
        double hloan = loan.calculateEMI(principle);
        System.out.println("HomeLoan is : " + hloan);
    }
}
