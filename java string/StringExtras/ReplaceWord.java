import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get user input
        System.out.println("Enter the sentence:");
        String sentence = sc.nextLine();
        
        System.out.println("Enter the word to replace:");
        String oldWord = sc.next();
        
        System.out.println("Enter the new word:");
        String newWord = sc.next();
        
        sc.close(); // Close scanner

        // Perform replacement
        String updatedSentence = replaceWord(sentence, oldWord, newWord);
        System.out.println("Updated sentence: " + updatedSentence);
    }

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replaceAll("\\b"+oldWord+"\\b", newWord); // this replace is with cat but is not is separate word \\b need separet word 
    }
}

