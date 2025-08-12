/*  Write a method to parse a string to an integer. 
Throw an exception if the string is not a valid number.
 Handle it using try-catch. */
 
 import java.util.Scanner;
 
 public class Problem4{
	 public static void main(String[]args){
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter a number : ");
		 String str1=s.next();
		try{
			int number = Integer.parseInt(str1);
			System.out.println("Number is : "+number);
		}
		catch(NumberFormatException e){
			System.out.println("Invalid Number Format .... Enter an Integer value ");
			System.out.println(e.getMessage());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
 }
		 