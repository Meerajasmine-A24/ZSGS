/* Design a Java Ticket Booking System using polymorphism where Bus, Train, and Flight tickets 
share a common method but
 implement booking differently */
 
 class Ticket {
    String passengerName;
    String source;
    String destination;

    Ticket(String passengerName, String source, String destination) {
        this.passengerName = passengerName;
        this.source = source;
        this.destination = destination;
    }

    void bookTicket() {
        System.out.println("Booking ticket for " + passengerName);
    }
}

class BusTicket extends Ticket {
    BusTicket(String passengerName, String source, String destination) {
        super(passengerName, source, destination);
    }

    void bookTicket() {
        System.out.println("Bus Ticket booked for " + passengerName + " from " + source + " to " + destination);
        System.out.println("Seat No: B12, Departure Time: 10:00 AM");
    }
}

class TrainTicket extends Ticket {
    TrainTicket(String passengerName, String source, String destination) {
        super(passengerName, source, destination);
    }

    void bookTicket() {
        System.out.println("Train Ticket booked for " + passengerName + " from " + source + " to " + destination);
        System.out.println(" Berth: Upper, Departure Time: 2:30 PM");
    }
}

class FlightTicket extends Ticket {
    FlightTicket(String passengerName, String source, String destination) {
        super(passengerName, source, destination);
    }

    void bookTicket() {
        System.out.println("Flight Ticket booked for " + passengerName + " from " + source + " to " + destination);
        System.out.println("Flight No: AI123, Seat No: 22A, Departure Time: 6:45 AM");
    }
}

public class Problem4 {
    public static void main(String[] args) {
        Ticket t1 = new BusTicket("ABC", "Chennai", "Bangalore");
        Ticket t2 = new TrainTicket("PQRS", "Delhi", "Kolkata");
        Ticket t3 = new FlightTicket("XYZ", "Mumbai", "Dubai");

        t1.bookTicket();
        System.out.println();
        t2.bookTicket();
        System.out.println();
        t3.bookTicket();
    }
}
