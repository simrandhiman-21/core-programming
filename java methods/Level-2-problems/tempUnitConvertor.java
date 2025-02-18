import java.util.Scanner;

public class tempUnitConvertor{

     // Conversion factors
     private static final double POUNDS_TO_KILOGRAMS = 0.453592;
     private static final double KILOGRAMS_TO_POUNDS = 2.20462;
     private static final double GALLONS_TO_LITERS = 3.78541;
     private static final double LITERS_TO_GALLONS = 0.264172; 


     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Fahrenheit to Celsius
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        System.out.println(fahrenheit + "°F is equal to " + convertFahrenheitToCelsius(fahrenheit) + "°C.");

        // Celsius to Fahrenheit
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        System.out.println(celsius + "°C is equal to " + convertCelsiusToFahrenheit(celsius) + "°F.");

        // Pounds to Kilograms
        System.out.print("Enter weight in Pounds: ");
        double pounds = sc.nextDouble();
        System.out.println(pounds + " lbs is equal to " + convertPoundsToKilograms(pounds) + " kg.");

        // Kilograms to Pounds
        System.out.print("Enter weight in Kilograms: ");
        double kilograms = sc.nextDouble();
        System.out.println(kilograms + " kg is equal to " + convertKilogramsToPounds(kilograms) + " lbs.");

        // Gallons to Liters
        System.out.print("Enter volume in Gallons: ");
        double gallons = sc.nextDouble();
        System.out.println(gallons + " gallons is equal to " + convertGallonsToLiters(gallons) + " liters.");

        // Liters to Gallons
        System.out.print("Enter volume in Liters: ");
        double liters = sc.nextDouble();
        System.out.println(liters + " liters is equal to " + convertLitersToGallons(liters) + " gallons.");

    }



    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Convert Pounds to Kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * POUNDS_TO_KILOGRAMS;
    }

    // Convert Kilograms to Pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * KILOGRAMS_TO_POUNDS;
    }

    // Convert Gallons to Liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * GALLONS_TO_LITERS;
    }

    // Convert Liters to Gallons
    public static double convertLitersToGallons(double liters) {
        return liters * LITERS_TO_GALLONS;
    }
}