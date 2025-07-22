package Run_Time_Polimorphism;

//        🧠 Q4. Runtime Polymorphism: Vehicle Sounds
//
//🚗 Ek base class banaiye: Vehicle
//🔉 Usme ek method ho: sound() — jo sirf "Generic vehicle sound" print kare.
//
//        🚌 Fir do subclasses banaiye:
//
//Bus — jo sound() method ko override kare aur "Horn: BEEP BEEP" print kare.
//
//Bike — jo sound() method ko override kare aur "Horn: PEE PEE" print kare.
//
//        🧪 main() method mein:
//
//Vehicle type ke 2 references banaiye:
//
//Vehicle v1 = new Bus();
//
//Vehicle v2 = new Bike();
//
//Dono pe sound() call karke output dikhaiye.

class Gaadi {
    void sound() {
        System.out.println("Generic gaadi sound:");
    }
}

class Bus extends Gaadi{
    @Override
    void sound() {
        System.out.println("HORN: BEEP BEEP");
    }
}

class Bike extends Gaadi {
    @Override
    void sound() {
        System.out.println("Horn: PEE PEE");
    }
}

public class Question4 {
    public static void main(String[] args) {
        Gaadi g1 = new Bus();
        Gaadi g2 = new Bike();

        g1.sound();
        g2.sound();
    }
}
