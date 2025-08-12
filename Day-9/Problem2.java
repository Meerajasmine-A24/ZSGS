/* Demonstrate multiple catch blocks: accept two numbers as strings, then convert them to integers, and perform division, 
and catch the following exceptions: InputMismatchException, NumberFormatException, ArithmeticException and Exception. */

import java.util.Scanner;

public class Problem2{
	
	public static void divide(String str1,String str2){
		try{
		int num1=Integer.parseInt(str1);
		int num2=Integer.parseInt(str2);
		System.out.println(num1/num2);
		}
		catch(java.util.InputMismatchException  e){
			System.out.println("Invalid input. Please enter an integer.");
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e){
			System.out.println("Invalid Number Format");
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e){
			System.out.println("Cannot Divisible By Zero ");
			System.out.println(e.getMessage());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[]args){
	 Scanner s=new Scanner(System.in);
     System.out.println("Enter a Number ");
     String str1=s.next();
     System.out.println("Enter another Number ");
     String str2=s.next();
	 
     divide(str1,str2);
	}
}
	