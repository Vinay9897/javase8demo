package generics;

import java.util.ArrayList;
import java.util.Collections;

public class SortCourse {
    public static void main(String[] args) {

        ArrayList<Course> courseList = new ArrayList<>();
        courseList.add(new Course(124, "AngularJS"));
        courseList.add(new Course(120, "Java"));
        courseList.add(new Course(121, "Hibernate"));

        Collections.sort(courseList);
        System.out.println(courseList);
    }
}

class Course implements Comparable<Course> {
    int no;
    String coursename;

    Course(int no, String name) {
        this.no = no;
        this.coursename = name;
    }

    @Override
    public int compareTo(Course othercourse) {
        return this.coursename.compareTo(othercourse.coursename);
    }

    @Override
    public String toString() {
        return this.no + ":" + this.coursename;
    }
}
