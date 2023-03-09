package constructordemo;

class Chocolate {
    int barCode;
    String name;
    int weight;
    int cost;

    Chocolate(int barCode, String name, int weight, int cost) {
        this.barCode = barCode;
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    public int getBarCode() {
        return barCode;
    }

    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}

public class ChocolateTest {
    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate(101, "Cadbury", 12, 10);
        Chocolate chocolate2 = new Chocolate(102, "Hershey's", 12, 10);
        System.out.println(chocolate.getBarCode());
        System.out.println(chocolate.getCost());
        System.out.println(chocolate.getName());
    }
}
