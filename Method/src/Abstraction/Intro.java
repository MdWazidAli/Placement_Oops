package Abstraction;

public class Intro {
    abstract class Animal {
        abstract void sound();
    }

    class Dog extends Animal {
        void sound() {
            System.out.println("Bark");
        }
    }

}
