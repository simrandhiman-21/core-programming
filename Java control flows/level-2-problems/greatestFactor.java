import java.util.*;

public class greatestFactor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Non-Negative Number ");
        int n = sc.nextInt();
        int greatestfactor=1;

        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than zero.");
        }

        for(int i=n-1;i>=1;i--){
            if(n%i==0){
                greatestfactor=i;
                break;
            }
        }
        System.out.println("The greatest factor of "+n+" is "+greatestfactor);
    }
}
