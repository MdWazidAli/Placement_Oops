package Interfaces;

//🔶 Question 5
//Design an abstraction-based program where:
//
//There is an abstract class FoodDelivery with a method deliver(String foodItem, String location).
//
//Two classes Zomato and Swiggy inherit from FoodDelivery.
//
//Zomato prints: "Zomato delivered <foodItem> to <location>"
//
//Swiggy prints: "Swiggy delivered <foodItem> to <location>"
//
//In main:
//
//Create object of Zomato and Swiggy using FoodDelivery reference.
//
//        Call deliver() method with any food and location of your choice.

abstract class FoodDelivery {
    abstract void delivery(String foodItem, String location);
}

class Zomato extends FoodDelivery {
    @Override
    void delivery(String foodItem, String location) {
        System.out.println("Zomato delivered " + foodItem + " to " + location);
    }
}

class Swiggy extends FoodDelivery {
    @Override
    void delivery(String foodItem, String location) {
        System.out.println("Swiggy delivered " + foodItem + " to " + location);
    }
}

public class Question_5 {
    public static void main(String[] args) {
        FoodDelivery food = new Zomato();
        FoodDelivery foo = new Swiggy();

        food.delivery("Biryani", "Delhi");
        foo.delivery("Pizza", "Mumbai");
    }
}
