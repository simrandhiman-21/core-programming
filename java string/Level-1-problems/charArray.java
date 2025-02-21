import java.lang.reflect.Array;
import java.util.*;

public class charArray{
    
    public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter first String ");
    String inputstr=sc.nextLine();

    char[] strarray=inputstr.toCharArray();
    System.out.println("Arrays of tocharArray() :"+Arrays.toString(strarray));
    System.out.println(strarray.length);

    char[] charArray=usingCharArrayMethod(inputstr);
    System.out.println("Array of characters is: "+Arrays.toString(charArray));
    System.out.println(charArray.length);


    boolean compare=compareMethod(strarray,charArray);
    if(compare)System.out.println("Both are equal ");
    else System.out.println("Both are not equal ");

}
    public static char[] usingCharArrayMethod(String inputstr){
        
        char[] array=new char[inputstr.length()];

        for(int i=0;i<inputstr.length();i++){
            array[i]=inputstr.charAt(i);
        }
        return array;  
       
    }
    public static boolean compareMethod(char[] strarray,char[] charArray){
        if(strarray.length==charArray.length){
            for(int i=0;i<strarray.length;i++){
                if(strarray[i]!=charArray[i])return false;
            }
                return true;
        }
        return false;
    }
}