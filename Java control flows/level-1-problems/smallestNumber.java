import java.util.Scanner;

public class smallestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

     // Taking input
     System.out.print("Enter the first number: ");
     int n1 = sc.nextInt();
     
     System.out.print("Enter the second number: ");
     int n2 = sc.nextInt();
     
     System.out.print("Enter the third number: ");
     int n3 = sc.nextInt();

        if(n1<n2 && n1<n3) System.out.println("Is the first number the smallest? "+" Yes");
        else System.out.println("Is the first number the smallest? "+" No");

    }
}
