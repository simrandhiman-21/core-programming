import java.util.Scanner;

public class oddevenNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

         // Prompt for input
         System.out.print("Enter a number: ");
         int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            if(i%2==0) System.out.printf("%d  number is even\n",i);
            else System.out.printf("%d  number is odd\n",i);
        }

    }
}
