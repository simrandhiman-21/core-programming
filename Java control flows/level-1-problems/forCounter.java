import java.util.*;
class forCounterjava{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a non-negative number");
        int counter=sc.nextInt();
        for(int i=counter;i>=1;i--){
            System.out.println(i);
        }
    }
}