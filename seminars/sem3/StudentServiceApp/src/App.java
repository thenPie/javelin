import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.StaffController;
import Controllers.StudentController;
import Domain.*;

public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("", "", 10, 1L);
        Student s2 = new Student("", "", 20, 2L);
        Student s3 = new Student("", "", 30, 3L);
        Student s4 = new Student("", "", 40, 4L);

        Teacher t1 = new Teacher("", "", 33, 1L, "");
        Teacher t2 = new Teacher("", "", 22, 2L, "");
        Teacher t3 = new Teacher("", "", 44, 3L, "");
        Teacher t4 = new Teacher("", "", 55, 4L, "");

        Staff st1 = new Staff("", "", 10, 1);
        Staff st2 = new Staff("", "", 20, 1);
        Staff st3 = new Staff("", "", 54, 1);
        Staff st4 = new Staff("", "", 23, 1);

        List<Student> students = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();
        List<Staff> staffList = new ArrayList<>();

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        teachers.add(t1);
        teachers.add(t2);
        teachers.add(t3);
        teachers.add(t4);

        staffList.add(st1);
        staffList.add(st2);
        staffList.add(st3);
        staffList.add(st4);

        System.out.println(AverageAge.getAvgAge(students));
        System.out.println(AverageAge.getAvgAge(teachers));
        System.out.println(AverageAge.getAvgAge(staffList));

    }
}
