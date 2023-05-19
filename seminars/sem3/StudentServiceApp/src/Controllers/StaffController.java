package Controllers;

import BLogic.StaffService;
import Domain.Staff;
import Domain.User;

public class StaffController implements iUserController<Staff> {
    private final StaffService staffService = new StaffService();

    @Override
    public void create(String lastName, String firstName, Integer age) {
        staffService.create(lastName, firstName, age);
    }

    static public <E extends Staff> void paySalary(E person) {
        System.out.println(((User)person).getFirstName() + " получил зп 10k");
    }

    static public <E extends Number> Double mean(E[] num) {
        Double sum = 0.0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i].doubleValue();
        }
        sum = sum / num.length;
        return sum;
    }
}
