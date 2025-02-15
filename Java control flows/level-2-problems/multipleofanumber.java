import java.util.Scanner;

public class multipleofanumber {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a number below 100");
    int num=sc.nextInt();

    if (num <= 0 || num >= 100) {
        System.out.println("Please enter a valid number between 1 and 99.");
        sc.close(); // Close scanner before exiting
        return; // Exit the program if invalid input
    }

    for(int i=99;i>=1;i--){
        if(i%num==0){
            System.out.println(i);
        }
    }
    sc.close(); // Close scanner

 }   
}
