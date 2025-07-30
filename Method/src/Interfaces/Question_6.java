package Interfaces;

//You are building a travel booking system that supports multiple modes of transport.
//
//Create an interface TransportBooking with a method book(String destination).
//
//Implement this interface in two classes:
//
//BusBooking: prints "Booked bus ticket to " + destination
//
//TrainBooking: prints "Booked train ticket to " + destination
//
//Create a class BookingSystem with a method startBooking(TransportBooking booking, String destination) that calls the book() method.
//
//In the main() method:
//
//Ask the user to choose the booking method (1 for Bus, 2 for Train)
//
//Ask the user to enter the destination
//
//Based on the input, call the appropriate booking method.

import java.util.Scanner;

interface TransportBooking {
    void book(String destination);
}

class BusBooking implements TransportBooking {
    public void book(String destination) {
        System.out.println("Booked bus ticket to " + destination);
    }
}

class TrainBooking implements TransportBooking {
    public void book(String destination) {
        System.out.println("Booked train ticket to " + destination);
    }
}

class BookingSystem {
    void startBooking(TransportBooking booking, String destination) {
        booking.book(destination);
    }
}

public class Question_6 {
    public static void main(String[] args) {
        TransportBooking bus = new BusBooking();
        TransportBooking train = new TrainBooking();

        BookingSystem bookingSystem = new BookingSystem();
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Book by Bus");
        System.out.println("2. Book by Train");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter destination: ");
        String destination = sc.nextLine();

        switch (choice) {
            case 1:
                bookingSystem.startBooking(bus, destination);
                break;
            case 2:
                bookingSystem.startBooking(train, destination);
                break;
            default:
                System.out.println("Invalid input");
        }

        sc.close();
    }
}


