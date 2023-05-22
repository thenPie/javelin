package fixed_solid.first;

public class EmployeePayCalculation {
    public int calculateNetSalary(Employee emp) {
        int tax = (int)(emp.getBaseSalary() * 0.25);
        return emp.getBaseSalary() - tax;
    }
}
