import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sx=new Scanner(System.in);

        System.out.println("Enter a Number");
        int num=sx.nextInt();
        System.out.println("Enter a Power");
        int power=sx.nextInt();

        int result=1;
        for(int i=1;i<=power;i++){
            result*=num;
        }

        System.out.println("Power of "+ num + "  is  "+result);



    }
}
