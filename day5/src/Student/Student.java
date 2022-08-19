package Student;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private double grade;

    public Student() {
    }

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }
}
