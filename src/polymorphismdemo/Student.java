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
        System.out.println("************Person class reference with invoked own class constructor********");
        Person1 person = null;
        person = new Person1();
        person.Print();
        System.out.println("********Person class referenced with invoked child class constructor method");
        Person1 person2 = new Student();
        person2.Print();
        System.out.println("********Student class referenced with invoked own class constructor method");
        Student student = new Student();
        student.Print();
    }
}
