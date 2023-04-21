package innerclass;

public class InnerClassDemo { // outer class
    class Inner { // inner class
        private String name;

        public String innerMethod(String name) {
            // calculate grade
            System.out.println(name);
            return name;
        }

        public static void main(String[] args) {
            InnerClassDemo innerClassDemo = new InnerClassDemo();
            innerClassDemo.outerMethod();
        }
    }

    public String outerMethod() {
        Inner inner = new Inner();// Inner class is instantiated and used in the method of the outer class
        return inner.innerMethod("hi");
    }
}
