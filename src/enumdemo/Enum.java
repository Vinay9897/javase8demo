package enumdemo;

enum Designation {
    CEO(2), GeneralManager(4), RegionalManager(3), BranchManager(5);

    private int noOfEmployees;

    Designation(int noOfEmployees) {
        this.noOfEmployees = noOfEmployees;
    }

    public int getNoOfEmployees() {
        return noOfEmployees;
    }
}

class Bank {
    public void roleDefined(Designation designation) {
        switch (designation) {
            case CEO:
                System.out.println("Designation is CEO");
                break;
            case GeneralManager:
                System.out.println("Designation is GeneralManager");
                break;
            case RegionalManager:
                System.out.println("Designation is RegionalManager");
                break;
            case BranchManager:
                System.out.println("Desiganation is BranchManager");
                break;
        }
    }
}

public class Enum {
    public static void reportee(Designation designation) {
        System.out.println(designation.getNoOfEmployees());
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.roleDefined(Designation.BranchManager);
        Enum.reportee(Designation.BranchManager);
        bank.roleDefined(Designation.RegionalManager);
        Enum.reportee(Designation.RegionalManager);

        for (Designation designation : Designation.values()) {
            System.out.println("Name:" + designation.name() + ", No Of Employees:" + designation.getNoOfEmployees());
        }
    }
}