import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import StudentDomain.Student;
import StudentDomain.StudentGroup;
import StudentDomain.StudentSteam;

public class App {
    public static void main(String[] args) throws Exception {

        Student st1 = new Student("St1", "one", 20, 106L);
        Student st2 = new Student("St1", "two", 30, 203L);
        Student st3 = new Student("St1", "three", 20, 524L);
        Student st4 = new Student("St1", "four", 15, 381L);
        Student st5 = new Student("St2", "five", 20, 107L);
        Student st6 = new Student("St2", "six", 30, 206L);
        Student st7 = new Student("St2", "seven", 20, 534L);
        Student st8 = new Student("St3", "eight", 20, 564L);

        List<Student> lStudents1 = new ArrayList<Student>();
        lStudents1.add(st1);
        lStudents1.add(st2);
        lStudents1.add(st3);
        lStudents1.add(st4);

        List<Student> lStudents2 = new ArrayList<Student>();
        lStudents2.add(st5);
        lStudents2.add(st6);
        lStudents2.add(st7);

        List<Student> lStudents3 = new ArrayList<Student>();
        lStudents3.add(st8);

        StudentGroup gr1 = new StudentGroup(lStudents1);
        StudentGroup gr2 = new StudentGroup(lStudents2);
        StudentGroup gr3 = new StudentGroup(lStudents3);

        List<StudentGroup> grs = new ArrayList<StudentGroup>();
        grs.add(gr1);
        grs.add(gr2);
        grs.add(gr3);

        StudentSteam steam1 = new StudentSteam(grs);

        for (StudentGroup studentGroup : steam1) {
            for (Student student : studentGroup) {
                System.out.println(student);
            }
        }

    }
}
