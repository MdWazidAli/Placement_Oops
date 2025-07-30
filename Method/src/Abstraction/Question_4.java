package Abstraction;

// Ek abstract class "BankAccount" banaiye jisme abstract method ho: withdraw(double amount)
// Fir do classes banaiye: "SavingsAccount" aur "CurrentAccount"
// Har account ka initial balance 1000 ho.
// withdraw() method me balance kam karke updated balance print karo.


abstract class BankAccount {
  abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    @Override
    void withdraw(double amount) {

    }
}

public class Question_4 {
}
