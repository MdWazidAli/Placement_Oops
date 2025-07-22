package Run_Time_Polimorphism;

//🔵 Q3. Runtime Polymorphism: Shape Drawing
//
//🧾 Ek program banaiye jisme runtime polymorphism ka use ho:
//
//        🔹 Ek parent class banaiye Shape naam se, jisme ek method ho:
//void draw() – jo print kare "Drawing a shape"
//
//        🔸 Do child classes banaiye:
//
//Circle class – jo draw() method override kare aur print kare: "Drawing a circle"
//
//Rectangle class – jo draw() method override kare aur print kare: "Drawing a rectangle"
//
//        🧪 main() method mein:
//
//Shape s1 = new Circle();
//
//Shape s2 = new Rectangle();
//
//Fir call kariye: s1.draw(); aur s2.draw();

class Shape {

    void draw() {
        System.out.println("Drawing a shape:");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle:");
    }
 }

 class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle:");
    }
 }

public class Question3 {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.draw();
        s2.draw();
    }

}
