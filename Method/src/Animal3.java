public class Animal3 {
    public void run(String name, int distance_km) {
        System.out.println(name+ " Is running " + distance_km + "km daily.");
    }

    public static void main(String[] args) {
        Animal3 jumbo = new Animal3();
        jumbo.run("jumbo", 12);
        jumbo.eat("jumbo", "meat");
        jumbo.sleep("jumbo", 5);

        Animal3 buzo = new Animal3();
        buzo.run("buzo", 10);
        buzo.eat("buzo", "grass");
        buzo.sleep("buzo", 2);

        Animal3 keemo = new Animal3();
        keemo.eat("keemo","apple");
        keemo.run("keemo",12);
        keemo.sleep("keemo", 15);
    }

    public void eat(String name, String dish) {
        System.out.println(name + " eat " + dish);
    }
    public void sleep(String name, int hour) {
        System.out.println();
    }
}
