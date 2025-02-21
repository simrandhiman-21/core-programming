import java.util.Scanner;

public class vowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Call method to count vowels and consonants
        int[] counts = countVowelsAndConsonants(input);

        // Display results
        System.out.println("\nVowel Count: " + counts[0]);
        System.out.println("Consonant Count: " + counts[1]);

        sc.close();
    }

    // Method to check if a character is a vowel or consonant
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

    // Method to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String input) {
        int vowelCount = 0;
        int consonantCount = 0;

        // Loop through each character
        for (int i = 0; i < getStringLength(input); i++) {
            String type = checkCharacterType(input.charAt(i));

            if (type.equals("Vowel")) {
                vowelCount++;
            } else if (type.equals("Consonant")) {
                consonantCount++;
            }
        }

        // Return counts as an array [vowelCount, consonantCount]
        return new int[]{vowelCount, consonantCount};
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
