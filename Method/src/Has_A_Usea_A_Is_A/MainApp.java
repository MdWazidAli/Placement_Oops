package Has_A_Usea_A_Is_A;


class Address {
    String  city = "Pune";
    String country = " India ";

    void displayAddress() {
        System.out.println(" City: " + city + " Country: " + country);
    }
}

class Students1 {
    String name = "Deepak";
    int rollno = 192;

    Address address = new Address();

    void displayInfo() {
        System.out.println("Name: " + name + " Rollno: " + rollno);
        address.displayAddress();
    }
}

public class MainApp {

    public static void main(String[] args) {
          Students1 student = new Students1();
          student.displayInfo();
    }
}
