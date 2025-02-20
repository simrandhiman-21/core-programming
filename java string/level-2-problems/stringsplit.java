import java.util.*;

public class stringsplit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Using built-in split() method
        String[] words = input.split(" ");
        System.out.println("Using built-in String split():");
        for (String word : words) {
            System.out.println(word);
        }

        // Using manual split method
        String[] manualSplit = manualsplitArray(input);
        System.out.println("Using Manual Split:");
        for (String word : manualSplit) {
            System.out.println(word);
        }

        // Compare both methods
        boolean ans = compareArrays(manualSplit, words);
        if (ans) {
            System.out.println("Both arrays are equal");
        } else {
            System.out.println("Not Same");
        }

        sc.close();
    }

    public static String[] manualsplitArray(String input) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder word = new StringBuilder();

        // Loop through each character
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                word.append(input.charAt(i));
            } else {
                if (word.length() > 0) {
                    list.add(word.toString()); // Add word to list
                    word.setLength(0); // Reset word
                }
            }
        }

        // Add the last word if it exists
        if (word.length() > 0) {
            list.add(word.toString());
        }

        // Convert list to an array
        return list.toArray(new String[0]);
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }
}
