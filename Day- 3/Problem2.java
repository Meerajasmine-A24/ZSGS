// student with constructor
class Student{
	String name;
	int rollNo;
	int phoneNo;
	String address;
	Student(String name,int rollNo,int phoneNo,String address){
		this.name=name;
		this.rollNo=rollNo;
		this.phoneNo=phoneNo;
		this.address=address;
	}
	void display(){
		System.out.println("\nstudent name : "+name);
		System.out.println("student roll no  : "+rollNo);
		System.out.println("student phone no : "+phoneNo);
		System.out.println("student address : "+address);
	    
	}	
}

public class Problem2{
	public static void main(String[]args){
		Student s1=new Student("Sam",1,123789,"987 w street,xyz City");
		s1.display();
		Student s2=new Student("John",2,47330,"536 m street,abc city");
		s2.display();
	}
}

		