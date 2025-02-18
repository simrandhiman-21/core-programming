import java.util.Scanner;

public class sumofnaturalNumbers {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number ");
        int number=sc.nextInt();
        
        if(number<0)System.out.println("Enter a Non-negative Number ");
        
        double ans1=findsumofnNaturalnumber(number);
        double sum=0;
        double ans2=findsumodnNaturalnumberusingFormula(number,sum);
        
        if(ans1==ans2){
            System.out.println("Same Answer");
        }
        else{
            System.out.println("Not same");
        }
    }
    
    static double findsumofnNaturalnumber(int number){
        
        double formula=number*(number+1)/2;
        return formula;
        
    }
    static double findsumodnNaturalnumberusingFormula(int number,double sum){
        
        sum+=number;
        if(number==0)return sum;
        return findsumodnNaturalnumberusingFormula(number-1,sum);
        
    }

}

