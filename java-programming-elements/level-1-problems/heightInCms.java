import java.util.Scanner;
public class heightInCms {
        public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();
        
        // Conversion factors
        double inches = heightCm / 2.54;
        int feet = (int) (inches / 12);
        inches = inches % 12;
        
        // Print the result
        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f\n", heightCm, feet, inches);
        
        // Close the scanner
        input.close();
    }
}
