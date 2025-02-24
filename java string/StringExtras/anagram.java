import java.util.Arrays;
import java.util.Scanner;
public class anagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get user input
        System.out.println("Enter first string:");
        String str1 = sc.nextLine();
        
        System.out.println("Enter second string:");
        String str2 = sc.nextLine();
        
        sc.close(); // Close scanner

        // Check if they are anagrams
        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
            if(str1.length()!=str2.length())return false;
            for(char c:str1.toCharArray()){
                if(!str2.contains(Character.toString(c))){
                    return false;
                }
            }
           return true;
           
        // // Remove spaces and convert to lowercase to ensure case insensitivity
        // str1 = str1.replaceAll("\\s", "").toLowerCase();
        // str2 = str2.replaceAll("\\s", "").toLowerCase();

        // // Anagrams must have the same length
        // if (str1.length() != str2.length()) {
        //     return false;
        // }

        // // Convert to character arrays and sort them
        // char[] arr1 = str1.toCharArray();
        // char[] arr2 = str2.toCharArray();
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);

        // // Compare sorted arrays
        // return Arrays.equals(arr1, arr2);


    }
}
