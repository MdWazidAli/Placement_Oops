package Interfaces;

import java.util.Scanner;

interface Payment {
    void pay();
}

class UpiPayment implements Payment{
    public void pay() {
        System.out.println("Payed using upi:");
    }
}

class NetBankingPayment implements Payment{
    public void pay() {
        System.out.println("Payed using netBanking:");
    }
}

class CheckOut {
    void processPayment (Payment payment) {
        payment.pay();
    }
}

public class Intro_3 {
    public static void main(String[] args) {
        Payment upi = new UpiPayment();
        Payment netBanking = new NetBankingPayment();

        CheckOut checkout = new CheckOut();

        System.out.println("1. Pay using UPI:");
        System.out.println("2. Pay using NetBanking:");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number Between 1 & 2:");
        int user_input = sc.nextInt();

        switch (user_input) {
            case 1:
                checkout.processPayment(upi);
                break;
            case 2:
                checkout.processPayment(netBanking);
                break;
            default:
                System.out.println("Invalid input:");
        }
    }
}
