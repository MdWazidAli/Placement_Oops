package Compile_Time_Polimorphism;

//🧠 Q2. Method Overloading: PrintInfo Example
//🖨️ Ek class banaiye: InfoPrinter
//🧾 Us class mein teen printInfo() methods banaiye:
//
//printInfo(String name) → "Name: <name>" print kare
//
//printInfo(int age) → "Age: <age>" print kare
//
//printInfo(String name, int age) → "Name: <name>, Age: <age>" print kare
//
//🧪 main() method mein in teenon methods ko alag-alag parameters ke sath call kijiye.

public class InfoPrinter {

    void printInfo(String name ) {
        System.out.println("Name: <name> " + name);
    }

    void printInfo(int age) {
        System.out.println("Age: <age> " + age);
    }

    void printInfo(String name, int age) {
        System.out.println("Name: <name>, Age: <age> " + name+ " " + age);
    }

    public static void main(String[] args) {
        InfoPrinter info = new InfoPrinter();
        info.printInfo("Kaka");
        info.printInfo(90);
        info.printInfo("Kaka", 90);
    }
}
