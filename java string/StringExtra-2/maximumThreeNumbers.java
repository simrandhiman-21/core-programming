
import java.util.Scanner;
public class maximumThreeNumbers {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get user input
        int num1 = getNumberInput(sc, "Enter first number:");
        int num2 = getNumberInput(sc, "Enter second number:");
        int num3 = getNumberInput(sc, "Enter third number:");

        // Find and display the maximum number
        int max = findMax(num1, num2, num3);
        System.out.println("The maximum number is: " + max);

        sc.close(); // Close scanner
    }

    // Function to take user input
    public static int getNumberInput(Scanner sc, String message) {
        System.out.println(message);
        return sc.nextInt();
    }

    // Function to find the maximum of three numbers
    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}

