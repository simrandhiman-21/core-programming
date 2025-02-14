import java.util.Scanner;
public class areaoftriangle {
    public static void main(String[] args) {
    

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the base of the triangle (in inches)
        System.out.print("Enter the base of the triangle in inches: ");
        double baseInches = input.nextDouble();
        
        // Prompt the user to enter the height of the triangle (in inches)
        System.out.print("Enter the height of the triangle in inches: ");
        double heightInches = input.nextDouble();
        
        // Calculate the area in square inches using the formula for the area of a triangle
        double areaInches = 0.5 * baseInches * heightInches;
        
        // Convert the area to square centimeters
        double areaCm = areaInches * 6.4516;  // 1 square inch = 6.4516 square cm
        
        // Output the results
        System.out.printf("The area of the triangle is %.2f square inches (%.2f square centimeters).\n", areaInches, areaCm);
        
    }
}