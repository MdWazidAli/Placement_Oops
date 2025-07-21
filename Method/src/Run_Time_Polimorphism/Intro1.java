package Run_Time_Polimorphism;

class Animal {
    void sleep() {
        System.out.println("Animal sleep:");
    }
}

class Dog extends Animal{
    void sleep() {
        System.out.println("Dog sleep:");
    }
}

public class Intro1 {
    public static void main(String[] args) {
      Animal obj = new Dog();
      obj.sleep();
    }
}
