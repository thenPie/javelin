import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import StudentDomain.Student;
import StudentDomain.StudentGroup;
import StudentDomain.Teacher;
import StudentDomain.User;

public class App {
    public static void main(String[] args) throws Exception {

        Student st1 = new Student("St", "one", 20, 10L);
        Student st2 = new Student("St", "two", 30, 203L);
        Student st3 = new Student("St", "three", 20, 5L);
        Student st4 = new Student("St", "four", 15, 3516381L);

        List<Student> listOfSt = new ArrayList<Student>();
        listOfSt.add(st1);
        listOfSt.add(st2);
        listOfSt.add(st3);
        listOfSt.add(st4);

        StudentGroup group = new StudentGroup(listOfSt);

        for (Student student : group) {
            System.out.println(student);
        }

        System.out.println();
        Collections.sort(group.getStudents());

        for (Student student : group) {
            System.out.println(student);
        }

    }
}
