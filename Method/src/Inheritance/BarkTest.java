package Inheritance;
//
//🔷 Q4. Hierarchical Inheritance – Animal, Dog, Cat Example
//📘 Question:
//Ek parent class banaiye: Animal
//
//Animal class mein ek method ho: makeSound() jo print kare "Animal makes sound"
//
//Do child classes banaiye:
//
//Dog (extends Animal)
//
//Cat (extends Animal)
//
//Dog mein method ho: bark() — print kare "Dog barks"
//
//Cat mein method ho: meow() — print kare "Cat meows"
//
//        🎯 Aapko:
//Dono classes ka object banana hai
//
//Unse makeSound() + apna apna method call karna hai
//
//✅ Output Example:
//nginx
//        Copy
//Edit
//Animal makes sound
//Dog barks
//Animal makes sound
//Cat meows

class Animal2 {
    void makeSound() {
        System.out.println("Animal make sound:");
    }
}

class Dog extends Animal2{
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal2{
    void meow() {
        System.out.println("Cat meow");
    }
}

public class BarkTest {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.makeSound();
        d.bark();

        Cat c = new Cat();
        c.makeSound();
        c.meow();

    }
}
