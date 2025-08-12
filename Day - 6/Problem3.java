/*
Design a class Employee with private data members: 
employee ID, name, designation, department, and monthly salary. 
Use proper getter and setter methods to access and update these fields.
Add a method to calculate and return the annual salary of the employee.
*/

import java.util.Scanner;

class Employee {
    private static int idCounter = 100;
    private int employeeId;
    private String employeeName;
    private final String[] departments = {"Executive", "Information Technology", "Human Resources", "Finance", "Marketing"};
    private String department;
	private final String[] designations = { "Manager", "Developer", "HR Executive", "Accountant", "Sales Executive" };
    private final double[] salaries = {50000, 60000, 40000, 45000, 42000};
    private String designation;
    private double monthlySalary;
    private double annualSalary;

    public void setEmployeeId() {
        this.employeeId = idCounter++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeName(String name) {
        this.employeeName = name;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setDepartment(int index) {
            this.department = departments[index];
    }

    public String getDepartment() {
        return department;
    }

    public void setDesignation(int index) {
            this.designation = designations[index];
            this.monthlySalary = salaries[index];
    }

    public String getDesignation() {
        return designation;
    }

    public void setSalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getSalary() {
        return monthlySalary;
    }

    public void calculateAnnualSalary() {
        annualSalary = monthlySalary * 12;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void display() {
        System.out.println("\n\t\tEmployee Details");
        System.out.println("Employee ID           : " + getEmployeeId());
        System.out.println("Employee Name         : " + getEmployeeName());
        System.out.println("Employee Department   : " + getDepartment());
        System.out.println("Employee Designation  : " + getDesignation());
        System.out.println("Employee Monthly Salary : " + getSalary());
        System.out.println("Employee Annual Salary  : " + getAnnualSalary());
    }

    public void showDepartments() {
        System.out.println("Select Department:");
        for (int i = 0; i < departments.length; i++) {
            System.out.println(i + " - " + departments[i]);
        }
    }

    public void showDesignations() {
        System.out.println("Select Designation:");
        for (int i = 0; i < designations.length; i++) {
            System.out.println(i + " - " + designations[i]);
        }
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Employee e = new Employee();

        e.setEmployeeId();

        System.out.print("Enter Employee Name : ");
        String name = s.nextLine();
        e.setEmployeeName(name);

        e.showDepartments();
        System.out.print("Enter Department : ");
        int dept = s.nextInt();
        e.setDepartment(dept);

        e.showDesignations();
        System.out.print("Enter Designation : ");
        int des = s.nextInt();
        e.setDesignation(des);

        e.calculateAnnualSalary();
        e.display();
    }
}
