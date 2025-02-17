import java.util.Scanner;

public class sumofnaturalnumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n=sc.nextInt();

        if(n<0) System.out.println("Please enter a positive number");

        int ans=findsum(n);
        System.out.println("Enter sum of "+ n +"natural numbers "+ ans);
    }
    static int findsum(int n){
        int sum=0;
        if(n>=0){
            for(int i=1;i<=n;i++){
                sum+=i;
            }
        }
        return sum;
    }
}
