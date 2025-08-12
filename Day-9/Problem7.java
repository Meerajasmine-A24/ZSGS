// 7. Write a Java program that shows exception propagation across multiple methods (method1 calls method2 calls method3,
//  which throws the exception). 
// Handle the exception in method1.

public class Problem7{
	public static void method3(){
		int num=20/(20-20);
		System.out.println(num);
	}
	public static void method2(){
		method3();
	}
	public static void method1(){
		method1();
	}
	
public static void main(String[]args){
	try{
		method3();
	}
	catch(Exception e){
		System.out.println("Exception : "+e.getMessage());
	}
}
}
