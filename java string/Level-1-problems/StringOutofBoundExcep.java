import java.util.*;

public class StringOutofBoundExcep {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input=sc.nextLine();
        try {
            generateException(input);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

       // handleException(input);

    }

    public static void generateException(String input){
            System.out.println("Generating exception ");
            System.out.println(input.charAt(input.length()));

      }

      public static void handleException(String str){
        System.out.println("Handling exception");
        try{
            System.out.println(str.charAt(str.length()));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("Caught exception");
        }       
        
    }
}
