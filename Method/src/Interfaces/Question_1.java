package Interfaces;

//🔹 Question 1:
//आप एक abstract class BillPayment बनाइए जिसमें एक abstract method हो pay(int amount)।
//
//फिर दो subclasses बनाइए:
//
//CreditCardPayment → Output होना चाहिए: "Paid ₹<amount> using Credit Card"
//
//UpiPayment → Output होना चाहिए: "Paid ₹<amount> using UPI"
//
//main() method में दोनों classes की objects से respective methods call करें।

abstract class BillPayment {
    abstract void pay(int amount);
}

class CreditCardPayment extends BillPayment{
     void pay(int amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

class UpisPayment extends BillPayment{
    void pay(int amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

public class Question_1 {
    public static void main(String[] args) {
        BillPayment p1 = new CreditCardPayment();
        BillPayment p2 = new UpisPayment();

        p1.pay(1000);
        p2.pay(20000);
    }
}
