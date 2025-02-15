
import java.util.*;

public class springSeason {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        // Taking input from the user

        System.out.print("Enter month (1-12): ");
        int month = Integer.parseInt(args[0]);


        System.out.print("Enter day (1-31): ");
        int day = Integer.parseInt(args[1]);
        
        if((month==3 && day>=20)||(month==4) || (month==5) || (month==6 && day<=20)){
            System.out.println("Its a Spring Season");
        }
        else{
            System.out.println("Its not a Spring Season");
        }
    }
    
}
