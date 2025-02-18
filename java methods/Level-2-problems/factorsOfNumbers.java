import java.util.Scanner;

public class factorsOfNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        int[] ans=findfactors(n);
        System.out.println("Printing Factors of "+n );

        for(int i:ans){
            System.out.println(i);
        }
        System.out.println();

        findsumofFactor(ans);
        findProductofFactor(ans);
        findsumofsquares(ans);

    }

    static int[] findfactors(int n){
        
        
        int cnt=0;
        
        //count size of factors array // factors cnt 
        for(int i=1;i<=n;i++){
            if(n%i==0){
                cnt++;
            }
        }


        int[] factors=new int[cnt];
        int index=0;


        for(int i=1;i<=n;i++){
            if(n%i==0){
                factors[index++]=i;
            }
        }

        return factors;
    }

    static void findsumofFactor(int[] factor){
        int sum=0;
        for(int i:factor){
            sum+=i;
        }
        System.out.println("Sum of Factor Array is "+sum);
    }
    static void findProductofFactor(int[] factor){
        int product=1;
        for(int i:factor){
            product+=i;
        }
        System.out.println("Product of Factor Array is "+product);
    }
    static void findsumofsquares(int[] factor){
        
        int sum=0;
            int square=2;
            for(int i:factor){
                sum+=Math.pow(i,square);
        }
        
        System.out.println("Sum of Square Array is "+sum);
        
    }    
}
