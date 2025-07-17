package Inheritance;

// Single level iheritance:

class Parent {
    void eyesColor() {
        System.out.println("Eyes Color Is Brown");
    }
}

class Child extends Parent{

}

public class MainApp {
    public static void main(String[] args) {
        Child c = new Child();
        c.eyesColor();
    }
}

// Child class jo hai apne parent class ke sare properties ko inherit nahi kar sakti kyunki parent class mein agar private raha
//to wo inherit nahi kar sakta aur parent class ke constructor ko bhi inherit nahi kar sakta kyunki constructor apne class ke bahar nahi access ho sakta hai
