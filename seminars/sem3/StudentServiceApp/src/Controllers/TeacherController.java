package Controllers;

import BLogic.TeacherService;
import Domain.Teacher;

public class TeacherController implements iUserController<Teacher> {
    private final TeacherService teacherService = new TeacherService();

    @Override
    public void create(String lastName, String firstName, Integer age) {
        teacherService.create(lastName, firstName, age);
    }
}
