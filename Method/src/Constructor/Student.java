package Constructor;

public class Student {

    int rollno;
    String name;

    Student(int rn, String n) {
       rollno = rn;
       name = n;

    }

    public static void main(String[] args) {
        Student std1 = new Student(101, "Motu");
        System.out.println(std1.rollno+ " : " + std1.name);

        Student std2 = new Student(102, "Moti");
        System.out.println(std2.rollno+ " : " + std2.name);
    }
}
