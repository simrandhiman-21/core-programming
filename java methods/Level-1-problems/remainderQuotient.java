import java.util.Scanner;

public class remainderQuotient {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       
        int[] numbers=new int[2];

        numbers[0]=sc.nextInt();
        numbers[1]=sc.nextInt();

        int[] array =findRemainderAndQuotient(numbers);

        System.out.println("quotient is "+numbers[0]);
        System.out.println("Remainder is "+numbers[1]);
    
    }


     
    static int[] findRemainderAndQuotient(int[] numbers){
        int dividend = numbers[0];
        int divisor = numbers[1];
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        return new int[]{remainder,quotient};
        
    }
}
