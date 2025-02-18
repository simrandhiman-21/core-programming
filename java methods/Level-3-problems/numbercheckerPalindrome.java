
import java.util.*;


public class numbercheckerPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int[] numberArray = convertintoArray(num);
        System.out.println("Array: " + Arrays.toString(numberArray));

        int[] reverseArray = reverseArray(numberArray);
        System.out.println("Reversed Array: " + Arrays.toString(reverseArray));

        if (checkPalindrome(numberArray, reverseArray))
            System.out.println("The number is a Palindrome!");
        else
            System.out.println("The number is NOT a Palindrome!");

        if (duckNumber(numberArray))
            System.out.println("Duck Number");
        else
            System.out.println("Not a Duck Number");
        

    }
    public static int[] convertintoArray(int num){

        int length=String.valueOf(num).length();

        int[] numberarray=new int[length];

        int count=0;
        for(int i=length-1;i>=0;i--){
            numberarray[i]=num%10;
            num/=10;
        }
        return numberarray;
    }
    public static int[] reverseArray(int[] numberarray){
        int[] reversearray=new int[numberarray.length];
        for(int i=0;i<numberarray.length;i++){
            reversearray[i]=numberarray[numberarray.length-1-i];
        }
            return reversearray;
    }

    
    public static boolean checkPalindrome(int[] numberArray, int[] reverseArray) {
        return Arrays.equals(numberArray, reverseArray);
    }

    public static boolean duckNumber(int[] numberarray){
        for (int i = 1; i < numberarray.length; i++) { // Start from index 1 (skip first digit)
            if (numberarray[i] == 0) {
                return true;
            }
        }
        return false;


    }   
}
