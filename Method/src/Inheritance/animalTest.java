package Inheritance;

//🔷 Q5. Multilevel Inheritance – Animal → Dog → Puppy
//📘 Question:
//Ek base class banaiye: Animal
//
//Method: eat() – print kare: "Animal eats food"
//
//Ek subclass banaiye: Dog (extends Animal)
//
//Method: bark() – print kare: "Dog barks"
//
//Ek aur subclass banaiye: Puppy (extends Dog)
//
//Method: weap() – print kare: "Puppy weaps"
//
//        🎯 Aapko:
//Puppy class ka object banana hai
//
//        Usse eat(), bark(), aur weap() tino method call karne hai

class Animal4 {
    void eat() {
        System.out.println("Animal eat food:");
    }
}

class Dogy extends Animal4{
    void bark() {
        System.out.println("Dog barks:");
    }
}

class Puppy extends Dogy{
    void weap() {
        System.out.println("puppy weaps:");
    }
}

public class animalTest {

    public static void main(String[] args) {
        Puppy pup = new Puppy();
        pup.eat();
        pup.bark();
        pup.weap();
    }
}
