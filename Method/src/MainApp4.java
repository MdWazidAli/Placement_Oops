 class Animal4 {

    void run() {
        System.out.println("Run");
    }
    }

class Birds {
    void fly() {
        System.out.println("Fly");
    }
}

public class MainApp4 {
    public static void main(String[] args) {
        Animal4 buzo = new Animal4();
        buzo.run();

        Birds sparrow = new Birds();
        sparrow.fly();

    }
}