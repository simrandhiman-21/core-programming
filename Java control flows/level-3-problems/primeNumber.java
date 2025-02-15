import java.util.*;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a non-negative Number ");
        int n = sc.nextInt();


        if(n<=1){
            System.out.println(n + " is not a prime number"); 
            return;
        }
        
        boolean flag=false;
        for (int i = 2; i*i <= n; i++) {
            if(n%i==0){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println(n+" is not a prime number");
        }
        else{
            System.out.println("yes prime");
        }
    }
}
