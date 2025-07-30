package Abstraction;

// Ek abstract class "RemoteDevice" banaiye jisme abstract methods ho: turnOn(), turnOff()
// Fir do classes banaiye: "TVRemote" aur "FanRemote"
// Dono classes me un methods ko override karke use print kariye
// TVRemote ka output: TV is ON / OFF
// FanRemote ka output: Fan is ON / OFF

abstract class RemoteDevice {
    abstract void turnOn();
    abstract void turnOff();
}

class TvRemote extends RemoteDevice{
    @Override
    void turnOn() {
        System.out.println("TVRemote ka output: TV is ON / OFF");
    }

    @Override
    void turnOff() {
        System.out.println("TvRemote ka output: Fan is OFF");
    }
}

class TanRemote extends RemoteDevice {
    @Override
    void turnOn() {
        System.out.println("FanRemote ka output: Tv is OFF");
    }

    @Override
    void turnOff() {
        System.out.println("FanRemote ka output: Fan is ON / OFF");
    }
}

public class Question_3 {
    public static void main(String[] args) {
        RemoteDevice tv = new TvRemote();
        tv.turnOn();
        tv.turnOff();

        RemoteDevice fan = new TvRemote();
        fan.turnOn();
        fan.turnOff();
    }
}
