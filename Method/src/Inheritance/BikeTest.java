package Inheritance;

//🔷 Q6. Vehicle - Bike & Car Example (Hierarchical Inheritance)
//🔹 Ek parent class banaiye: Vehicle
//🔹 Do subclasses banaiye: Bike aur Car
//
//✏️ Instructions:
//Vehicle class mein method: fuelType() → "Vehicle uses fuel" print kare
//
//Bike class mein method: kickStart() → "Bike starts with a kick" print kare
//
//Car class mein method: start() → "Car starts with key" print kare

class Vehicle1 {
    void fuelType() {
        System.out.println("Vehicle uses fuel:");
    }
}

class Bike extends Vehicle1{
    void kickStart() {
        System.out.println("Bike start with a kick:");
    }
}

class Car1 extends Vehicle1{
    void start() {
        System.out.println("Car start with key:");
    }
}

public class BikeTest {

    public static void main(String[] args) {

        Bike b1 = new Bike();
        b1.fuelType();
        b1.kickStart();

        Car1 c = new Car1();
        c.fuelType();
        c.start();

    }
}
