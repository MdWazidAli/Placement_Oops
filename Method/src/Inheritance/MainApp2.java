package Inheritance;

// Multi level inheritance

class A1 {
    void showA() {
        System.out.println("Show A1");
    }
}

class A2 extends A1{
    void showB() {
        System.out.println("Show A2");
    }
}

class A3 extends A2{
    void showC() {
        System.out.println("Show A3");
    }
}

public class MainApp2 {
    public static void main(String[] args) {
        A1 obj1 = new A1();
        obj1.showA();


        A2 obj2 = new A2();
        obj2.showB();
        obj2.showA();

        A3 obj3 = new A3();
        obj3.showC();
        obj3.showB();
    }
}
