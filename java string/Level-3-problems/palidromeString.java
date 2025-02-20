import java.util.*;
public class palidromeString {
    public static void main(String[] args) {
        
              Scanner sc=new Scanner(System.in);
                // Take user input
                System.out.println("Enter a text to check for palindrome:");
                String input = sc.nextLine().toLowerCase().replaceAll("[^a-zA-Z0-9]", ""); // Ignore case and spaces
        
                // Check palindrome using different logic
                boolean iterativeResult = isPalindromeIterative(input);
                boolean recursiveResult = isPalindromeRecursive(input, 0, input.length() - 1);
                boolean arrayResult = isPalindromeUsingArray(input);
        
                // Display Results
                System.out.println("\nPalindrome Check Results:");
                System.out.println("Using Iteration        : " + (iterativeResult ? "Palindrome" : "Not a Palindrome"));
                System.out.println("Using Recursion        : " + (recursiveResult ? "Palindrome" : "Not a Palindrome"));
                System.out.println("Using Character Array  : " + (arrayResult ? "Palindrome" : "Not a Palindrome"));
        
                sc.close();
            }
        
            // Logic 1: Iterative method using two-pointer approach
            public static boolean isPalindromeIterative(String text) {
                int start = 0, end = text.length() - 1;
                
                while (start < end) {
                    if (text.charAt(start) != text.charAt(end)) {
                        return false; // Not a palindrome
                    }
                    start++;
                    end--;
                }
                return true; // It's a palindrome
            }
        
            // Logic 2: Recursive method
            public static boolean isPalindromeRecursive(String text, int start, int end) {
                if (start >= end) return true; // Base case: If start reaches or crosses end, it's a palindrome
                
                if (text.charAt(start) != text.charAt(end)) return false; // If mismatch, not a palindrome
                
                return isPalindromeRecursive(text, start + 1, end - 1); // Recursive check for next characters
            }
        
            // Logic 3: Using character array and reverse
            public static boolean isPalindromeUsingArray(String text) {
                char[] original = text.toCharArray(); // Convert to character array
                char[] reversed = reverseString(text); // Get reversed string as character array
        
                // Compare original and reversed arrays
                for (int i = 0; i < original.length; i++) {
                    if (original[i] != reversed[i]) {
                        return false; // Not a palindrome
                    }
                }
                return true; // It's a palindrome
            }
        
            // Method to reverse a string using charAt()
            public static char[] reverseString(String text) {
                char[] reversed = new char[text.length()];
                
                for (int i = 0; i < text.length(); i++) {
                    reversed[i] = text.charAt(text.length() - 1 - i); // Reverse the characters
                }
                
                return reversed;
            }
        }
        