package Compile_Time_Polimorphism;

//🧠 Q09. Method Overloading: Student Report Generator
//
//📄 Ek class banaiye: StudentReport

//🧑‍🎓 Us class mein teen overloaded methods banaiye: generateReport()
//Har method student ke details alag-alag level par print kare:
//
//        🔹 generateReport(String name)
//➤ Sirf student ka naam print kare:
//        "Name: Rahul"
//
//        🔸 generateReport(String name, int marks)
//➤ Naam aur marks print kare:
//        "Name: Rahul, Marks: 85"
//
//        🔹 generateReport(String name, int marks, String grade)
//➤ Naam, marks aur grade print kare:
//        "Name: Rahul, Marks: 85, Grade: A"
//
//        🖊️ main() method mein teeno tarike se method ko call karke output dikhaiye.

public class StudentReport {

    void generateReport(String name) {
        System.out.println("Name: " + name);
    }

    void generateReport(String name, int marks) {
        System.out.println("Name: " + name +", " + "Marks: " + marks);
    }

    void generateReport(String name, int marks, String grade) {
        System.out.println("Name: " + name + ", " + "Marks: " + marks + ", " + " Grade: "+ grade);
    }

    public static void main(String[] args) {
        StudentReport std = new StudentReport();
        std.generateReport("Rahul");
        std.generateReport("Rahul", 99);
        std.generateReport("Rahul", 99, "A");
    }
}
