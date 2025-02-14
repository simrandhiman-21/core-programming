import java.util.Scanner;
public class findthedistance {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();
        
        // Convert the distance to yards
        double distanceInYards = distanceInFeet / 3;
        
        // Convert the distance to miles
        double distanceInMiles = distanceInYards / 1760;
        
        // Output the results
        System.out.printf("The distance in yards is %.2f and in miles is %.5f\n", distanceInYards, distanceInMiles);
        
     
    }
}

