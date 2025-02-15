import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Number ");
        int n = sc.nextInt();

        int cnt=0;

          // Special case: If n is 0, it has 1 digit
          if (n == 0) {
            System.out.println("Number of Digits in the Number is 1");
            return;
         }

        while(n>0){
            cnt++;
            n=n/10;
        }
        System.out.println("Number of Digits in the Number is "+cnt);

    }
    
}
