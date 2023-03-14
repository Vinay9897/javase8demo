package variablearguments;

public class Rectangle {
    private int length;
    protected int breath;

    public int getBreath() {
        return breath;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public static void main(String[] args) {

    }
}

class E {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setBreath(3);
        rectangle.setLength(3);
        System.out.println(rectangle.breath);
        System.out.println(rectangle.getLength());
    }
}
