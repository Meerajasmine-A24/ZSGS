package user;
import booking.Ticket;
public class User{
   int userId;
   String userName;
   
   public User(int userId,String userName){
	   this.userId=userId;
	   this.userName=userName;
   }
   
    public void display(){
	   System.out.println("User Id : "+userId);
	   System.out.println("User Name : "+userName);
	   
   }
	   
  public  void bookTicket(){
	   int ticketId=1;
	   String designation="chennai";
	   double fare=450.60;
	   
	   Ticket ticket=new Ticket(ticketId,designation,fare);
	   ticket.booking();
   }
   
  
   
}
   