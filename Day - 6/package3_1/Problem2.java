
import mypack.Arithmetic;
import mypack.StringUtils;   
import java.util.Scanner;
public class Problem2{
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		Arithmetic a=new Arithmetic();
	    StringUtils su=new StringUtils();
		System.out.println("Enter two numbers you want to do operations for Addition,subtraction,multiplication,division,modulos");
		System.out.println("Kindly avoid zero as the second number to avoid exception during divison ");
		int num1=s.nextInt();
		int num2=s.nextInt();
		
		System.out.println("Addition of two numbers "+num1+" and "+num2+" is : "+a.add(num1,num2));
		System.out.println("Subtraction  of two numbers "+num1+" and "+num2+" is : "+a.sub(num1,num2));
		System.out.println("Multiplication  of two numbers "+num1+" and "+num2+" is : "+a.multiply(num1,num2));
		System.out.println("Division of two numbers "+num1+" and "+num2+" is : "+a.divison(num1,num2));
		System.out.println("Modulus  of two numbers "+num1+" and "+num2+" is : "+a.modulo(num1,num2));
		
		System.out.println("Enter two Strings to do operations on String :");
		String s1=s.nextLine();
		String s2=s.nextLine();
		System.out.println("The length of the String "+s1+" was : "+su.length(s1));
		System.out.println("The length of the String "+s2+" was : "+su.length(s2));
		System.out.println("The reverse of the String "+s1+" was : "+su.reverse(s1));  
		System.out.println("The reverse of the String "+s2+" was : "+su.reverse(s2));
		System.out.println("Concatenation: " + su.concat(s1, s2));
	}
}

		
		
		
		
		
		
		
		