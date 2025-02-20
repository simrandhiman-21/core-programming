import java.util.Scanner;

public class anagramString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user inputs
        System.out.println("Enter first text:");
        String text1 = sc.nextLine().toLowerCase().replaceAll("[^a-zA-Z]", ""); // Remove spaces & punctuation
        
        System.out.println("Enter second text:");
        String text2 = sc.nextLine().toLowerCase().replaceAll("[^a-zA-Z]", ""); // Remove spaces & punctuation

        // Check for anagram
        boolean result = areAnagrams(text1, text2);

        // Display result
        System.out.println("\nAnagram Check Result:");
        
        System.out.println("Are the two texts anagrams? " + (result ? "Yes" : "No"));

        sc.close();
    }

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Step 1: Check if lengths are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Step 2: Create frequency arrays for 256 ASCII characters
        int[] frequency1 = new int[256];
        int[] frequency2 = new int[256];

        // Step 3: Count character frequencies for both texts
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
            frequency2[text2.charAt(i)]++;
        }

        // Step 4: Compare character frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }
        
        return true; // They are anagrams
    }
}
