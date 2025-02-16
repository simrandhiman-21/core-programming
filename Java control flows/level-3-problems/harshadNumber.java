import java.util.Scanner;

class harshadNumber{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Number ");
        int n=sc.nextInt();

        int temp=n;

        int sum=0;

        while(temp!=0){
            int rem=temp%10;
            sum+=rem;
            temp=temp/10;
        }

        // System.out.println("sum is "+ sum );
        
        if(n%sum==0) System.out.println("It's a Harshad Number ");
        else System.out.println("It's Not a Harshad Number");


    }
}