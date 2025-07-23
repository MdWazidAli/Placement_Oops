package Abstraction;

class Car {
    int no_of_tyres = 4;
    void displayTyres() {
        System.out.println("No of tyres: " + no_of_tyres);
    }

    void start() {
        System.out.println("Car start with key:");
    }
}

class Scooter {
    int no_of_tyres = 2;
    void displayTyres () {
        System.out.println("No of tyres: "+ no_of_tyres);
    }
    void start(){
        System.out.println("Bike start with kick:");
    }
}

public class Intro {
    public static void main(String[] args) {
      Car car = new Car();
      car.displayTyres();
      car.start();

        System.out.println();

        Scooter sc = new Scooter();
        sc.displayTyres();
        sc.start();
    }
}


// Is program ke andar bahut sare disadvantages hai jiski wajah se humlog abstraction ka use karte hai 