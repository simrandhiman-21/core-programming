import java.util.Scanner;

public class sumTillZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double total=0.0;
        double n;

        while(true){
            System.out.println("Enter a Value : ");
            n=sc.nextInt();
            
            if(n==0 || n<0){
                break;
            }
            total+=n;
        }
        System.out.println("Sum of all entered values is : "+total);

    }
}
