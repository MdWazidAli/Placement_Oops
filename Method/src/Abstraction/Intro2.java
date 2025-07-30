package Abstraction;

abstract class Vehicle {
    int no_of_tyres;
    void displayTyres() {
        System.out.println("No of tyres: " + no_of_tyres);
    }
    abstract void start();
}

class Car1 extends Vehicle {
    void start() {
        no_of_tyres = 4;
        System.out.println("Car start with key:");
    }
}

class Scooter1 extends Vehicle {
    void start() {
        no_of_tyres = 6;
        System.out.println("Scooter starts with key:");
    }
}

public class Intro2 {
    public static void main(String[] args) {
        Vehicle car = new Car1();
        car.start();
        car.displayTyres();


        Vehicle scooter = new Scooter1();
        scooter.start();
        scooter.displayTyres();

    }
}

// ye code tightly coupled nahi hai ye loose coupled hai intro1 ke code se
// ek dusre ke uper jyada depend nahi rahega


//Abstract hum usko bolte hai jiski implementation nahi hoti hai
