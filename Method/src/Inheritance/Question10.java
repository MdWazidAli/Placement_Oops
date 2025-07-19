package Inheritance;

//🧠 Q10. Overriding aur Polymorphism: GrandChild Example
//🔷 Ek class banaiye: Parent
//🟢 Ek subclass banaiye: Child (jo Parent ko extend kare)
//🟠 Ek aur subclass banaiye: GrandChild (jo Child ko extend kare)
//
//📌 Sabhi classes mein ek hi method ho: show()
//
//Parent ka show(): "Parent's show()" print kare
//
//Child ka show(): "Child's show()" print kare
//
//GrandChild ka show(): "GrandChild's show()" print kare
//
//🖊️ main() method mein teen objects banaiye:
//
//Parent type ka reference, GrandChild object ke liye
//
//Child type ka reference, GrandChild object ke liye
//
//GrandChild type ka object
//
//Aur sab par show() method call kariye.

class Parents {
    void show() {
        System.out.println("Parent`s show:");
    }
}

class Childs extends Parents {
    @Override
    void show() {
        System.out.println("Child`s show:");
    }
}

class GrandChild extends Childs{
    @Override
    void show() {
        System.out.println("Grand`s Child show:");
    }
}

public class Question10 {
    public static void main(String[] args) {
        Parents p = new GrandChild();
        p.show();

        Childs c = new GrandChild();
        c.show();

        GrandChild g = new GrandChild();
        g.show();
    }
}
