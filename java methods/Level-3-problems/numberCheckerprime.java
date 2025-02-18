import java.util.Scanner;

public class numberCheckerprime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Is Prime? " + isPrime(num));
        System.out.println("Is Neon? " + isNeon(num));
        System.out.println("Is Spy? " + isSpy(num));
        System.out.println("Is Automorphic? " + isAutomorphic(num));
        System.out.println("Is Buzz? " + isBuzz(num));


    }

    public static boolean isPrime(int num) {

        if(num<2)return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0)return false;
        }
        return true;
    }

    public static boolean isNeon(int num) {
        int sum = 0;
        int square=num*num;
        
        while(square>0){
            sum+=square%10;
            square/=10;
        }
        return sum==num;        
              
    }

    
    public static boolean isSpy(int num) {
        int sum=0;
        int product=1;
    
        while(num>0){
            int rem=num%10;
            sum+=rem;
            product*=rem;
            num/=10;
        }
        return sum==product;     
       
    }

    
    public static boolean isAutomorphic(int num) {
        int square=num*num;
       return String.valueOf(square).endsWith(String.valueOf(num));
        
    }

  
    public static boolean isBuzz(int num) {
        return num%7==0 || num % 10==7;
       
    }

    
}
