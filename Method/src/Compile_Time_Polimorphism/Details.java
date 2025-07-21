package Compile_Time_Polimorphism;

//        ✅ Q5. Method Overloading Practice — Student Info Example
//👨‍🎓 Ek class banaiye: Student
//📝 Usmein teen overloaded methods banaiye showDetails() naam se:
//
//showDetails(String name) → sirf naam print kare
//
//showDetails(String name, int age) → naam aur age print kare
//
//showDetails(String name, int age, String course) → naam, age, aur course print kare
//
//🎯 main() method mein teen tarike se method call karke output dikhaiye.

public class Details {

    void showDetails(String name) {
        System.out.println("name :" + name);
    }
    void showDetails(String name, int age) {
        System.out.println("Name : " + name + " Age :" + age);
    }

    void showDetails(String name, int age, String course) {
        System.out.println("Name :" + name + " Age : " + age + " course : " + course);
    }

    public static void main(String[] args) {
        Details d = new Details();
        d.showDetails("Deep");
        d.showDetails("deep", 19);
        d.showDetails("deep", 19, "math");
    }
}
