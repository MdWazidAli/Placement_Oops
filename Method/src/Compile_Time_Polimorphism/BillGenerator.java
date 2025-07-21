package Compile_Time_Polimorphism;

//🧠 Q07. Method Overloading: Billing System
//
//🛒 Ek class banaiye: BillGenerator
//Usmein 3 overloaded methods banaiye: generateBill() alag-alag tarike se kaam kare:


public class BillGenerator {

    void generateBill(String name, int quantity) {
        System.out.println("Item :"+ name + "Quantity :"+quantity);
    }

    void generateBill(String name, int quantity, double price) {
        System.out.println("Item:"+ name + ", Quantity: "+quantity+ ", Total price: " +price);
    }

    void generateBill() {
        System.out.println("No item in the cart");
    }

    public static void main(String[] args) {
        BillGenerator bill = new BillGenerator();
        bill.generateBill("Pen", 10);
        bill.generateBill("Pen",10,100.0);
        bill.generateBill();
    }
}
