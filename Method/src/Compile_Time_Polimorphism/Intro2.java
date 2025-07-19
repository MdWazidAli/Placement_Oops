package Compile_Time_Polimorphism;

// This code is types of parametre kyunki is code ke void mein int aur string do alag type ke parametre hai

public class Intro2 {

    void m2(int no1) {
        System.out.println("No is : " + no1);
    }

    void m2(String name) {
        System.out.println("Name is : " + name);
    }

    public static void main(String[] args) {
        Intro2 obj = new Intro2();
        obj.m2(10);
        obj.m2("Motapa");
    }
}
