import java.util.Scanner;

public class intoperation {
       public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter values for a, b, and c
        System.out.print("Enter the value of a: ");
        int a = input.nextInt();
        
        System.out.print("Enter the value of b: ");
        int b = input.nextInt();
        
        System.out.print("Enter the value of c: ");
        int c = input.nextInt();
        
        // Perform the integer operations
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;
        
        // Output the results of the operations
        System.out.printf("The results of Int Operations are: %d, %d, %d, and %d\n", result1, result2, result3, result4);

    }
}
