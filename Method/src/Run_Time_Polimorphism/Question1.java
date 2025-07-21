package Run_Time_Polimorphism;

//🧠 Q1. Covariant Return Type in Action
//
//🔷 Ek class banaiye: Fruit
//🍎 Usse extend karne wali class banaiye: Apple
//
//📏 Fruit class mein ek method ho: getFruit()
//– Jo return kare Fruit object
//🟢 Apple class usi method ko override kare
//– Aur return kare Apple object
//
//🖊️ main() method mein object banaiye Apple ka
//– Aur getFruit() call karke output dikhaiye

class Fruit {
    Fruit getFruit() {
        System.out.println("Fruits:");
        return this;
    }
}

class Apple extends Fruit {
    Apple getFruit(){
        System.out.println("Get fruits:");
        return null;
    }
}

public class Question1 {
    public static void main(String[] args) {
      Fruit fruit = new Apple();
      fruit.getFruit();
    }
}
