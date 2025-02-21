import java.util.HashMap;
import java.util.Scanner;

import java.util.Scanner;
public class mostfrequnectCharaters {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        // Get user input
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        sc.close(); // Close scanner

        char mostFrequentChar = findMostFrequentChar(input);
        System.out.println("The most frequent character is: " + mostFrequentChar);
    }

    public static char findMostFrequentChar(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("String cannot be empty");
        }

        HashMap<Character, Integer> charCount = new HashMap<>();
        int maxCount = 0;
        char mostFrequentChar = '\0'; // Default empty character

        for (char ch : str.toCharArray()) {
            if (ch == ' ') continue; // Ignore spaces

            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);

            if (charCount.get(ch) > maxCount) {
                maxCount = charCount.get(ch);
                mostFrequentChar = ch;
            }
        }

        return mostFrequentChar;
    }
}

