package Interfaces;

abstract class Test1 {
//    ye concrete method hai
    void m1() {
        System.out.println("m1(): This is concrete method");
    }

//    ye abstract mothod hai
    abstract  void m2();
}

interface i1 {
    void m1();

    void m2();
}

public class Intro {
}



// interface mein hamesa abstract method hi hoga lekin abstract mein concete aur abstract dono aa sakte hai