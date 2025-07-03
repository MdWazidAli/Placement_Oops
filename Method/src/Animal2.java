public class Animal2 {

    public  void run() {
        System.out.println("I am also run");
    }

    public static void main(String[] args) {
        Animal2 jumbo = new Animal2();
        jumbo.run();
        jumbo.eat();
    }
    public void eat() {
        System.out.println("I am eating..........");
    }
}
