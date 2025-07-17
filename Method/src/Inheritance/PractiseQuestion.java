package Inheritance;

// Ek class banaiye: Vehicle
// Ek subclass banaiye: Car

// Vehicle mein ek method banaiye: startEngine()
// Car mein ek method banaiye: drive()

// Car ka object banaiye aur dono methods call kariye

class Vehicle {
    void startEngine() {
        System.out.println("Car is ready to start:");
    }
}

class Car extends Vehicle{
    void drive() {
        System.out.println("Car is started:");
    }
}


public class PractiseQuestion {

    public static void main(String[] args) {
        Vehicle obj = new Vehicle();
        obj.startEngine();

        Car obj1 = new Car();
        obj.startEngine();
        obj1.drive();
    }
}
