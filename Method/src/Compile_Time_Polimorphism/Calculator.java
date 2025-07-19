package Compile_Time_Polimorphism;

// 1) add two ints
// 2) add three floats
// 3) add two strings (concatenate)

public class Calculator {

    void calc(int a, int b) {
        System.out.println("Add two integers: " + (a+b));
    }
    void calc(float a, float b, float c) {
        System.out.println("Add three floats are: " + (a+b+c));
    }
    void calc(String a, String b) {
        System.out.println("Add two string are: " + (a+b));
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.calc(10,20);
        obj.calc(3.0f,5.0f,6.0f);
        obj.calc("Motapa ", "Motapi");
    }
}
