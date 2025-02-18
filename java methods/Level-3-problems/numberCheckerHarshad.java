import java.util.Scanner;

public class numberCheckerHarshad {
    public static void main(String[] args) {
        

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();

        int cnt=countdigits(num);
        System.out.println("Number of digits in the number is "+cnt);

        int[] numberarray=convertintoArray(num,cnt);
        System.out.println("Array of digits of the number is "+java.util.Arrays.toString(numberarray));


        int digitSum = sumOfDigits(numberarray);
        System.out.println("Sum of digits: " + digitSum);

        int sumOfSquares = sumOfSquaresOfDigits(numberarray);
        System.out.println("Sum of squares of digits: " + sumOfSquares);

        boolean isHarshad = isHarshadNumber(num, digitSum);
        System.out.println("Is Harshad Number? " + (isHarshad ? "Yes" : "No"));

        int[][] frequency = digitFrequency(numberarray);
        System.out.println("Frequency of each digit: ");

        for (int[] freq : frequency) {
            if (freq[1] > 0) System.out.println(freq[0] + " appears " + freq[1] + " times");
        }
    }

    public static int countdigits(int num){
        int count=0;
        while(num!=0){
            count++;
            num/=10;
        }
        return count;
    }

    public static int[] convertintoArray(int num,int cnt){
        // int length=String.valueOf(num).length();

        int[] numberarray=new int[cnt];

        int count=0;
        for(int i=cnt-1;i>=0;i--){
            numberarray[i]=num%10;
            num/=10;
        }
        return numberarray;
    }
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Method to find the sum of squares of digits
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits){
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Method to check if number is a Harshad Number
    public static boolean isHarshadNumber(int num, int sumOfDigits) {
        return num % sumOfDigits == 0;
    }
    
    public static int[][] digitFrequency(int[] digits) {
        
        int[][] frequency=new int[10][2];
        for(int i=0;i<10;i++){
            frequency[i][0]=i;
        }
        for (int d : digits) {
            frequency[d][1]++;
        }
        return frequency;
    }

    
}
