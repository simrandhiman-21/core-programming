import java.util.Scanner;
import java.util.Random;

public class numberguessing {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100, and I will try to guess it!");
        System.out.println("Respond with 'higher', 'lower', or 'correct'.");

        playGame(sc);
        
        sc.close(); // Close the scanner
    }

    public static void playGame(Scanner sc) {
        int low = 1, high = 100;
        Random rand = new Random();
        int guess;

        while (low <= high) {
            guess = low + (high - low) / 2; // Binary search approach for efficiency
            System.out.println("Is your number " + guess + "? (higher/lower/correct)");
            String response = sc.next().toLowerCase();

            if (response.equals("correct")) {
                System.out.println("Yay! I guessed your number correctly!");
                return;
            } else if (response.equals("higher")) {
                low = guess + 1; // Adjust lower bound
            } else if (response.equals("lower")) {
                high = guess - 1; // Adjust upper bound
            } else {
                System.out.println("Invalid response! Please enter 'higher', 'lower', or 'correct'.");
            }
        }

        System.out.println("Something went wrong! Did you change your number?");
    }
}

