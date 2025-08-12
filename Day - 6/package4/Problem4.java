/* Design a travel booking system using two packages:`travel.booking – 
includes a class`Ticket with ticket ID, destination, and fare.`travel.user –
 includes a class`User with user details and a method to book a ticket.
Illustrate accessing ticket data from within the user class. */

import java.util.Scanner;
import user.User;

public class Problem4{
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter user ID : ");
        int id=s.nextInt();
        System.out.println("Enter user Name : ");
        String name=s.next();
        
        User user=new User(id,name);
		user.display();
		user.bookTicket();
		
		
	}
}
	
		

