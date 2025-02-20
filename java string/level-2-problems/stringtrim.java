import java.util.Scanner;

public class stringtrim {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            // Take user input
        System.out.println("Enter a string with leading and trailing spaces:");
        String input = sc.nextLine();

        // Get start and end index of trimmed content
        int[] trimIndices = findTrimIndices(input);

        // Get trimmed string using custom substring method
        String manuallyTrimmed = manualSubstring(input, trimIndices[0], trimIndices[1]);

        // Get trimmed string using built-in trim()
        String builtInTrimmed = input.trim();

        // Display results
        System.out.println("\nManually Trimmed String: '" + manuallyTrimmed + "'");
        System.out.println("Built-in Trimmed String: '" + builtInTrimmed + "'");

        // Compare both results
        boolean isEqual = compareStrings(manuallyTrimmed, builtInTrimmed);
        if (isEqual) {
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Strings are different.");
        }

        sc.close();
    }

    // Method to find start and end index for trimming spaces
    public static int[] findTrimIndices(String str) {
        int start = 0, end = getStringLength(str) - 1;

        // Find first non-space character
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Find last non-space character
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring manually using charAt()
    public static String manualSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        int len1 = getStringLength(str1);
        int len2 = getStringLength(str2);

        if (len1 != len2) return false;

        for (int i = 0; i < len1; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Method to find string length without using length()
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (str.charAt(count) != '\0') {
                count++;
            }
        } catch (Exception e) {
            return count;
        }
        return count;
    }
}
