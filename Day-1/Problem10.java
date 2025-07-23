// object is an instance of clss

class Animal {
 void show(){
	 System.out.println("This is an animal");
 }
 
}

class Dog extends Animal {
	void show1(){
		System.out.println("Dog is an animal");
	}
	
	
}
public class Problem10{
    public static void main(String[] args) {
        Animal a = new Dog();
        System.out.println(a instanceof Animal);
        System.out.println(a instanceof Dog);
		

        Dog d = new Dog();
        System.out.println(d instanceof Animal);

        Animal b = new Animal();
        System.out.println(b instanceof Dog);
    }
}
