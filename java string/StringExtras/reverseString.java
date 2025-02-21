import java.util.Collection;
import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a STring ");
        String input=sc.nextLine();

        StringBuilder sb=new StringBuilder(input);
        sb.reverse();


        System.out.println("Reverseed string is "+sb.toString());
    }
}
