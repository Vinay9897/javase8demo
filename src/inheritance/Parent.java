package inheritance;

public class Parent {

    int hair;
    static String skinColor;

    public void Parent(int hair, String skinColor) {
        this.hair = hair;
        this.skinColor = skinColor;
    }

    public void display() {
        System.out.println("Hair  " + hair + ". " + "Skin color  " + skinColor);
    }

    public static void main(String[] args) {
        Child child = new Child(5, "grey");
    }
}
