import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domain.Student;
import Domain.StudentGroup;
import Domain.StudentSteam;

public class App {
    public static void main(String[] args) throws Exception {

        Student st1 = new Student("St", "one", 20, 106L);
        Student st2 = new Student("St", "two", 30, 203L);
        Student st3 = new Student("St", "three", 20, 524L);
        Student st4 = new Student("St", "four", 15, 381L);
        Student st5 = new Student("St", "five", 20, 107L);
        Student st6 = new Student("St", "six", 30, 206L);
        Student st7 = new Student("St", "seven", 20, 534L);
        Student st8 = new Student("St", "eight", 20, 564L);

        List<Student> lStudents1 = new ArrayList<Student>();
        List<Student> lStudents2 = new ArrayList<Student>();
        List<Student> lStudents3 = new ArrayList<Student>();
        
        lStudents1.add(st1);
        lStudents1.add(st2);
        lStudents1.add(st3);
        lStudents1.add(st4);
        lStudents1.add(st5);
        lStudents2.add(st6);
        lStudents3.add(st7);
        lStudents3.add(st8);

        StudentGroup gr1 = new StudentGroup(lStudents1, "1group1");
        StudentGroup gr2 = new StudentGroup(lStudents2, "2group2");
        StudentGroup gr3 = new StudentGroup(lStudents3, "3group3");

        List<StudentGroup> grs = new ArrayList<StudentGroup>();
        grs.add(gr1);
        grs.add(gr2);
        grs.add(gr3);

        StudentSteam steam1 = new StudentSteam(grs);
        
        for (StudentGroup studentGroup : steam1) {
            System.out.println("=================================================================" + studentGroup.getName());
            for (Student student : studentGroup) {
                System.out.println(student);
            }
        }

        System.out.println();
        Collections.sort(steam1.getSteam());

        for (StudentGroup studentGroup : steam1) {
            System.out.println("=================================================================" + studentGroup.getName());
            for (Student student : studentGroup) {
                System.out.println(student);
            }
        }
        
        // for (StudentGroup studentGroup : steam1) {
        //     System.out.println("=================================================================");
        //     for (Student student : studentGroup) {
        //         System.out.println(student);
        //     }
        // }

    }
}
