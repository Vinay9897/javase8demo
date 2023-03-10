package enumdemo;

enum Designation {
    CEO, GeneralManager, RegionalManager, BranchManager
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
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.roleDefined(Designation.BranchManager);
        bank.roleDefined(Designation.RegionalManager);
    }
}