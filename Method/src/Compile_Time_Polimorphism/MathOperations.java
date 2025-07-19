package Compile_Time_Polimorphism;

//🧠 Q3. Method Overloading with Return Value: Calculator Example
//🧮 Ek class banaiye: MathOperations
//🔢 Isme teen methods ho multiply() naam se — lekin alag arguments ke saath:
//
//int multiply(int a, int b) — dono integers ka multiplication return kare
//
//double multiply(double a, double b) — dono doubles ka multiplication return kare
//
//int multiply(int a, int b, int c) — teen integers ka multiplication return kare
//
//🖊️ main() method mein teenon ko alag-alag arguments ke saath call karke result print karo.

public class MathOperations {


    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        MathOperations mul = new MathOperations();

        int result1 = mul.multiply(1,2);
        double result2 = mul.multiply(2.1,3.1);
        int result3 = mul.multiply(1,2,3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

}
