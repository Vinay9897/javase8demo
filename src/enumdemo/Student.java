package enumdemo;

enum Grade {
    A, B, C, D, E, K
}

public class Student {
    int studentId;
    String name;
    Grade grade;
    int scholarshipAmount;
    int totalMarks;

    public Grade getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setScholarshipAmount(int scholarshipAmount) {
        this.scholarshipAmount = scholarshipAmount;
    }

    public int getScholarshipAmount() {
        return scholarshipAmount;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public void calculateGrade() {
        if (totalMarks >= 250)
            grade = Grade.K;
        else if (totalMarks >= 200 && totalMarks < 250)
            grade = Grade.B;
        else if (totalMarks >= 175 && totalMarks < 200)
            grade = Grade.B;
        else if (totalMarks >= 150 && totalMarks < 175)
            grade = Grade.B;
        else
            grade = Grade.E;
    }

    public void calculateScholoarshipAmount() {
        switch (grade) {
            case A:
                scholarshipAmount = 5000;
                break;
            case B:
                scholarshipAmount = 4000;
                break;
            case C:
                scholarshipAmount = 3000;
                break;
            case D:
                scholarshipAmount = 2000;
                break;
            default:
                scholarshipAmount = 0;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Vinay");
        s1.setStudentId(1000);
        s1.setTotalMarks(200);
        s1.calculateGrade();
        s1.calculateScholoarshipAmount();
        System.out.println("Student Details");
        System.out.println("Student Id:" + s1.getName());
        System.out.println("Student Grade:" + s1.getGrade());
        System.out.println("Scholarship amount:" + s1.getScholarshipAmount());
    }
}
