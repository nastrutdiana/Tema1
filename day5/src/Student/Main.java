package Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Diana",10));
        students.add(new Student("Diana",8));

        Service.saveIntoBinaryFile("file.bin", students);

        students.clear();

        students = Service.readFromBinaryFile("file.bin");
    }
}
