package Interfaces;

//💻 Question 4:
//Implement an abstract class Transport with a method bookTicket(String destination).
//Create two subclasses BusTransport and FlightTransport.
//Each subclass should print:
//
//BusTransport: Ticket booked to <destination> by Bus
//
//FlightTransport: Ticket booked to <destination> by Flight
//
//In main(), create objects of both and call their methods.

abstract class Transport {
    abstract void bookTicket(String destination);
}

class BusTransport extends Transport{
    @Override
    void bookTicket(String destination) {
        System.out.println("BusTransport: Ticket booked to " + destination + " by bus");
    }
}

class FlightTransport extends Transport {
    @Override
    void bookTicket(String destination) {
        System.out.println("FlightTransport: Ticket booked to " + destination + " by Flight");
    }
}

public class Question_4 {
    public static void main(String[] args) {
        Transport tra = new BusTransport();
        Transport trans = new FlightTransport();

        tra.bookTicket("Shimla");
        trans.bookTicket("Nawada");
    }
}
