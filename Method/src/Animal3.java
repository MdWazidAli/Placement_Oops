public class Animal3 {
    public void run(String name, int distance_km) {
        System.out.println(name+ " Is running.." + distance_km + "km");
    }

    public static void main(String[] args) {
        Animal3 jumbo = new Animal3();
        jumbo.run("jumbo", 12);
        jumbo.eat("jumbo", "meat");

        Animal3 buzo = new Animal3();
        buzo.run("buzo", 10);
        buzo.eat("buzo", "grass");
    }

    public void eat(String name, String dish) {
        System.out.println(name+ "I am eat..." + dish);
    }
}
