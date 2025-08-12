/* 
6. Write a Java program to accept a 4-digit ATM PIN from the user and validate whether it meets the following conditions:
--->It must be exactly 4 digits long.
--->It should contain only numeric characters.
--->It must not start with 0.
Display an appropriate message whether the PIN is valid or invalid. */

import java.util.Scanner;

class AtmInValidException extends  Exception{
	public AtmInValidException(String message){
		super(message);
	}
}
public class Problem6{
	public static void isValid(String s)throws AtmInValidException {
	if((s.length()!=4) || (s.charAt(0)==0 )|| (!isNumeric(s))){
		throw new AtmInValidException("The Pin you entered Was Invalid ");
	}
	else{
		System.out.println("The pin was valid ");
	}
	
  } 
public static boolean isNumeric(String s){
	  try{
		  int num=Integer.parseInt(s);
		  return true;
	  }
	  catch(Exception e){
		  return false;
	  }
  }
   public static void main(String[]args){
	   
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 4 - Digit ATM Pin : ");
		String string=sc.nextLine();
		try{
			isValid(string);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
   }
}

		