// Illustrates with an example of using Singleton class.

import java.util.Scanner;

class Employee{
	int empId;
	String empName;
	
	private Employee(){
	   System.out.println("constructor");	
	}
	
	public static Employee emp=null;
	
	public static Employee getInstance(){
            if(emp==null){
                emp=new Employee();
			}
            return emp;
	}

}	

public class Problem1{
	public static void main(String[]args){
		Scanner s =new Scanner(System.in);
		Employee emp1=Employee.getInstance();
		Employee emp2=Employee.getInstance();
		System.out.println("Enter 1 st employee id : ");
		int id1=s.nextInt();
		s.nextLine();
		System.out.println("Enter 1 st employee Name : ");
		String name1=s.nextLine();
		emp1.empId=id1;
		emp2.empName=name1;
		
		System.out.println("Employee Details ");
		System.out.println("\n 1 st employee ");
		System.out.println("Employee Id : "+emp1.empId);
		System.out.println("Employee Name : "+emp1.empName);
		System.out.println("\n 2nd Employee ");
		System.out.println("Employee Id : "+emp2.empId);
		System.out.println("Employee Name : "+emp2.empName);
		
	}
}

		