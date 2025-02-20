import java.util.*;
public class frequencyNestedLoop {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        
                // Take user input
                System.out.println("Enter a string:");
                String input = sc.nextLine();
        
                // Find character frequency
                String[] frequencyTable = findCharacterFrequency(input);
        
                // Display the result
                System.out.println("\nCharacter Frequency Table:");
                
                System.out.println("Character | Frequency");
               
        
                for (String row : frequencyTable) {
                    if (row != null) { // Ignore null values
                        System.out.println(row);
                    }
                }
        
                sc.close();
            }
        
            // Method to find frequency of characters using nested loops
            public static String[] findCharacterFrequency(String text) {
                char[] characters = text.toCharArray(); // Convert to char array
                int[] frequency = new int[characters.length]; // Frequency array
                int size = characters.length;
        
                // Outer loop: Iterate through each character
                for (int i = 0; i < size; i++) {
                    if (characters[i] == '0') continue; // Skip already counted characters
        
                    frequency[i] = 1; // Initialize frequency to 1
        
                    // Inner loop: Check for duplicates
                    for (int j = i + 1; j < size; j++) {
                        if (characters[i] == characters[j]) {
                            frequency[i]++;  // Increase count
                            characters[j] = '0'; // Mark duplicate as processed
                        }
                    }
                }
        
                // Create a 1D String array to store the results
                String[] result = new String[size];
                int index = 0;
                
                for (int i = 0; i < size; i++) {
                    if (characters[i] != '0') { // Only store valid characters
                        result[index++] = "    " + characters[i] + "     |    " + frequency[i];
                    }
                }
        
                return result;
            }
        }
        
