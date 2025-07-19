package Compile_Time_Polimorphism;

//Polymorphism mein kuch condition hote hai jaise ke sabhi method ek hi naam ke hone chahiye aur sabhi ek hi class mein hone chahiye
//Aur sabhi ke parametre alag alag hone chahiye

// This code is number of parametre kyunki void mein dekhye int naam ka hi parametre hai

public class Intro {

   void m1(int no1) {
       System.out.println("No1 :" +no1);
    }
    void m1(int no1, int no2) {
        System.out.println("Result :"+(no1+no2));
    }

    public static void main(String[] args) {
        Intro obj = new Intro();
        obj.m1(10);
        obj.m1(10,20);
    }
}
