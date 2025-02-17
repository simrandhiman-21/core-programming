import java.util.Scanner;

public class simpleInterest{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Principal Amount");
        double principal=sc.nextDouble();

        System.out.println("Enter Rate Amount");
        double rate=sc.nextDouble();

        System.out.println("Enter a Time (InYears)");
        double years=sc.nextDouble();

        findsimpleInterest(principal,rate,years);
    }

    static  void findsimpleInterest(double principal,double rate,double year){

            double si=(principal+rate+year)/3.0;
            System.out.println("Simple Interest is "+ si);

    }
}
