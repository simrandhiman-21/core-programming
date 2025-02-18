import java.util.Scanner;

public class numberChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();

        int cnt=countdigits(num);
        System.out.println("Number of digits in the number is "+cnt);

        int[] numberarray=convertintoArray(num,cnt);
        
        boolean ans=duckNumber(numberarray);
        if(ans)
        System.out.println("Duck Number");
        else
        System.out.println("It's Not Duck Number ");

        boolean numbercheck=armstrongnumber(num,cnt);
        if(numbercheck)
        System.out.println("Armstrong Number");
        else
        System.out.println("It's Not Armstrong Number");

        int[] result=largestandsecondlargesttElemet(numberarray);
        System.out.println("Largest Element: "+result[0]);
        System.out.println("Second Largest Element: "+result[1]);

        int[] resultss=smallestandSecondSmallestElemet(numberarray);
        System.out.println("Smallest Element: "+resultss[0]);
        System.out.println("Second Smallest Element: "+resultss[1]);

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
    
    public static boolean duckNumber(int[] numberarray){
        for (int i = 1; i < numberarray.length; i++) { // Start from index 1 (skip first digit)
            if (numberarray[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean armstrongnumber(int num,int digits) {

        int temp=num;
        int sum=0;

        while(temp!=0){
            int rem=temp%10;
            int power=1;
            for(int i=0;i<digits;i++){
                power*=rem;
            }
            sum+=power;
            temp/=10;
        }
        return sum==num;
    }

    public static int[] largestandsecondlargesttElemet(int[] numberarray){
        
        int largest=Integer.MIN_VALUE ;
        int secondLargest=Integer.MIN_VALUE ;

        for(int i:numberarray){
            if(i>largest){
                secondLargest=largest;
                largest=i;
            }
            else if(i>secondLargest && i!=largest){
                secondLargest=i;
            }
        }
        return new int[]{largest,secondLargest};
    }
    public static int[] smallestandSecondSmallestElemet(int[] numberarray){
        int smallest=Integer.MAX_VALUE ;
        int secondSmallest=Integer.MAX_VALUE ;
        for(int i:numberarray){
            if(i<smallest){
                secondSmallest=smallest ;
                smallest=i;
            }
            else if(i<secondSmallest && i!=smallest){
                secondSmallest=i ;
            }
        }
        return new int[]{smallest,secondSmallest};
    }
}

