import java.util.Arrays;
import java.util.Scanner;

public class randomArray {
    public static void main(String[] args) {
        
        int size=5;

        int[] randomnumberans=generate4DigitRandomArray(size);
        System.out.println("Rnadom 4 digit number "+Arrays.toString(randomnumberans));

        double[] ans=findAverageMinMax(randomnumberans);
        System.out.println("Average of the array is "+ans[0]);
        System.out.println("Min of the array is "+ans[1]);
        System.out.println("Max of the array is "+ans[2]);
            
    
    }


        public static int[] generate4DigitRandomArray(int size){
            int[] randomnumber=new int[size];
            for(int i=0;i<size;i++){
                randomnumber[i]=1000+(int)(Math.random()*9000);
            }
            return randomnumber;
        }

        public static double[] findAverageMinMax(int[] numbers){
            int min=numbers[0];
            int max=numbers[0];
            int sum=0;
            for(int i:numbers){
                sum+=i;
                min=Math.min(min,i);
                max=Math.max(max,i);
            }
            double Average=(double)sum/numbers.length;
            return new double[]{Average,min,max};
        }
}