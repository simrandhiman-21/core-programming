import java.util.Scanner;

public class oddEvenArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Natural Number ");
        int n=sc.nextInt();
        if(n<=0){
            System.out.println("Invalid input");
            return;
        }      


        int[] odd=new int[n/2+1];
        int[] even=new int[n/2+1];

        int oddindex=0;
        int evenindex=0;


        for(int i=1;i<=n;i++){
            if(i%2==0){
                even[evenindex]=i;
                evenindex++;
            }
            else{
                odd[oddindex]=i;
                oddindex++;
            }
        }

        System.out.println("Odd Numbers:");

        for (int i = 0; i < oddindex; i++) {
            System.out.print(odd[i] + " ");
        }

        System.out.println();

        System.out.println("Even Numbers:");

        for (int i = 0; i < evenindex; i++) {
            System.out.print(even[i] + " ");
        }
             

    }
    
}
