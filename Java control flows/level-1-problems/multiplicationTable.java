import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("Multiplication table of " + n + " from 6 to 9:");
        for(int i=6;i<=9;i++)
        {   
           
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
}
