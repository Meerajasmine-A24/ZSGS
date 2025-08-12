// Develop a Java program which illustrates the usage of Comparable Interface

import java.util.*;

class Student implements Comparable <Student> {
	int rollNo;
	String name;
	int age;
	String dept;
	
	public Student(int rollNo,String name,int age,String dept){
		this.rollNo=rollNo;
		this.name=name;
		this.age=age;
		this.dept=dept;
	}
	
	public String toString(){
		return ("[ Roll NO : "+rollNo+" Name : "+name+" Age : "+age+" Department : "+dept+" ] ");
	}
		
	public int compareTo(Student that){
		if(this.age>that.age) return 1;
		else return -1;
	}
}

public class Problem3{
	public static void main(String[]args){
		List<Student> students=new ArrayList<>();
		students.add(new Student(1,"ABC",21,"ECE"));
		students.add(new Student(2,"DEF",20,"CSE"));
		students.add(new Student(3,"xyz",19,"EEE"));
		students.add(new Student(4,"DEF",25,"MECH"));
		students.add(new Student(5,"PQRS",33,"IT"));
		
		Collections.sort(students);
		
		for(Student s : students){
			System.out.println(s);
		}
	}
}

		
		
		
	

		
	