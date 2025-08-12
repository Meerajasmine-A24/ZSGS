/*
5. Develop a Java application for a Ticket Booking System that allows users to book tickets for 
different types of transportation modes such as Bus, Train, and Flight.
Define a common interface or abstract class`Ticket with a method`bookTicket() that each transportation mode must implement differently.
Create classes`BusTicket,`TrainTicket, and`FlightTicket that extend the abstract class or implement the interface.
Demonstrate runtime polymorphism by calling the`bookTicket() method using a reference of the base class/interface. */

import java.util.Scanner;

abstract class Ticket{
	abstract void bookTicket();
}

class BusTicket extends Ticket{
	int id;
	String name;
	String destination;
	
	public BusTicket(int id,String name,String destination){
		this.id=id;
		this.name=name;
		this.destination=destination;
	}
	
	public void bookTicket(){
		System.out.println("Bus Ticket Booked Successfully ");
		System.out.println("Booking ID : "+id);
		System.out.println("Name of the passanger : "+name);
		System.out.println("Destination : "+destination);
		System.out.println("Bus will dispatch at 8 PM ");
	}
}

class TrainTicket extends  Ticket{
	int id;
	String name;
	String destination;
	String berthPrefernce;
	
	public TrainTicket(int id,String name,String destination,String berthPrefernce){
		this.id=id;
		this.name=name;
		this.destination=destination;
		this.berthPrefernce=berthPrefernce;
	}
	
	
	public void bookTicket(){
		System.out.println("Train Ticket Booked Successfully ");
		System.out.println("Booking ID : "+id);
		System.out.println("Name of the passanger : "+name);
		System.out.println("Destination : "+destination);
	    System.out.println(berthPrefernce +" was given ");
		System.out.println("Train will arrive at 5.30 PM ");
		
		}
}

class FlightTicket extends Ticket{
	int id;
	String name;
	String destination;
	
	public FlightTicket(int id,String name,String destination){
		this.id=id;
		this.name=name;
		this.destination=destination;
	}
	
	public void bookTicket(){
		System.out.println("Flight Ticket Booked Successfully ");
		System.out.println("Booking ID : "+id);
		System.out.println("Name of the passanger : "+name);
		System.out.println("Destination : "+destination);
		System.out.println("Flight will take off  at 11.00 AM ");	
		}
		
		
}

public class Problem5{
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your choice For Ticket booking appliaction   : \n1.Bus Ticket Booking \n 2.Train Ticket Booking \n 3.Flight Tcket Booking");
		int choice=s.nextInt();
		switch (choice) {
		case 1:
		Ticket busTicket=new BusTicket(101,"abc","mumbai");
		busTicket.bookTicket();
		break;
		case 2:
	    Ticket trainTicket=new TrainTicket(120,"xyz","chennai","lower");
		trainTicket.bookTicket();
		break;
		case 3 :
		Ticket flightTicket=new FlightTicket(456,"ABC","Paris");
		flightTicket.bookTicket();
		break;
		default :
		System.out.println("Invalid choice ");
	}
		
	}
}

	


