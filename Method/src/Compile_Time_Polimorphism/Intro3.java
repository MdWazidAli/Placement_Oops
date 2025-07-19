package Compile_Time_Polimorphism;

// This code is oreder of parametre

// order of parametre mein method mein matlab void mein ek mein hum int aur string pehle denge aur dusre mein string aur int denge to bhi method overloading achieve ho jayega

public class Intro3 {

    void m3(int no, String name) {
        System.out.println(no+ " - "+name);
    }
    
    void m3() {
        System.out.println("Heli");
    }

    void m3(String name, int no) {
        System.out.println(name+ " - "+no);
    }

    public static void main(String[] args) {
      Intro3 obj = new Intro3();
      obj.m3(10,"Motapa");
      obj.m3("Motapa", 20);
      obj.m3();
    }
}
