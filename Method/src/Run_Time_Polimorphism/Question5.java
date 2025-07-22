package Run_Time_Polimorphism;

//🧠 Q5. Runtime Polymorphism — Payment System
//🧾 Ek Payment class banaiye jisme ek method ho pay() — fir isko 2 subclasses override karein:
//
//        ➕ Classes:
//Payment (base class)
//
//Method: void pay() { System.out.println("Processing payment..."); }
//
//CreditCard (extends Payment)
//
//Method override: "Paid using Credit Card"
//
//UPI (extends Payment)
//
//Method override: "Paid using UPI"
//
//        🎯 Requirements:
//main() method mein dono subclasses ko Payment reference se call karo.

class Payment {
    void pay() {
        System.out.println("Some payment method:");
    }
}

class CreditCard extends Payment{
    @Override
    void pay() {
        System.out.println("Paid using Credit Card");
    }
}

class UPI extends Payment{
    @Override
    void pay() {
        System.out.println("Paid using Upi");
    }
}

public class Question5 {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        Payment p2 = new UPI();

        p1.pay();
        p2.pay();
    }
}
