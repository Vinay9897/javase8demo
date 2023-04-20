package generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardDemo {
    public static void main(String[] args) {

        Student student = new Student(1, "vinay");
        Record<Student> record = new Record<>();

        record.add(student);
        record.display(record);

        Record<DayScholar> record2 = new Record<>();
        DayScholar dayScholar = new DayScholar(1, "vina", 15000f);

        record2.add(dayScholar);
        record.display(record2);
    }
}

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Id = " + id + " Name = " + name;
    }

}

class DayScholar extends Student {
    float stipend;

    DayScholar(int id, String name, float stipend) {
        super(id, name);
        this.stipend = stipend;
    }

    @Override
    public String toString() {
        return "Id = " + id + " Name = " + name + " Stipend = " + stipend;
    }

}

class Record<E> {
    List<E> record = new ArrayList<>();

    @Override
    public String toString() {
        return "Record [record=" + record + "]";
    }

    public void add(E e) {
        record.add(e);
    }

    public void display(Record<? extends Student> record) {
        System.out.println("student record:" + record);
    }
}
