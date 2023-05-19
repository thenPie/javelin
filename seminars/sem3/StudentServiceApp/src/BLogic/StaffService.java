package BLogic;

import Domain.Staff;
import Domain.Student;
import Domain.UserComparator;

import java.util.ArrayList;
import java.util.List;

public class StaffService implements iUserService<Staff> {
    private Integer amount;
    private List<Staff> staffList;

    public StaffService() {
        this.staffList = new ArrayList<Staff>();
    }

    @Override
    public List<Staff> getAll() {
        return staffList;
    }

    @Override
    public void create(String lastName, String firstName, Integer age) {
        Staff per = new Staff(lastName, firstName, age, amount);
        amount++;
        staffList.add(per);
    }

    public List<Staff> getStaffSortedByInitials() {
        List<Staff> staff = new ArrayList<>(staffList);
        staff.sort(new UserComparator<Staff>());
        return staff;
    }
}
