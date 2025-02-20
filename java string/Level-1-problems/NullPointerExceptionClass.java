import java.util.*;

public class NullPointerExceptionClass {
    public static void main(String[] args) {
        System.out.println("Calling generate exception method ");
        try{
            generateException();
        }
        catch(Exception e){
            System.out.println("Exception message: "+e.getMessage());
        }

        System.out.println("Calling method to handle exception ");
        handleException();
        
    }
    public static void generateException(){
        String text=null;
        System.out.println(text.length()); //this will throw exception 
    }
    public static void handleException(){
        String text=null;
        try{
            System.out.println(text.length());
        }
        catch(NullPointerException e){
            System.out.println("Exception message: "+ e);
        }
    }
}
