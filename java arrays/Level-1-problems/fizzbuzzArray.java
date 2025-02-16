import java.util.Scanner;

public class fizzbuzzArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Positive Integer :");
        int n=sc.nextInt();

        if(n<0){
            System.out.println("Please Enter a Positive Integer");
            return;
        }

        String[] strarray=new String[n+1];
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                strarray[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                strarray[i] = "Fizz";
            } else if (i % 5 == 0) {
                strarray[i] = "Buzz";
            } else {
                strarray[i] = String.valueOf(i);
            }
        }

        for(int i=0;i<=n;i++){
            System.out.println("Position " + i + " = " + strarray[i]);
        }
        

    }
    
}
