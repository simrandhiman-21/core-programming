import java.util.Scanner;

public class unitConvertor {
     // Conversion factors
     private static final double KM_TO_MILES = 0.621371;
     private static final double MILES_TO_KM = 1.60934;
     private static final double METERS_TO_FEET = 3.28084;
     private static final double FEET_TO_METERS = 0.3048;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

         // Kilometer to Miles
         System.out.print("Enter Distance in Km: ");
         double distKm = sc.nextDouble();
         System.out.println("Distance in Miles: " + convertKmToMiles(distKm));
 
         // Miles to Kilometer
         System.out.print("Enter Distance in Miles: ");
         double distMiles = sc.nextDouble();
         System.out.println("Distance in Km: " + convertMilesToKm(distMiles));
 
         // Meters to Feet
         System.out.print("Enter Distance in Meters: ");
         double distMeters = sc.nextDouble();
         System.out.println("Distance in Feet: " + convertMetersToFeet(distMeters));
 
         // Feet to Meters
         System.out.print("Enter Distance in Feet: ");
         double distFeet = sc.nextDouble();
         System.out.println("Distance in Meters: " + convertFeetToMeters(distFeet));

    }
    public static double convertKmToMiles(double distkm){

        return distkm*KM_TO_MILES;
    }
    public static double convertMilesToKm(double miles){
        return miles*MILES_TO_KM;
    }
    public static double convertMetersToFeet(double meters){
        return meters*METERS_TO_FEET;
    }
    public static double convertFeetToMeters(double feet){
        return feet*FEET_TO_METERS;
    }

}
