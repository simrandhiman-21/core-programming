import java.util.Scanner;
public class palindromeChecker {
    

  
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            // Get user input
            System.out.print("Enter a number to find its factorial: ");
            int number = sc.nextInt();
    
            // Calculate factorial
            if (number < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                System.out.println("Factorial of " + number + " is: " + factorial(number));
            }
    
            sc.close(); // Close scanner
        }
    
        // Recursive function to calculate factorial
        public static long factorial(int n) {
            if (n == 0 || n == 1) return 1;
            return n * factorial(n - 1);
        }
    }
    