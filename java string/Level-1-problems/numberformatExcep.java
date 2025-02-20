import java.util.Scanner;

public class numberformatExcep {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String ");
        String input = sc.nextLine();

        try{
            generateException(input);
        }
        catch(NumberFormatException e){
            System.out.println("Invalid Input");
        }

        handleException(input);

    }
    public static void handleException(String input){
        try{
            int number=Integer.parseInt(input);
            System.out.println("Number is "+number);
        }
        catch(NumberFormatException e){
            System.out.println("NumberFormatException Caught: " + e);
        } 
        catch (RuntimeException e) {  // Generic catch for runtime exceptions
            System.out.println("RuntimeException Caught: " + e);
        }
    } 

    public static void generateException (String str){
        int number=Integer.parseInt(str);
        System.out.println("Converted Number "+number);      
    }  
}
