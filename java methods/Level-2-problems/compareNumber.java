import java.util.Scanner;

public class compareNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        
        int[] numbers=new int[5];
        
        for(int i=0;i<numbers.length;i++){
            System.out.println("Enter number "+(i+1)+":");
            numbers[i]=sc.nextInt();
        }
        
        isPostive(numbers);
        
        int first=numbers[0];
        int last=numbers[numbers.length-1];

        int result=compareMethod(first,last);

        if(result==1) System.out.println(first+ " is greater than "+last);
        else if(result==0) System.out.println(first+" is equal to "+last);
        else System.out.println(last+" is greater than "+ last);
    }
    public static void isPostive(int[] numbers){
        for(int i:numbers){
            if(i>=0){
                System.out.println(i+" is positive");
                if(isEven(i)){
                    System.out.println(i+" is even");
                }
                else{
                    System.out.println(i+" is odd");
                }
            }

            else{
                System.out.println(i+" is negative");
            }

        }
    }

    public static boolean isEven(int num){
        return num%2==0;        
    }
    public static int compareMethod(int n1,int n2){


        if(n1>n2){
            return 1;
        }
        else if(n2>n1){
            return -1;
        }
        else{
            return 0;
        }
        
    }
}
