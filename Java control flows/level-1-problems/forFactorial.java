import java.util.Scanner;

public class forFactorial {
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");
        int n=sc.nextInt();
        int product=1;
        int temp=n;
        if(n<=0) System.out.println("Enter a Valid Number");
        
        for(int i=1;i<=temp;i++){
            product=product*i;
        }

        System.out.println("Factorial of "+ n +" is "+product);

    }
}

