/*Create a Java application to manage employees in a company. Define an abstract class Employee with a method calculateSalary().
 Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type.
 Demonstrate runtime polymorphism by calling calculateSalary() on different types of employees using the Employee reference.*/

abstract class Employee {
    static final double fixedSalary = 45000;
    int empId;
    String employeeName;
    String department;
    String role;
    double salary;

    Employee(int empId, String employeeName, String department, String role) {
        this.empId = empId;
        this.employeeName = employeeName;
        this.department = department;
        this.role = role;
    }

    abstract double calculateSalary(); 
}

class FullTimeEmployee extends Employee {
    FullTimeEmployee(int empId, String employeeName, String department, String role) {
        super(empId, employeeName, department, role);
    }

    double calculateSalary() {
        double tax = 3000;
        double insurance = 2300.89;
        salary = fixedSalary- tax - insurance;
        return salary;
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(int empId, String employeeName, String department, String role, int hoursWorked, double hourlyRate) {
        super(empId, employeeName, department, role);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    double calculateSalary() {
        salary = hoursWorked * hourlyRate;
        return salary;
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(101, "John", "IT", "Developer");
        Employee e2 = new PartTimeEmployee(102, "Sarah", "HR", "Consultant", 80, 300.50);

        System.out.println("Full-Time Employee Salary: " + e1.calculateSalary());
        System.out.println("Part-Time Employee Salary: " + e2.calculateSalary());
    }
}
