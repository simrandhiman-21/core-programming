import java.util.Scanner;
public class basicCalculator {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();
        
        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();
        
        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number2 != 0 ? number1 / number2 : Double.NaN;
        
        // Print the result
        System.out.printf("The addition, subtraction, multiplication and division value of two numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f\n", number1, number2, addition, subtraction, multiplication, division);
    
    }
}
