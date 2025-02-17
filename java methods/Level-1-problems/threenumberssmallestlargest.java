import java.util.Scanner;

public class threenumberssmallestlargest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // Taking input

        int[] numbers=new int[3];

        for(int i=0;i<3;i++){
            System.out.print("Enter the 3 numbers ");
            numbers[i]=sc.nextInt();
        }

        int[] result  =findSmallestAndLargest(numbers);
        System.out.println("Smallest number is "+result[0]);
        System.out.println("Largest number is "+result[1]);

    }


    static int[] findSmallestAndLargest(int[] numsers){
        int smallest = numsers[0];
        int largest = numsers[0];
        for(int i=1;i<numsers.length;i++){
            if(numsers[i]<smallest){
                smallest=numsers[i];
            }
            if(numsers[i]>largest){
                largest=numsers[i];
            }
        }

        return new int[]{smallest,largest};        
        
    }
}
