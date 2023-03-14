package inheritance;

public class Child extends Parent {

    Child(int hair, String skinColor) {
        this.hair = hair;
        this.skinColor = super.skinColor;
    }

    public void display() {
        System.out.println("hair is " + hair + " Skin Color is " + skinColor);
    }

    public static void main(String[] args) {
        Child parent = new Child(2, "blue");
        Parent parent2 = new Child(5, "grey");
        parent.display();
        parent2.display();
    }

}
