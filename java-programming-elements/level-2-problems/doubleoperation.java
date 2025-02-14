import java.util.Scanner;


public class doubleoperation {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter values for a, b, and c (double type)
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();
        
        // Perform the double operations
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;
        
        // Output the results of the operations
        System.out.printf("The results of Double Operations are: %.2f, %.2f, %.2f, and %.2f\n", result1, result2, result3, result4);
    }
}
