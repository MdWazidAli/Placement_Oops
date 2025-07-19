package Inheritance;

//🧠 Q8. Overriding in Action: Shape Example
//🔷 Ek class banaiye: Shape
//📏 Ek subclass banaiye: Circle
//🟢 Shape class mein ek method ho: draw() — "Drawing a generic shape" print kare
//🟠 Circle class usi method ko override kare aur "Drawing a circle" print kare
//🖊️ main() method mein Circle ka object banakar draw() call kijiye

class Shape1 {
    void draw() {
        System.out.println("Drawing a generic shape:");
    }
}

class Circle extends Shape1{
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}


public class Drawing {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
    }
}
