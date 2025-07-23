// Employee details 

class Employee {
    String eName;
    int eId;
    String designation;
    long salary;

    Employee() {
    }

    Employee(String eName, int eId, String designation, long salary) {
        this.eName = eName;
        this.eId = eId;
        this.designation = designation;
        this.salary = salary;
    }

    Employee(Employee e) {
        this.eName = e.eName;
        this.eId = e.eId;
        this.designation = e.designation;
        this.salary = e.salary;
    }

    void display() {
        System.out.println("Employee Name : " + eName);
        System.out.println("Employee ID : " + eId);
        System.out.println("Employee Designation : " + designation);
        System.out.println("Employee Salary     : " + salary);
        System.out.println();
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.eName = "John";
        emp1.eId = 1;
        emp1.designation = "Developer";
        emp1.salary = 45000;
        emp1.display();

        Employee emp2 = new Employee("Micheal", 2, "HR", 60000);
        emp2.display();

        Employee emp3 = new Employee(emp2);
        emp3.display();
    }
}
