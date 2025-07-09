package com.pay.roll;

public class Employee {

	private int id;
	private String name;
    private double hourlyRate;
    private int hoursWorked;

    public Employee(int id, String name, double hourlyRate, int hoursWorked) {
        this.id = id;
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getHourlyRate() { return hourlyRate; }
    public int getHoursWorked() { return hoursWorked; }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Hourly Rate: ₹" + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Salary: ₹" + calculateSalary());

}
}