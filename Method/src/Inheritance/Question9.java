package Inheritance;

//🔹 Q9. Method Overriding — Shape Example (Tricky)
//🔸 Ek class hai Shape1, jisme draw() method hai.
//        🔸 Do subclasses hain: Circle aur Square, dono draw() override karte hain.
//        🔸 main() mein hum reference Shape1 ka lete hain, lekin object Circle aur Square ka banate hain.


class Shape2 {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle1 extends Shape2 {
    @Override
    void draw() {
        System.out.println("Drawing a circle:");
    }
}

class Square extends Shape2 {
    @Override
    void draw() {
        System.out.println("Drawing a square:");
    }
}

public class Question9 {
    public static void main(String[] args) {
        Shape2 s = new Circle1();
        Shape2 s2 = new Square();

        s.draw();
        s2.draw();
    }
}
