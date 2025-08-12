package booking;

public class Ticket{
   int ticketId;
   String destination;
   double fare;
   
   public Ticket(int ticketId,String destination,double fare){
	   this.ticketId=ticketId;
	   this.destination=destination;
	   this.fare=fare;
   }
    public  void booking(){
	   System.out.println("\n Ticket Id  : " + ticketId);
	   System.out.println("Destination : " +destination);
	   System.out.println("Fare : "+fare);
	   System.out.println("Ticket Booked Successfully");
	   
   }
 
   
}
