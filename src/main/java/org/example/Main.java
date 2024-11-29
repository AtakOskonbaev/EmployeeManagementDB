package org.example;


import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeData employeeData = new EmployeeData();

        Employee newEmployee = new Employee("John Snow", "Night's Watch", 0.0, new Date());
        employeeData.createEmployee(newEmployee);
        System.out.println("Employee created: " + newEmployee);

        Employee employee = employeeData.getEmployeeById(1);
        System.out.println("Employee with ID 1: " + employee);

        List<Employee> employees = employeeData.getAllEmployees();
        System.out.println("All Employees:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        if (employee != null) {
            employee.setPosition("Senior Software Engineer");
            employee.setSalary(85000.00);
            employeeData.updateEmployee(employee);
            System.out.println("Updated Employee: " + employee);
        }

        employeeData.deleteEmployee(2);
        System.out.println("Employee with ID 1 deleted.");
    }
}