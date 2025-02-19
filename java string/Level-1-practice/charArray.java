import java.lang.reflect.Array;
import java.util.*;

public class charArray{
    
    public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter first String ");
    String inputstr=sc.nextLine();

    char[] strarray=inputstr.toCharArray();
    System.out.println("Arrays of tocharArray() :"+Arrays.toString(strarray));

    char[] charArray=usingCharArrayMethod(inputstr);
    System.out.println("Array of characters is: "+Arrays.toString(charArray));

}
    public static char[] usingCharArrayMethod(String inputstr){
        
        char[] array=new char[inputstr.length()];

        for(int i=0;i<inputstr.length();i++){
            char c=inputstr.charAt(i);
            array[i]=c;
        }
        return array;  
       
    }
}