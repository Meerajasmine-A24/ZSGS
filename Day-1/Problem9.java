// Employee Deatils

import java.util.Scanner;

class Employee{
	int empId;
	String name;
	String department;
	double salary;
	
	Employee(int id,String name,String department,double salary){
		this.empId=id;
		this.name=name;
		this.department=department;
		this.salary=salary;
	}  
	void displayDetails(){
	System.out.println("Employee ID:" + empId);
	System.out.println("Employee Name:" + name);
	System.out.println("Employee department :" + department);
	System.out.println("Employee Salary:" + salary);	
	}
	
	
}
public class Problem9{

public static void main(String[]args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Employee id:");
	int id=s.nextInt();
	System.out.println("Enter Employee Name:");
	String name=s.next();
	System.out.println("Enter Department:");
	String department=s.next();
	System.out.println("Enter employee salary:");
	double salary=s.nextDouble();
	Employee emp=new Employee(id,name,department,salary);
	emp.displayDetails();
	s.close();

}
}



	
	
	
	
	