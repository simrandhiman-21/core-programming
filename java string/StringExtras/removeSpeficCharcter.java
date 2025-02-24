import java.util.Scanner;
public class removeSpeficCharcter {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get user input
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        
        System.out.println("Enter the character to remove:");
        char removeChar = sc.next().charAt(0);
        
        sc.close(); // Close scanner

        String result = removeCharacter(input, removeChar);
        System.out.println("String after removal: " + result);
    }

    public static String removeCharacter(String str, char ch) {
        return str.replaceAll(Character.toString(ch), ""); // Replace all occurrences
        // StringBuilder sb=new StringBuilder();
        // for(char c:str.toCharArray()){
        //     if(c!=ch){
        //         sb.append(c);
        //     }
        // }
        // return sb.toString();
    }
}
