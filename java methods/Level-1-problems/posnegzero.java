import java.util.Scanner;

public class posnegzero{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number ");
        int num = sc.nextInt();

        int ans=findvalue(num);
        System.out.println("Inout number is " + ans);

    }
    static int findvalue(int num){

        if(num<0) return 0;
        else if(num>0) return 1;
        else return -1;

    }
}   