package defaultmethod;

interface aftersale {
    public abstract double chargeOnDelivery();
}

public class Customer implements aftersale {

    double price;

    public Customer(double price) {
        this.price = price;
    }

    @Override
    public double chargeOnDelivery() {
        return price;
    }

    public static void main(String[] args) {
        Customer customer1 = new PreviledgedCustomer(300.2);
        System.out.println(customer1.chargeOnDelivery());
    }

}

// child 1
class RegularCustomer extends Customer {
    public RegularCustomer(double price) {
        super(price);
    }

    public double chargeOnDelivery() {
        return price;
    }
}

// child 2
class PreviledgedCustomer extends Customer {
    public PreviledgedCustomer(double price) {
        super(price);
    }

    public double chargeOnDelivery() {
        return price - price * 5 / 100;
    }
}
