import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");
        int num=sc.nextInt();

        int n=0;        
        
        //counting number of digits 
        int temp=num;
        while(temp>0){
            n++;
            temp=temp/10;
        }
        
        int[] reversed=new int[n];

        for(int i=0;i<n;i++){
            reversed[i]=num%10;
            num=num/10;
        }

        System.out.print("Reversed Number: ");

        for(int i:reversed){
            System.out.print(i+" ");
        }

    }    
}
