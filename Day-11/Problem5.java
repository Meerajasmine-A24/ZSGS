/* . Design a Java application to manage a product inventory system using file handling and object serialization.
Create a class Product with the following attributes:
--->int productId
--->String name
--->double price
--->int quantity
a. Ensure the class implements the Serializable interface.
b. Methods:
--->Add a Product: Accept product details from the user and write the object to a file (products.dat).
--->View All Products: Read all product objects from the file and display them.
--->Search Product by ID: Search for a product by productId in the file and display its details if found.
--->Update Product: Locate a product in the file using the ID, update its price or quantity, and 
save the changes back to the file.
--->Delete Product: Remove a product object from the file by ID (involves rewriting the file).
--->Use proper exception handling and ensure that object serialization and deserialization 
are handled safely and efficiently.*/

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;


 class Product implements Serializable{
	 
	int productId;
	String name;    
	double price;
	int quantity;
	
	public Product(int productId,String name,int quantity,double price){
		this.productId=productId; 
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}

	public String toString(){
		return "Product ID: "+productId+" , Product Name : "+name+", Price : "+price+" , Quantity : "+quantity;
	}
 }
 public class Problem5{
	 private static final String  fileName="products.dat";
	 List<Product> products;
	 public Problem5(){
		 products=loadProducts();
	 }
	  @SuppressWarnings("unchecked")
	 public   List<Product> loadProducts(){
		 List<Product> productList=new ArrayList<>();
		 try{
			 FileInputStream fis=new FileInputStream(fileName);
			 ObjectInputStream ois=new ObjectInputStream(fis);
			 productList=(List<Product>) ois.readObject();
			 fis.close();
			 ois.close();
		 }
		 catch(FileNotFoundException e){
			 System.out.println(e.getMessage());
		 }   
		 catch(Exception e){
			 System.out.println(e.getMessage());
		 }
		 return productList;
	 }
	 
	 public void saveProducts(){
		 try{
			 FileOutputStream fos=new FileOutputStream(fileName);
			 ObjectOutputStream oos=new ObjectOutputStream(fos);
			 oos.writeObject(products);
			 fos.close();
			 oos.close(); 
		 }
		 catch(Exception e){ 
			 System.out.println(e.getMessage());
		 }
	 }
	 
	 
	public void addProduct(int productId,String name,int quantity,double price){
		products.add(new Product(productId,name,quantity,price));
		saveProducts();
	}
	
		
	public void viewAllProducts(){
		if(products.isEmpty()){
			System.out.println("No products found ");
		}
		
		for(Product p : products){
			System.out.println(p);
		}
	}
	
	public void searchProductById(int id){
		boolean found=false;
		for(Product p : products){
			if(p.productId==id){
				System.out.println(p);
				found=true;
			}
		} 
		if(!found){
		System.out.println("Product not found");
		}
	}
	
	public void updateProduct(int id,int quantity,double price){
		boolean updated=false;
		for(Product p :products){
			if(p.productId==id){
				p.quantity=quantity;
				p.price=price;
				saveProducts();
				updated=true;
			}
		}
		if(!updated){
		  System.out.println("Product not found ");
		}		
	} 
	
	public void deleteProduct(int id){
		Iterator<Product> iterator=products.iterator();
		while(iterator.hasNext()){
			Product p=iterator.next();
			if (p.productId == id) {
                iterator.remove();
                saveProducts();
                System.out.println("Product deleted successfully.");
                return;
            }
        }
        System.out.println("Product not found.");
	}	


	public static void main(String[]args){
		Scanner s=new Scanner(System.in); 
		Problem5 obj=new Problem5();
		while(true){
		System.out.println("Enter the choice \n 1.Add Product \n 2.View All products \n 3.Search Product  \n 4.update product price \n 5. Delete Product  \n 6.Exit");
		int choice=s.nextInt();
		switch(choice){
			case 1 :
			  System.out.println("Enter product id : ");
			  int productId=s.nextInt();
			  s.nextLine();
			  System.out.println("Enter product name : ");
			  String name=s.nextLine();
			  System.out.println("Enter product quantity : ");
			  int quantity=s.nextInt();
			  System.out.println("Enter price of the single unit of the product :");
			  double price=s.nextDouble();
			  obj.addProduct(productId,name,quantity,price); 
			  break;  
			  
			  case 2: 
			  obj.viewAllProducts();
			  break;
			  
			  case 3:
			  System.out.println("Enter product id to Search : ");
			  int searchId=s.nextInt();
			  obj.searchProductById(searchId);
			  break;
			  
			  case 4 :
			  System.out.println("Enter product id to update quantity and price to update product   ");
			  System.out.println("Enter product id : ");
			  int id=s.nextInt();
			  System.out.println("Enter product quantity : ");
			  int count=s.nextInt();
			  System.out.println("Enter product Price  : ");
			  double cost=s.nextDouble();
			  obj.updateProduct(id,count,cost); 
			  break; 
			  
			  case 5 : 
			  System.out.println("Enter product id to remove product : ");
			  int deleteid=s.nextInt();
			  obj.deleteProduct(deleteid);
			  break;
			  
			  case 6:  
              s.close();
			  System.exit(0);
			  
			  
			  default :
			  System.out.println("Invalid choice"); 
		}
	} 
	
	}  

} 
			  
			  
			  
			  

			  
		
		
		
	
	
	