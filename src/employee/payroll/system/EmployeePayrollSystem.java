package system;

import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;

public class EmployeePayrollSystem {
    private Map<Integer, Employee> employees;

    public EmployeePayrollSystem() {
        employees = new HashMap<>();
        // Assume employees are loaded from the database
    }

    // Method to generate payslip for a specific employee
    public void generatePayslip(int empId) {
        Employee employee = employees.get(empId);
        if (employee == null) {
            JOptionPane.showMessageDialog(null, "Employee not found!");
            return;
        }
        double basicSalary = employee.getBasicSalary();
        double allowances = calculateAllowances(empId);
        double deductions = calculateDeductions(empId);
        double netSalary = basicSalary + allowances - deductions;

        String payslip = String.format("Employee ID: %d\nName: %s\nBasic Salary: %.2f\nAllowances: %.2f\nDeductions: %.2f\nNet Salary: %.2f",
                employee.getId(), employee.getName(), basicSalary, allowances, deductions, netSalary);

        JOptionPane.showMessageDialog(null, payslip);
    }

    private double calculateAllowances(int empId) {
        // Placeholder logic
        return 500.00;
    }

    private double calculateDeductions(int empId) {
        // Placeholder logic
        return 200.00;
    }

    public static void main(String[] args) {
        EmployeePayrollSystem system = new EmployeePayrollSystem();
        system.generatePayslip(1); // Example usage
    }
}
