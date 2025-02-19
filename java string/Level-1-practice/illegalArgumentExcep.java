import java.util.Scanner;

public class illegalArgumentExcep {
 public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);

    System.out.println("Enter a String ");
    String input=sc.nextLine();

    try{
        System.out.println("Substrign "+ input.substring(input.length(),input.length()-1));
    }
    catch (StringIndexOutOfBoundsException e) {
        System.out.println("Error: Index out of bounds"+ e );
    }
    handleException(input);
}
    public static void handleException(String input){
        try{
            System.out.println("Substrign "+ input.substring(input.length(),input.length()-1));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("IllegalArgumentException Caught: " + e);
        }
        catch(RuntimeException e){
            System.out.println("RuntimeException Caught: " + e);
        }
    }   
}
