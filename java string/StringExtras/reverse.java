import java.util.*;
public class reverse {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String  input= sc.nextLine();

        

        StringBuilder sb=new StringBuilder(input);
        sb.reverse();

        
        System.out.println(sb.toString());
 }   
}
