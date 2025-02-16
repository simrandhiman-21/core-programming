import java.util.Scanner;

public class multipleValues {
    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
       
       double[] numbers = new double[10]; 
       int i=0;

       System.out.println("Enter numbers (Max 10). Enter 0 or a negative number to stop:");

       while(true){
            double input=sc.nextDouble();
            if(input <= 0) {
                System.out.println("Zero or negative number entered. Stopping input.");
                break;
            }

            numbers[i]=input;
            i++;

            if(i==10){
                System.out.println("Maximum of 10 numbers entered. Stopping input.");
                break;
            }
       }

    double sum=0.0;

    for(int j=0;j<i;j++){
        sum+=numbers[j];
        System.out.println("Number at index " + j + " is " + numbers[j] + ", sum so far: " + sum);
    }

    System.out.println("Final sum is "+sum);
   

   }
}
