import java.util.Scanner;
public class ques8 {

    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();
        
        // Conversion factor
        double miles = km / 1.6;
        
        // Print the result
        System.out.printf("The total miles is %.2f miles for the given %.2f km\n", miles, km);
    }
}
