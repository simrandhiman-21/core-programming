import java.util.Scanner;

public class primeNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.println("Enter a number to check if it's prime:");
        int number = sc.nextInt();
        
        sc.close(); // Close scanner

        // Check and display result
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers <= 1 are not prime
        }
        if (num == 2) {
            return true; // 2 is the only even prime number
        }
        if (num % 2 == 0) {
            return false; // Even numbers greater than 2 are not prime
        }

        // Check divisibility from 3 to sqrt(num), skipping even numbers
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false; // If divisible, not prime
            }
        }
        return true; // Otherwise, prime
    }
}
