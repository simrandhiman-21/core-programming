import java.util.Scanner;

public class vowelsLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Get 2D array with characters and their types
        String[][] charClassification = classifyCharacters(input);

        // Display results in tabular format
        displayTable(charClassification);

        sc.close();
    }

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        // Convert uppercase to lowercase using ASCII values
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); // Convert to lowercase
        }

        // Check if it is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        // Check if it is a consonant (letters only)
        else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        } else {
            return "Not a Letter"; // Ignore numbers & symbols
        }
    }

    // Method to classify each character and return a 2D array
    public static String[][] classifyCharacters(String input) {
        int length = getStringLength(input);
        String[][] result = new String[length][2];

        // Loop through each character
        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);
            result[i][0] = String.valueOf(ch);  // Store character
            result[i][1] = checkCharacterType(ch); // Store classification
        }

        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayTable(String[][] data) {
        System.out.println("\nCharacter\tType");
        for (String[] row : data) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    // Method to find the length of a string without using length()
    public static int getStringLength(String text) {
        int count = 0;
        try {
            while (text.charAt(count) != '\0') {
                count++;
            }
        } catch (Exception e) {
            return count;
        }
        return count;
    }
}
