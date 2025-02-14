import java.util.Scanner;
public class areaOfTriangle {

    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter the base of the triangle in cm: ");
        double base = input.nextDouble();
        
        System.out.print("Enter the height of the triangle in cm: ");
        double height = input.nextDouble();
        
        // Calculate area in square centimeters
        double areaCm2 = 0.5 * base * height;
        
        // Convert area to square inches (1 cm² = 0.155 square inches)
        double areaIn2 = areaCm2 * 0.155;
        
        // Print the result
        System.out.printf("The area of the triangle is %.2f square centimeters and %.2f square inches.\n", areaCm2, areaIn2);
        
        // Close the scanner
        input.close();
    }
}
