import java.util.Scanner;

public class gcdAndLcm{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Calculate GCD and LCM
        int gcd = findGCD(num1, num2);
        int lcm = findLCM(num1, num2, gcd);

        // Display results
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

        sc.close(); // Close scanner
    }

    // Function to calculate GCD (Using Euclidean Algorithm)
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM (Using formula: LCM * GCD = num1 * num2)
    public static int findLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}