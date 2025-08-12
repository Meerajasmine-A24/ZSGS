//  Write a program to illustrate the usage of clone() and find out what kind of copy it will make.


// example for shallow copy 

class Department {
	int deptId;
	String deptName;
	
	public Department(int deptId,String deptName){
		this.deptId=deptId;
		this.deptName=deptName;
	}
	
	public void display(){
		System.out.println("Department Id : "+deptId);
		System.out.println("Department Name : "+deptName);
	}
	
}
class Student implements Cloneable{
	int studentId;
	String studentName;
	Department dept;
	
	public Student(int studentId,String studentName,Department dept){
		this.studentId=studentId;
		this.studentName=studentName;
		this.dept=dept;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public void display(){
		System.out.println("\n Student Id  : "+studentId);
		System.out.println("Student Name : "+studentName);
		dept.display();
	}
}

// Example for Deep Copy 
class Products implements Cloneable{
	int productId;
	String productName;
	
	public Products(int productId,String productName){
		this.productId=productId;
		this.productName=productName;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public void display(){
		System.out.println("Product Id : "+productId);
		System.out.println("Product Name : "+productName);
	}
	
}

class Customers implements Cloneable{
	int customerId;
	String customerName;
	Products prod;
	
	public Customers(int customerId,String customerName,Products prod){
		this.customerId=customerId;
		this.customerName=customerName;
		this.prod=prod;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		Customers c=(Customers)super.clone();
		c.prod=(Products) c.prod.clone();
		return c;
	}
	
	public void display(){
		System.out.println("\nCustomer Id : "+customerId);
		System.out.println("Customer Name : "+customerName);
		prod.display();
	}
}
      
	
	
	


public class Problem5{
	public static void main(String[]args) throws CloneNotSupportedException {
		Department dept1=new Department(101,"IT");
		Student std1=new Student(1,"Meera",dept1);
		Student std2=(Student) std1.clone();
		System.out.println("Example for Shallow Copy ");
		System.out.println("\n Student Details ");
		std1.display();
		std2.display();
		System.out.println("\n After changing department on one object will affect both ");
		std1.dept.deptName="CSE";
		std1.display();
		std2.display();
		System.out.println("\n Example for Deep Copy");
		System.out.println("\n Customer Details ");
		Products p=new Products(1001,"Moisturizer");
		Customers customer1 =new Customers(450,"Jasmine",p);
		Customers customer2=(Customers) customer1.clone();
		customer1.display();
		customer2.display();
		System.out.println("\n After changing the product name the changes wont affect the next one ");
		customer1.prod.productName="Bath Soap";
		customer1.display();
		customer2.display();
			
		
	}
}
 