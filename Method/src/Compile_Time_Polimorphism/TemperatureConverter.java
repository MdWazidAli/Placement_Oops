package Compile_Time_Polimorphism;

//🧠 Q08. Method Overloading: Temperature Converter
//
//🌡️ Ek class banaiye: TemperatureConverter
//🧪 Us class mein teen method banaiye convert() naam se — method overloading ka use karke:

public class TemperatureConverter {

    void convert(double celsius) {
        double farenheit = (celsius * 9.0 / 5.0) + 32;
        System.out.println("Celsius to Fahrenheit: " + farenheit + "°F");
    }

    void convert(double temperature, boolean isFarenheit) {
       if (isFarenheit) {
           double celsius = (temperature - 32) * 5.0 / 9.0;
           System.out.println("Farenheit to celcius: " + celsius + "°C");
       } else {
           System.out.println("Second parameter should be true to convert from Fahrenheit.");
       }
    }

    void convert() {
        System.out.println("No temprature provided");
    }

    public static void main(String[] args) {
        TemperatureConverter temp = new TemperatureConverter();

        temp.convert(37);
        temp.convert(98.6,true);
        temp.convert();
    }
}
