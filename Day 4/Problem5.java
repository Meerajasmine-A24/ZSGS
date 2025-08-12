/*  Create a class named Shape with a method that prints "This is a shape". Create another class named Polygon inheriting the Shape class with the same method that prints "Polygon is a shape". Create two other classes named Rectangle and Triangle having the same method which prints "Rectangle is a polygon" and "Triangle is a polygon" respectively. Again, make another class named Square having the same method which prints "Square is a rectangle".
Now, try calling the method by the object of each of these classes. */

class Shape{
	
	void print(){
		System.out.println("This is a Shape ");
	}
}

class Polygon extends Shape{
	
	void print(){
		System.out.println("Polygon is a Shape ");
	}
}

class Rectangle extends Polygon{
	
	void print(){
		System.out.println("Rectangle is a polygon ");
		
	}
}

class Triangle extends Polygon {
	
	void print(){
		System.out.println("Triangle is a Polygon ");
	}
}

class Square extends Rectangle {
	
	void print(){
		System.out.println("Square is a rectangle ");
	}
}

public class Problem5{
   public static void main(String[]args){
	   Shape s=new Shape();
	   s.print();
	   Polygon p=new Polygon();
	   p.print();
	   Rectangle r =new Rectangle();
	   r.print();
	   Triangle t =new Triangle();
	   t.print();
	   Square sq=new Square();
	   sq.print();
   }
}
