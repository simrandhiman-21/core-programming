import java.util.Scanner;

public class numbercheckerfactors {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = findFactors(num);
        
        System.out.println("Factors: ");
        for (int factor : factors) System.out.print(factor + " ");
        
        System.out.println("\nGreatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(factors));
        System.out.println("Is Perfect? " + isPerfect(num, factors));
        System.out.println("Is Abundant? " + isAbundant(num, factors));
        System.out.println("Is Deficient? " + isDeficient(num, factors));
        System.out.println("Is Strong? " + isStrong(num));

        sc.close();
    }

    
    public static int[] findFactors(int num) {
        int[] factors = new int[num / 2 + 1];
        int index = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
        
    }

   
    public static int findGreatestFactor(int[] factors) {
        int max = factors[0];
        for(int i:factors){
            if(i>max){
                max=i;
            }
        }
        return max;
        
    }


    public static int sumOfFactors(int[] factors) {
        int sum=0;
        for(int i:factors){
            sum+=i;
        }
        return sum;
    }

  
    public static int productOfFactors(int[] factors) {
        int product=1;
        for(int i:factors){
            product*=i;
        }
        return product;
       
    }

 
    public static double productOfCubeOfFactors(int[] factors) {
        int product=1;
        for(int i:factors){
            product*=Math.pow(i, 3);
        }
        return product;        
    }

  
    public static boolean isPerfect(int num, int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length - 1; i++) { 
            sum += factors[i];
        }
        return sum == num;

        
    }

    
    public static boolean isAbundant(int num, int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length - 1; i++) {
            sum += factors[i];
        }
        return sum > num;
        
    }

    public static boolean isDeficient(int num, int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length - 1; i++) {
            sum += factors[i];
        }
        return sum<num;
       
    }

    
    public static boolean isStrong(int num) {
        
        int original = num;
        int sum = 0;

        while (num > 0) {
            sum += factorial(num % 10); // Compute factorial of each digit
            num /= 10;
        }
        return sum == original;
    }


    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;       
    }
}

