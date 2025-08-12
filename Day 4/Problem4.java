// Write a program to illustrate that Classes cannot be used for multiple Inheritance.

class Animal{
	void print(){
		System.out.println("This is an Animal");
	}
}

class Dog extends Animal{
	void print(){
		System.out.println("Dog is an pet  Animal");
	}
}

class Puppy extends Animal,Dog{
     void print(){
		 System.out.println("Puppy is an type of Dog Animal");
	 }
}

	
public class Problem4{
  public static void main(String[]args){
	  Puppy p=new Puppy();
	  p.print();
  }
}
