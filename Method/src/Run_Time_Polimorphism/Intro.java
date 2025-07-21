package Run_Time_Polimorphism;

//  Run time mein void ka naam same hona chahiye lekin class different mein same hona chahiye aur wo is-a relationship inheritance follow karta ho;
// run time ya override hum isliye karte hai ke parent class ke defination change kar saku

// Run Time Polymorphism ek mechanism hai jiske through main parent class ki defination change kar sakta hoon and then JVM hi run time per decide karti hai
// ke konsa method usko INVOKE karwana hai object ke basis per reference ke basis par decide nahi karti hai;

class A {
    void m1(String str, int no) {
        System.out.println("m1() method in class A");
    }
}

class B extends A{

    @Override
    void m1(String str, int no) {
        System.out.println("m1() method in class B");
    }
}

public class Intro {

    public static void main(String[] args) {
       A obj = new A();
       obj.m1("poly", 12);

       B obj1 = new B();
       obj1.m1("k", 89);
    }
}
