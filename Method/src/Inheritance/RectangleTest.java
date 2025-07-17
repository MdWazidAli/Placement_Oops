package Inheritance;

//Q3. Shape - Rectangle Example
//🔷 Ek class banaiye: Shape
//🟥 Ek subclass banaiye: Rectangle
//Shape mein method banaiye: display() — "This is a shape"
//Rectangle mein method banaiye: area() jo 10x5 ka area nikaale
//Rectangle ka object banakar dono method call kariye

class Shape {
    void display() {
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape{

    void area(int a, int b) {
        System.out.println(a*b);
    }
}

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.display();
        r1.area(10,5);
    }
}
