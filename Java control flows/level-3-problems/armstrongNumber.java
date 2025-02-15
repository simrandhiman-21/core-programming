import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;

        // Count the number of digits
        int num = n;
        int digits=0;
        while (num != 0) {
            num /= 10;
            digits++;
        }

        while(temp!=0){
            int rem=temp%10;
            int power=1;
            for(int i=0;i<digits;i++){
                power*=rem;
            }
            sum+=power;
            temp/=10;
        }
        if (n == sum) {
            System.out.println(n + " is an Armstrong Number.");
        } else {
            System.out.println(n + " is NOT an Armstrong Number.");
        }
    }    
}
