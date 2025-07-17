package Inheritance;

//🔹 Q1. Animal - Dog Example
//🐾 Ek class banaiye: Animal
//🐶 Ek subclass banaiye: Dog
//Animal mein ek method banaiye: makeSound() — "Some generic sound" print kare
//Dog mein ek method banaiye: bark() — "Dog is barking" print kare
//Main method mein Dog ka object banakar dono method call kariye.


class Animal1 {
    void makeSound() {
        System.out.println("Some generic sound");
    }
}

class dog extends Animal1{
    void bar() {
        System.out.println("Dog is barking");
    }
}

public class Animal {
    public static void main(String[] args) {
        dog dogy = new dog();
        dogy.makeSound();
        dogy.bar();
    }

}
