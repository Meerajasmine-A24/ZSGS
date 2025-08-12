// Develop a Java program to illustrate the usage of toString() method.

import java.util.*;
class Fruits{
	int productId;
	String productName;
	double price;
	int quantity;
	String manufacturingDate;
	String expiryDate;
	
	public Fruits(int productId,String productName,int quantity,double price,String manufacturingDate,String expiryDate){
		this.productId=productId;
		this.productName=productName;
		this.quantity=quantity;
		this.price=price;
		this.manufacturingDate=manufacturingDate;
		this.expiryDate=expiryDate;
	}
	
	public String toString(){
		return ("\nProduct Id : "+productId+"\nProduct Name : "+productName+"\nQuantity : "+quantity+"\nPrice : "+price+
		         "\nManufacturing Date : "+manufacturingDate+"\nExpiry Date : "+expiryDate+"\n");
	}
	
}
public class Problem7{
	public static void main(String[]args){
		List<Fruits> fruits=new ArrayList<>();
		fruits.add(new Fruits(1,"Apple",10,45.00,"24.05.2025","21.09.2025"));
		fruits.add(new Fruits(2,"Orange",24,56.00,"23.01.2025","01.10.2025"));
		fruits.add(new Fruits(3,"Banana",35,10.00,"19.07.2025","20.08.2025"));
		fruits.add(new Fruits(4,"StrawBerry",20,80.00,"14.07.2025","09.12.2025"));
		fruits.add(new Fruits(5,"Water Melon",60,60.00,"15.03.2025","06.05.2025"));  
		
		for(Fruits f:fruits){
			System.out.println(f.toString());
		}
	}
}
