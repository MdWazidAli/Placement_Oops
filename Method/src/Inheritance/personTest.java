package Inheritance;

//🔹 Q2. Person - Student Example
//👤 Ek class banaiye: Person
//👨‍🎓 Ek subclass banaiye: Student
//Person mein method banaiye: introduce() — "I am a person"
//Student mein method banaiye: study() — "Student is studying"
//Student class mein introduce() method ko override kariye
//Main method mein Student ka object banakar dono method call kariye.


class Person {
    void introduce() {
        System.out.println("I am person");
    }
}

class Student extends Person{
    @Override
    void introduce() {
        System.out.println("I am person");
    }
    void study() {
        System.out.println("Student is studying");
    }
}

public class personTest {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.introduce();
        s1.study();
    }
}
