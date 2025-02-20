import java.util.ArrayList;
import java.util.Scanner;

public class splitshortestLargest {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        
                // Take user input
                System.out.println("Enter a string:");
                String input = sc.nextLine();
        
                // Call custom split method
                String[] words = customSplit(input);
        
                // Generate 2D array with words and their lengths
                String[][] wordLengths = generateWordLengthArray(words);
        
                // Find shortest and longest words
                String[] minMaxWords = findShortestAndLongestWords(wordLengths);
        
                // Display results in tabular format
                System.out.println("\nWord\tLength");
                for (String[] row : wordLengths) {
                    System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
                }
        
                // Display shortest and longest words
                System.out.println("\nShortest Word: " + minMaxWords[0]);
                System.out.println("Longest Word: " + minMaxWords[1]);
        
                sc.close();
            }
        
            // Method to split text into words without using split()
            public static String[] customSplit(String input) {
                ArrayList<String> wordList = new ArrayList<>();
                StringBuilder word = new StringBuilder();
        
                // Loop through each character
                for (int i = 0; i < getStringLength(input); i++) {
                    if (input.charAt(i) != ' ') {
                        word.append(input.charAt(i));
                    } else {
                        if (word.length() > 0) {
                            wordList.add(word.toString());
                            word.setLength(0); // Reset word
                        }
                    }
                }
        
                // Add last word if exists
                if (word.length() > 0) {
                    wordList.add(word.toString());
                }
        
                return wordList.toArray(new String[0]);
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
        
            // Method to generate a 2D String array with words and their lengths
            public static String[][] generateWordLengthArray(String[] words) {
                String[][] result = new String[words.length][2];
        
                for (int i = 0; i < words.length; i++) {
                    result[i][0] = words[i]; // Word
                    result[i][1] = String.valueOf(getStringLength(words[i])); // Word length as String
                }
        
                return result;
            }
        
            // Method to find shortest and longest words
            public static String[] findShortestAndLongestWords(String[][] wordLengths) {
                String shortest = wordLengths[0][0];
                String longest = wordLengths[0][0];
        
                for (int i = 1; i < wordLengths.length; i++) {
                    if (getStringLength(wordLengths[i][0]) < getStringLength(shortest)) {
                        shortest = wordLengths[i][0];
                    }
                    if (getStringLength(wordLengths[i][0]) > getStringLength(longest)) {
                        longest = wordLengths[i][0];
                    }
                }
        
                return new String[]{shortest, longest};
            }
    }
        
       