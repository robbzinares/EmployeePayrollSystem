package employee.payroll.system.employee.payroll.system;

import employee.payroll.system.employee.payroll.system.EMPLOYEACCESS.Emp;
import employee.payroll.system.employee.payroll.system.EMPLOYEACCESS.Employee;

import javax.swing.JOptionPane;
import java.util.Map;

public class ViewRequest {
    private Emp emp;

    public ViewRequest(Emp emp) {
        this.emp = emp;
    }

    public void generateSummaryReport() {
        StringBuilder report = new StringBuilder();
        for (Map.Entry<Integer, Employee> entry : emp.getEmployees().entrySet()) {
            Employee employee = entry.getValue();
            report.append(String.format("ID: %d, Name: %s, Salary: %.2f\n",
                    employee.getId(), employee.getName(), employee.getBasicSalary()));
        }
        JOptionPane.showMessageDialog(null, report.toString());
    }
}
