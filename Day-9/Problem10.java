/* Write a Java program to manage a voting system where a person must be at least 18 years old to be eligible to vote.
 Use a custom exception to handle the scenario when an ineligible person tries to register for voting.
 Display appropriate messages for eligible and ineligible voters. */
 
import java.util.Scanner;

class VotingEligiblityException extends Exception {
	public VotingEligiblityException(String message){
		super(message);
	}
}

public class Problem10{
	public static void isValidVote(int age) throws VotingEligiblityException{
		if(age<18){
			throw new VotingEligiblityException("You are Under 18..Not Eligible to make registration for Vote ");
		}
		else{
			System.out.println("Registration Successfull ");
		}
	}
	
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your age : ");
		int age=s.nextInt();
		try{
			isValidVote(age);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}

		
		


