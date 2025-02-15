import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Number ");

        int n=sc.nextInt();
        int product=1;
        int temp=n;
        if(n<=0) System.out.println("Enter a non-negative Number");
        while(temp>1){
            product=product*temp;
            temp--;
        }
        System.out.println("Factorial of "+ n +" is "+product);

    }
}
