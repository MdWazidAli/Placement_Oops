package Compile_Time_Polimorphism;

//🧠 Q06. Method Overloading: Area Calculator
//📐 Ek class banaiye: AreaCalculator
//Usmein method overloading ka use karke teen calculateArea() method banaiye:
//
//        🟢 calculateArea(int side) — square ka area nikale
//👉 Output: "Area of square: 25" agar side 5 ho
//
//🟠 calculateArea(int length, int breadth) — rectangle ka area nikale
//👉 Output: "Area of rectangle: 40" agar length 8, breadth 5 ho
//
//🔵 calculateArea(double radius) — circle ka area nikale (use Math.PI)
//👉 Output: "Area of circle: 78.54" agar radius 5 ho
//
//🖊️ main() method mein in teeno ko alag-alag values ke saath call kariye aur result print kariye.

public class AreaCalculator {

    void calculateArea(int side) {
        System.out.println("Area of square :" + side*side);
    }

    void calculateArea(int length, int breadth) {
        System.out.println("Area of rectangle :"+length*breadth);
    }

    void calculateArea(double radius) {
        System.out.println("Area of circle :"+Math.PI*radius*radius);
    }

    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();
        calc.calculateArea(5);
        calc.calculateArea(8,5);
        calc.calculateArea(5.0);
    }
}
