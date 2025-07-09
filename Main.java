package com.pay.roll;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PayRollSystem payrollSystem = new PayRollSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n Employee Payroll Management System ");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Get Salary by Employee ID");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    payrollSystem.addEmployee(scanner);
                    break;
                case 2:
                    payrollSystem.viewPayroll();
                    break;
                case 3:
                    payrollSystem.getEmployeeSalaryById(scanner);
                    break;
                case 4:
                    System.out.println("Exiting");
                    break;
                default:
                	 System.out.println("Invalid choice Try again.");
            }
        } while (choice != 4);

        scanner.close();
    }


	}


