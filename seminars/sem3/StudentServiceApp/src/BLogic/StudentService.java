package BLogic;

import java.util.ArrayList;
import java.util.List;

import Domain.Student;

public class StudentService implements iUserService<Student> {
    private Integer amount;
    private List<Student> students;

    public StudentService() {
        this.students = new ArrayList<Student>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String lastName, String firstName, Integer age) {
        Student per = new Student(lastName, firstName, age, (long)amount);
        amount++;
        students.add(per);
    }

    //    public List<Student> getAllStudents() {
//        return students;
//    }
}
