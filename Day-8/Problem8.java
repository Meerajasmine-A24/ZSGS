 /* Write a Java program to demonstrate the concept of object cloning using the clone() method.
--->Create a class Student with fields like name, rollNo, and department.
--->Attempt to clone an object of this class using the clone() method.
--->Catch and handle the CloneNotSupportedException if thrown.
***Also find out and explain why the class must implement the Cloneable interface to avoid CloneNotSupportedException.
-->Your program should clearly illustrate:
a. What happens if Cloneable is not implemented
b. How the error is resolved by implementing Cloneable */

class Student implements Cloneable{
	String name;
	int rollNo;
	String department;
	 
	 public Student(String name,int rollNo,String department){
		 this.name=name;
		 this.rollNo=rollNo;
		 this.department=department;
	 }    
	 
	 protected Object clone() throws CloneNotSupportedException{
		 return super.clone();
	 }
	 
	 public void display(){
		 System.out.println("\nStudent Name : "+name);
		 System.out.println("Roll No : "+rollNo);
	 }
		 
	 
}

public class Problem8{
	public static void main(String[]args) throws CloneNotSupportedException{
		Student std1=new Student("John",210024,"IT");
		Student std2=(Student) std1.clone();
		System.out.println("Student Details " );
		std1.display();
		std2.display();
	}
}

		
		 