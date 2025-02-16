import java.util.Scanner;

public class largestSecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");
        int number=sc.nextInt();

        int maxdigit=10;
        int[] array=new int[maxdigit];
        
        int index=0;

            int largest=-1;
            int secondlargest=-1;

        while(number>0){
            if(index==maxdigit){
                maxdigit+=10;
                int[] temp=new int[maxdigit];
                System.arraycopy(array, 0, temp, 0, array.length);
                array=temp;
            }
            
            array[index++]=number%10;
            number/=10;
        }

        if (index == 0) { // Edge case: If input is 0
            System.out.println("Largest: 0, Second Largest: Not applicable");
            return;
        }

        for(int i=0;i<index;i++){
            if(array[i]>largest){
                secondlargest=largest; //old largest before updating
                largest=array[i];
            }
            else if(array[i]>secondlargest && array[i]!=largest){
                secondlargest=array[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second Largest digit: " + (secondlargest == -1 ? "Not found" : secondlargest));

    }
}
