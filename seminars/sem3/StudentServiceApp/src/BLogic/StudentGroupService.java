package BLogic;

import java.util.ArrayList;
import java.util.List;

import Domain.Student;
import Domain.StudentGroup;
import Domain.UserComparator;

public class StudentGroupService {
    private List<StudentGroup> groups;

    public StudentGroupService() {
        this.groups = new ArrayList<>();
    }

    public List<StudentGroup> getAllGroups() {
        return groups;
    }

    public List<Student> getStudentsSortedByInitials(Integer groupNumber) {
        List<Student> students = new ArrayList<>(groups.get(groupNumber).getStudents());
        students.sort(new UserComparator<Student>());
        return students;
    }
}
