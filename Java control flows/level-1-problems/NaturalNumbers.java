import java.util.*;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


         // Prompt for input
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int sum=0;
        if(n>=0){
            for(int i=1;i<=n;i++){
                sum+=i;
            }
            System.out.println("The sum of "+ n + "natural numbers is " + sum);
        }
        else{
            System.out.println("Please enter a positive number");
        }

    }
}
