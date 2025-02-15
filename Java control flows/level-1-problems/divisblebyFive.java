import java.util.Scanner;

public class divisblebyFive {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter a Non-negative nuumber ");
        double n=sc.nextDouble();
        
        if(n%5==0) System.out.println("Is the number "+ n +" divisible by 5 "+ "yes");
        else System.out.println("Is the number "+ n +" divisible by 5 "+ "No");
    }
}
