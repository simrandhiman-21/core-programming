import java.util.Scanner;

public class frequencyArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number ");
        long n=sc.nextLong();

        int[] frequency=new int[10];
        long temp=n;

        while(temp!=0){
            int rem=(int)temp%10;
            frequency[rem]++;
            temp=temp/10;     
        }

        System.out.println("Digit Frequencies:");
        for(int i=0;i<frequency.length;i++){
            if(frequency[i]>0){
                System.out.println("Frequency of "+i+" is "+frequency[i]);
            }
        }

    }
    
}
