package Run_Time_Polimorphism;

//🧠 Q2. Runtime Polymorphism: Animal Sound
//🧾 एक Animal superclass और दो subclasses (Dog, Cat) बनाइए।
//
//        🧩 सबके अंदर एक makeSound() method हो —
//
//Animal class में बोले: "Some generic animal sound"
//
//Dog बोले: "Bark"
//
//Cat बोले: "Meow"
//
//        🖊️ main() method में:

//Animal type ka reference banaiye, lekin Dog aur Cat object assign karke unka makeSound() call kariye.

class Animal2 {
    void makeSound() {
        System.out.println("Some animal generic sound:");
    }
}

class Dog1 extends Animal2 {
    void makeSound() {
        System.out.println("Bark");
    }
}

class Cat1 extends Animal2{
    void makeSound() {
        System.out.println("Meow");
    }
}

public class Question2 {
    public static void main(String[] args) {
       Animal2 a1 = new Dog1();
       Animal2 a2 = new Cat1();

       a1.makeSound();
       a2.makeSound();
    }
}
