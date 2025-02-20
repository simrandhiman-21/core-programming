import java.util.Scanner;

public class stringlength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next(); // Read user input (single word without spaces)

        // Compute length using custom method
        int calculatedLength = findLength(input);
        System.out.println("Length of the string is: " + calculatedLength);


        // Compute length using built-in method
        int actualLength = input.length();
        System.out.println("Actual length of the string is: " + actualLength);

    }
    public static int findLength(String input){
        int cnt=0;
        try{
            while(true){
                input.charAt(cnt);
                cnt++;
            }
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Exception is Printed "+ e);
        }
        return cnt;
    }
    
}
