import java.util.Scanner;

public class uniqueCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     
        // Take user input
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(input);

        // Display result
        System.out.println("Unique characters in the string:");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }

        sc.close();
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

    // Method to find unique characters using charAt()
    public static char[] findUniqueCharacters(String text) {
        int length = getStringLength(text);
        char[] uniqueTemp = new char[length];
        int uniqueCount = 0;

        // Iterate through each character in the string
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the character already exists in the uniqueTemp array
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueTemp[j] == currentChar) {
                    isUnique = false; // Not unique if found
                    break;
                }
            }

            // If unique, add it to the uniqueTemp array
            if (isUnique) {
                uniqueTemp[uniqueCount++] = currentChar;
            }
        }

        // Create a new array to store only the unique characters (trim extra space)
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = uniqueTemp[i];
        }

        return uniqueChars;
    }
}
