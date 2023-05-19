package Controllers;

import BLogic.StudentGroupService;
import BLogic.StudentService;
import Domain.Student;

public class StudentController implements iUserController<Student> {
    private final StudentService dataService = new StudentService();
    private final StudentGroupService groupService = new StudentGroupService();

    @Override
    public void create(String lastName, String firstName, Integer age) {
        dataService.create(lastName, firstName, age);
    }
}
