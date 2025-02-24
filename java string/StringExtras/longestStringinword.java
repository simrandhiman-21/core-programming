import java.util.Scanner;

public class longestStringinword {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Sentence ");
        String input=sc.nextLine();
        
        String longest="";
        
               
        for(String word:input.split("\\s+")){
            if(word.length()>longest.length()){
                longest=word;
            }
        }
                
        System.out.println("Longest word is : "+longest);



        
    }
}
