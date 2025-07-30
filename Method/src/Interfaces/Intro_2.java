package Interfaces;

interface Printable {
    void print();
}

class Documents implements  Printable{
    public void print() {
        System.out.println("Document Printed:");
    }
}

class Image implements Printable{
    public void print() {
        System.out.println("Image Printed:");
    }
}

public class Intro_2 {
}
