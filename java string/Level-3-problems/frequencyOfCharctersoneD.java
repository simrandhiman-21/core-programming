import java.util.Scanner;

public class frequencyOfCharctersoneD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(input);

        // Find character frequencies
        String[][] frequencyTable = findCharacterFrequency(input, uniqueChars);

        // Display the result
        System.out.println("\nCharacter Frequency Table:");
        System.out.println("Character | Frequency");
        

        for (String[] row : frequencyTable) {
            if (row[0] != null) { // Ignore null values
                System.out.printf("    %s     |    %s%n", row[0], row[1]);
            }
        }

        sc.close();
    }

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        char[] unique = new char[text.length()]; // Max possible unique characters
        int index = 0;

        // Loop through each character in the text
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            // Check if character is already in unique array
            for (int j = 0; j < index; j++) {
                if (unique[j] == ch) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, add it to the array
            if (isUnique) {
                unique[index++] = ch;
            }
        }

        // Create an array with only the required unique elements
        char[] result = new char[index];
        System.arraycopy(unique, 0, result, 0, index);
        return result;
    }

    // Method to find frequency of characters using unique characters
    public static String[][] findCharacterFrequency(String text, char[] uniqueChars) {
        int[] frequency = new int[uniqueChars.length];

        // Count occurrences of each unique character
        for (int i = 0; i < uniqueChars.length; i++) {
            for (int j = 0; j < text.length(); j++) {
                if (uniqueChars[i] == text.charAt(j)) {
                    frequency[i]++;
                }
            }
        }

        // Store results in a 2D array
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]); // Character
            result[i][1] = String.valueOf(frequency[i]);   // Frequency
        }

        return result;
    }
}
