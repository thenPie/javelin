package BLogic;

import java.util.ArrayList;
import java.util.List;

import Domain.StudentGroup;

public class StudentGroupService {
    private List<StudentGroup> groups;

    public StudentGroupService() {
        this.groups = new ArrayList<>();
    }

    public List<StudentGroup> getAllGroups() {
        return groups;
    }
}
