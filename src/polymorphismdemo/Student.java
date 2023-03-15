package polymorphismdemo;

class Person1 {
    String name;

    Person1() {
        System.out.println("In Person class");
    }

    void Print() {
        System.out.println("person name" + name);
    }
}

public class Student extends Person1 {
    void Print() {
        System.out.println("student name" + name);
    }

    Student() {
        System.out.println("In Student class");
    }

    int id;

    public static void main(String[] args) {
        // Person1 person = null;
        // person = new Student();
        // person.name = "abc";
        System.out.println("************Person class invoked own class constructor********");
        Person1 person = null;
        person = new Person1();
        System.out.println("********Person class invoked child class constructor method");
        person = new Student();
        person.Print();
    }
}
