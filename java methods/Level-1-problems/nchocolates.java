import java.util.Scanner;

public class nchocolates {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter N number of chocolates ");
    int n = sc.nextInt();

    System.out.println("Enter M number of children  ");
    int m = sc.nextInt();

    int[] result=findnumber(n,m);
    System.out.println("Number of chocolates each student get  "+result[0]);
    System.out.println("Number of students left "+ result[1]);

 }
 static int[] findnumber(int chocolates,int children){

    int ans=chocolates/children;
    int rem=chocolates%children;
    return new int[]{ans,rem};    
 }   
}
