package Interfaces;

//🔹 Question 2:
//एक abstract class Order बनाईये जिसमें abstract method हो placeOrder(String item, int quantity)।
//
//अब दो subclasses बनाईये:
//
//OnlineOrder → Output: "Ordered <quantity> <item>(s) online"
//
//StoreOrder → Output: "Purchased <quantity> <item>(s) from store"
//
//main() में इन दोनों methods को call करके output दिखाइए।

abstract class Order {
    abstract void  placeOrder(String item, int quantity);
}

class OnlineOrder extends Order {
    void placeOrder(String item, int quantity) {
        System.out.println("Ordered " + quantity + " " + item + "(s) online");
    }
}

class StoreOrder extends Order {
    void placeOrder(String item, int quantity) {
        System.out.println("Purchased " + quantity + " " + item + "(s) from store");
    }
}

public class Question_2 {
    public static void main(String[] args) {
        Order r = new OnlineOrder();
        Order r1 = new StoreOrder();

        r.placeOrder("sone",10);
        r1.placeOrder("chua", 14);
    }
}
