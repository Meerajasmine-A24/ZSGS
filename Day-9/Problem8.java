/*  Design a login system that throws AuthenticationException if the username or password is incorrect.
 Handle it and display a login failure message. */

import java.util.*;

class AuthenticationException extends Exception {
	public AuthenticationException(String message){
		super(message);
	}
}

public class Problem8{
	static String userName="user@123";
	static String passWord="password@123";
	
	public static void isValid(String user,String pass) throws AuthenticationException{
	   if(!user.equals(userName) && !pass.equals(passWord)){
		   throw new AuthenticationException("Login Failure.. The User Name Or PassWord was Invalid ");
	   }
	   else{
		   System.out.println("Login Successfull");
	   }
	}
	
    public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter user Name  : ");
		String user=s.nextLine();
		System.out.println("Enter PassWord : ");
		String pass =s.nextLine();
		try{
			isValid(user,pass);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}			
	}
}
		
	