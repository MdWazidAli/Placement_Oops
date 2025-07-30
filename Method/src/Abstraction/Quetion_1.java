package Abstraction;

// Ek abstract class "Vehicle" banaiye jisme ek method ho "start()".
// Fir do classes banaiye "Car" aur "Bike" jo "Vehicle" class ko extend karein
// Aur dono classes me start() method ko override karke output dijiye:
// Car: Engine started
// Bike: Kick started

abstract class Vehicle2 {
  abstract   void start();
}

class Car2 extends Vehicle2 {
    void start() {
        System.out.println("Engine started: ");
    }
}

class Bike extends Vehicle2{
    void start() {
        System.out.println("Kick started: ");
    }
}

public class Quetion_1 {
    public static void main(String[] args) {
        Vehicle2 car = new Car2();
        car.start();

        Vehicle2 bike = new Bike();
        bike.start();
    }
}
