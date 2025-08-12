/*  Construct a base class called twoD contains x and y and methods to read and write the x and y. Create another class called threeD which is derived from twoD and also contains z and write methods to read and write z. Also write a method to find the distance of two threeD Points.
sqrt((x2-x1)^2+(y2-y1)^2+(z2-z1)^2)
In main:
Create one ThreeD object using the default constructor.
Use the setters to set x, y, and z.
Create the second ThreeD object using the constructor with three arguments.
in the TwoD class:
Add a cout statement to the TwoD default constructor with a message "TwoD default constructor"
Add a cout statement to other TwoD constructor with a message "TwoD constructor with two arguments" */

class TwoD{
	
	
	private double  x;
	private double  y;
	
	public TwoD(){
		System.out.println("default Constructor");
	}
	
	public TwoD(double x,double y){
		System.out.println("Two D Constructor with two Arguments");
		this.x=x;
		this.y=y;
	}
	
	public void  setX(double x){
		this.x=x;
	}
	
	public void setY(double y){
		this.y=y;
	}
	
	public double getX(){
		return x;
	}
	
	public double  getY(){
		return y;
	}
}

class ThreeD extends TwoD {
	private double z;
	
	public ThreeD(){
		super();
	}
	
	public ThreeD(double x,double y,double z){
		super(x,y);
		System.out.println("Three D argument Constructor");
		this.z=z;
	}
	
	public void setZ(double z){
		this.z=z;
	}
	
	public double getZ(){
		return z;
	}
	
	public double distance(ThreeD td){
		double dx=td.getX()-this.getX();
		double dy=td.getY()-this.getY();
		double dz=td.getZ()-this.getZ();
		
		return Math.sqrt(dx*dx + dy*dy + dz*dz);
		
	}
	

}
	
public class Problem2{
	
public static void main(String[]args){
	ThreeD obj1=new ThreeD();
	obj1.setX(7.8);
	obj1.setY(3.6);
	obj1.setZ(2.7);
	ThreeD obj=new ThreeD(1.0,5.0,8.5);
	System.out.println("Distance is : " + obj1.distance(obj));
}
}

	
	
	
	 


