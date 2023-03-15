package polymorphismdemo;

class Person {
    String name;

    Person() {
        name = "John";
        System.out.println("ParentName :" + name);
    }

    public void getDetails() {
        System.out.println(name);
    }
}

class Employee extends Person {
    int age;

    Employee() {
        age = 34;
        System.out.println("Employee Employee");
    }

    public void getDetails() {
        System.out.println(name + age);
    }
}

class Customer extends Employee {
    int salary;

    Customer(int salary) {
        this.salary = salary;
        name = "Maddy";
    }

    public void getDetails() {
        System.out.println(name + age + salary);
    }
}

class Account {
    public static void main(String[] args) {
        System.out.println("*******Person referenced to Person Object");
        Person person = null;
        person = new Person();
        System.out.println();
        System.out.println("******Person referenced to Employee Object");
        person = new Employee();
        person.getDetails();
        System.out.println();
        System.out.println("*******Person referenced to Customer Object");
        person = new Customer(2000);
        person.getDetails();
        System.out.println();
        System.out.println("*******Employee referenced to Employee Object");
        Employee employee = new Employee();
        employee.getDetails();
    }
}
