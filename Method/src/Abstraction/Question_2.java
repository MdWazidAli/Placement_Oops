package Abstraction;

// Ek abstract class "Employee" banaiye jisme ek method ho "calculateSalary()".
// Fir do classes banaiye "FullTimeEmployee" aur "PartTimeEmployee"
// Jahan full time employee ka salary = basic + bonus
// Aur part time employee ka salary = hourlyRate * hoursWorked
// Main method mein dono objects banakar salary print kariye.

abstract class Employee {
    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee {
    @Override
    void calculateSalary() {
        int basic = 4;
        int bonus = 5;
        System.out.println("Full time: " + (basic+bonus));
    }
}

class PartTimeEmployee extends Employee {
    @Override
    void calculateSalary() {
        int basic = 4;
        int bonus = 5;
        System.out.println("Part time: " + (basic*bonus));
    }
}

public class Question_2 {
    public static void main(String[] args) {
        Employee imp = new FullTimeEmployee();
        imp.calculateSalary();

        Employee impp = new PartTimeEmployee();
        impp.calculateSalary();
    }
}
