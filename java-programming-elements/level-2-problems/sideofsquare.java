import java.util.Scanner;

public class sideofsquare {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();
        
        // Calculate the side length of the square
        double side = perimeter / 4;
        
        // Output the result
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f\n", side, perimeter);
        
  
    }
}
