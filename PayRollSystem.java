package com.pay.roll;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PayRollSystem {

	private Map<Integer, Employee> employees = new HashMap<>();

    public void addEmployee(Scanner scanner) {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();

        scanner.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Hourly Rate: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Hours Worked: ");
        int hours = scanner.nextInt();

        Employee emp = new Employee(id, name, rate, hours);
        employees.put(id, emp);
        System.out.println(" Employee Added!\n");
    }

    public void viewPayroll() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;

}
    

    for (Employee emp : employees.values()) {
        System.out.println("\n----");
        emp.displayInfo();
    }
}

public void getEmployeeSalaryById(Scanner scanner) {
    System.out.print("Enter Employee ID: ");
    int id = scanner.nextInt();
    Employee emp = employees.get(id);

    if (emp != null) {
        System.out.println("Salary of " + emp.getName() + " is ₹" + emp.calculateSalary());
    } else {
        System.out.println("Employee not found.");
    }
}
}
