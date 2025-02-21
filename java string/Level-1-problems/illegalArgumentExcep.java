import java.util.Scanner;

public class illegalArgumentExcep {
 public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);

    System.out.println("Enter a String ");
    String input=sc.nextLine();

    try{
        generateException(input);
    }
    catch (IllegalArgumentException e) {
        System.out.println("IllegalArgumentException Caught in main: " + e.getMessage());
    }
    handleException(input);
}
public static void generateException(String input){
    System.out.println("Generating Exception...");
        // Intentionally using start > end to trigger IllegalArgumentException
      System.out.println("Substring: " + input.substring(3, 1));


}
    public static void handleException(String input){
        try{
            System.out.println("Handling Exception...");
            System.out.println("Substring: " + input.substring(3, 1));
        }
        catch(IllegalArgumentException e){
            System.out.println("IllegalArgumentException Caught in generateException: " + e.getMessage());
        }
        catch(RuntimeException e){
            System.out.println("RuntimeException Caught in generateException: " + e.getMessage());
        }
    }   
}
