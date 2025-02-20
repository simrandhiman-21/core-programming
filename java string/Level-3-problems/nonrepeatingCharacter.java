import java.util.Scanner;

public class nonrepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Find first non-repeating character
        char result = findFirstNonRepeatingCharacter(input);

        // Display result
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }

    // Method to find the first non-repeating character using charAt()
    public static char findFirstNonRepeatingCharacter(String text) {
        int[] frequency = new int[256]; // ASCII character frequency array

        // Step 1: Count occurrences of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++; // Increment frequency of character
        }

        // Step 2: Find the first character with a frequency of 1
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (frequency[ch] == 1) {
                return ch; // Return the first non-repeating character
            }
        }

        return '\0'; // Return null character if no unique character is found
    }
}

