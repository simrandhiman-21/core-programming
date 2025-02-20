import java.util.Scanner;
public class frequencyOfCharacters {
 public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
    
            // Take user input
            System.out.println("Enter a string:");
            String input = sc.nextLine();
    
            // Find frequency of characters
            String[][] frequencyTable = findCharacterFrequency(input);
    
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
    
        // Method to find the frequency of characters using charAt()
        public static String[][] findCharacterFrequency(String text) {
            int[] frequency = new int[256]; // ASCII character frequency array
    
            // Step 1: Count occurrences of each character
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                frequency[ch]++; // Increment frequency of character
            }
    
            // Step 2: Store unique characters and their frequencies in a 2D array
            String[][] result = new String[text.length()][2]; // Max size = length of text
            int index = 0;
    
            // Step 3: Loop through text and add only unique characters to the result array
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (frequency[ch] > 0) { // Check if character has a frequency
                    result[index][0] = String.valueOf(ch);
                    result[index][1] = String.valueOf(frequency[ch]);
                    frequency[ch] = 0; // Mark as processed
                    index++;
                }
            }
    
            return result;
        }
    }
    