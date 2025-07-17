package Constructor;

// 1) Add a default constructor (assign defaults)
// 2) Add a parameterized constructor for all fields
// 3) Add a constructor that only takes name and roll, sets default gpa
// Use constructor chaining where appropriate

public class Students {

    private String name;
    private  int rollno;
    private double gpa;

// 1) Add a default constructor (assign defaults)
//    public static void main(String[] args) {
//        Students std = new Students();
//        System.out.println(std.name);
//        System.out.println(std.rollno);
//        System.out.println(std.gpa);
//    }


    // 2) Add a parameterized constructor for all fields
//    Students(String n, int rn, double g) {
//        name = n;
//        rollno = rn;
//        gpa = g;
//    }
//
//    public static void main(String[] args) {
//        Students std = new Students("Hello", 103, 7.5);
//        System.out.println(std.name + " " + std.rollno + " " + std.gpa);
//    }


    // 3) Add a constructor that only takes name and roll, sets default gpa
    Students(String nm, int rollnumber) {
        name = nm;
        rollno = rollnumber;
    }

    public static void main(String[] args) {
        Students std = new Students("Rohail", 190);
        System.out.println(std.name + " " + std.rollno);
    }
}
