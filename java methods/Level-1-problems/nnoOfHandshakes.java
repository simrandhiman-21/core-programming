import java.util.Scanner;

public class nnoOfHandshakes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of students ");
        int n=sc.nextInt();
        
        findnumberofHandshakes(n);
    }

    static void findnumberofHandshakes(int n){
        int comb=(n*(n+1))/2;
        System.out.println("Total Number of HandShakes "+comb);
    }        
}

