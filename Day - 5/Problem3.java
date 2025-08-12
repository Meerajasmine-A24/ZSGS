/* Create a Java application to manage employees in a company. Define a base class Employee with a method calculateSalary(). Then create two subclasses 
FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type. */


class Employee {
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

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + employeeName);
        System.out.println("Department: " + department);
        System.out.println("Role: " + role);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

    double calculateSalary() {
        double tax = 3000;
        return fixedSalary - tax;
    }
}

class FullTimeEmployee extends Employee {

    FullTimeEmployee(int empId, String employeeName, String department, String role) {
        super(empId, employeeName, department, role);
    }


    double calculateSalary() {
        double tax = 3000;
        double insurance = 2300.89;
        return fixedSalary - tax - insurance;
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
        return hoursWorked * hourlyRate;
    }
}

public class Problem3 {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee(101, "xyz", "IT", "Engineer");
        fte.salary = fte.calculateSalary();

        PartTimeEmployee pte = new PartTimeEmployee(202, "abc", "HR", "staff", 30, 250);
        pte.salary = pte.calculateSalary();

        System.out.println("Full-Time Employee:");
        fte.display();

        System.out.println("Part-Time Employee:");
        pte.display();
    }
}
