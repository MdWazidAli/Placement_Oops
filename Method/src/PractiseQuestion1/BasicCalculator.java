package PractiseQuestion1;

public class BasicCalculator {
    public  int addition(int a, int b) {
        return a + b;
    }

    public int substraction(int a, int b) {
        return a - b;
    }

    public int division(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        BasicCalculator calc = new BasicCalculator();
        int no1 = 110;
        int no2 = 20;
        System.out.println("Addition: " + calc.addition(no1, no2));
        System.out.println("Substraction: " + calc.substraction(no1, no2));
        System.out.println("Division: " + calc.division(no1, no2));
    }
}



