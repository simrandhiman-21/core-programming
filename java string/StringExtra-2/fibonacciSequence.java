import java.util.Scanner;
public class fibonacciSequence {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            // Get user input
            System.out.print("Enter the number of terms for Fibonacci sequence: ");
            int terms = sc.nextInt();
    
            // Validate input
            if (terms <= 0) {
                System.out.println("Please enter a positive integer.");
            } else {
                System.out.println("Fibonacci sequence up to " + terms + " terms:");
                generateFibonacci(terms);
            }
    
            sc.close(); // Close scanner
        }
    
        // Function to generate Fibonacci sequence
        public static void generateFibonacci(int n) {
            int first = 0, second = 1;
    
            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");
    
                // Compute next term
                int next = first + second;
                first = second;
                second = next;
            }
            System.out.println();
        }
    }
    