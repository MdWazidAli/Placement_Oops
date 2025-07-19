package Inheritance;

//🔷 Q7 – Method Overriding Example
//🔹 Ek class banaiye: Animal
//🔹 Ek subclass banaiye: Dog
//
//✅ Instructions:
//Animal class mein method: makeSound() → "Animal makes sound" print kare
//
//Dog class mein same method: makeSound() → "Dog barks" print kare
//
//Dog ka object bana ke makeSound() call karo

class Jenimal {
    void makeSound() {
        System.out.println("Animal make sound:");
    }
}

class Dogi extends Jenimal{
    @Override
    void makeSound() {
        System.out.println("Dog barks:");
    }
}

public class TestMethod {
    public static void main(String[] args) {
        Dogi d = new Dogi();
        d.makeSound();
    }
}
