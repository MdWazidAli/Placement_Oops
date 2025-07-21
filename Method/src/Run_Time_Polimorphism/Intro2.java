package Run_Time_Polimorphism;


//🧠 Q: Covariant Return Type Example
//📝 Ek class banaiye: Vehicle
//Usme ek method ho: Vehicle getVehicle() — jo "Returning Vehicle" print kare.
//
//        🔧 Fir ek subclass banaiye: Car extends Vehicle
//Usme getVehicle() method ko override kijiye, lekin return type ho Car, aur print kare "Returning Car".
//
//        👨‍🏫 Ek class Main banaiye, jisme main() method ho — jahan:
//
//Car class ka object banaiye
//
//        getVehicle() method call karke output dikhaiye


class Vehicle {
    Vehicle getVehicle() {
        System.out.println("Returning vehicle:");
        return this;
    }
}

class Car extends Vehicle {
    @Override
    Car getVehicle() {
        System.out.println("Returning car");
        return this;
    }
}

public class Intro2 {

    public static void main(String[] args) {
        Car car = new Car();
        car.getVehicle();
    }

}
