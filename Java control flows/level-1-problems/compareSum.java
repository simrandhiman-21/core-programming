import java.util.Scanner;

public class compareSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int n=sc.nextInt();
        int sum=0;
        
        if (n <= 0) System.out.println("Please enter a natural number (positive integer).");
        
        int formula=n*(n+1)/2;
            while(n!=0){
                sum+=n;
                n--;
            }
        
        if(sum==formula) System.out.println("Result is same");
        else System.out.println("Result is different");
    }    
}
