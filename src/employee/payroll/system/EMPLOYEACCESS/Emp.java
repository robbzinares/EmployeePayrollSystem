package employee.payroll.system.employee.payroll.system.EMPLOYEACCESS;

import java.util.HashMap;
import java.util.Map;

public class Emp {
    private Map<Integer, Employee> employees;

    public Emp() {
        employees = new HashMap<>();
    }

    public void addEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    public void deleteEmployee(int id) {
        employees.remove(id);
    }

    public Employee getEmployee(int id) {
        return employees.get(id);
    }

    public void updateEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    public Map<Integer, Employee> getEmployees() {
        return employees;
    }
}
