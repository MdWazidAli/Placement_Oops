package Inheritance;

import java.awt.event.HierarchyEvent;

//This is Hierarchical inheritance

class A4 {
    void showD () {
        System.out.println("This is A4 Class:");
   }
}

class A5 extends A4{
    void showE() {
        System.out.println("This is class A5");
    }
}

class A6 extends A5{
    void showF() {
        System.out.println("This is class A6");
    }
}

public class MainApp3 {

    public static void main(String[] args) {
        A4 obj = new A4();
        obj.showD();

        A5 obj1 = new A5();
        obj1.showE();
        obj1.showD();

        A6 obj2 = new A6();
        obj2.showF();
        obj2.showD();
    }
}
