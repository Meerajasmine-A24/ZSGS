/* Create a Java application to manage employees in a company using interface.
   Define an interface Employee with a method calculateSalary().
   Implement this interface in FullTimeEmployee and PartTimeEmployee classes.
   Demonstrate runtime polymorphism by calling calculateSalary() using the Employee reference. */

interface Employee {
    double calculateSalary();
}

class FullTimeEmployee implements Employee {
    static final double fixedSalary = 45000;
    int empId;
    String employeeName;
    String department;
    String role;
    double salary;

    FullTimeEmployee(int empId, String employeeName, String department, String role) {
        this.empId = empId;
        this.employeeName = employeeName;
        this.department = department;
        this.role = role;
    }

    public double calculateSalary() {
        double tax = 3000;
        double insurance = 2300.89;
        double grossSalary = fixedSalary;
        salary = grossSalary - tax - insurance;
        return salary;
    }
}

class PartTimeEmployee implements Employee {
    int empId;
    String employeeName;
    String department;
    String role;
    int hoursWorked;
    double hourlyRate;
    double salary;

    PartTimeEmployee(int empId, String employeeName, String department, String role, int hoursWorked, double hourlyRate) {
        this.empId = empId;
        this.employeeName = employeeName;
        this.department = department;
        this.role = role;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary() {
        salary = hoursWorked * hourlyRate;
        return salary;
    }
}

public class Problem4 {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(101, "John", "IT", "Developer");
        Employee e2 = new PartTimeEmployee(102, "Sarah", "HR", "Consultant", 80, 300.50);

        System.out.println("Full-Time Employee Salary: " + e1.calculateSalary());
        System.out.println("Part-Time Employee Salary: " + e2.calculateSalary());
    }
}
