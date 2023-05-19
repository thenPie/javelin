package BLogic;

import Domain.Staff;
import Domain.Teacher;
import Domain.UserComparator;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements iUserService<Teacher> {
    private Integer amount;
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String lastName, String firstName, Integer age) {
        Teacher per = new Teacher(lastName, firstName, age, amount.longValue(), "placeholder_degree_to_fix");
        amount++;
        teachers.add(per);
    }

    public List<Teacher> getTeachersSortedByInitials() {
        List<Teacher> teachers = new ArrayList<>(this.teachers);
        teachers.sort(new UserComparator<Teacher>());
        return teachers;
    }
}
