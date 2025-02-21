import java.util.Scanner;

public class compareTwoString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter String 1:");
        String inputOne = sc.nextLine();
        
        System.out.println("Enter String 2:");
        String inputTwo = sc.nextLine(); 
        
        sc.close(); // Close scanner to prevent memory leaks
        
        // Using compareTo() to compare strings lexicographically
        int result = inputOne.compareTo(inputTwo);

        if (result < 0) {
            System.out.println(inputOne + " comes before " + inputTwo);
        } else if (result > 0) {
            System.out.println(inputTwo + " comes before " + inputOne);
        } else {
            System.out.println("Both strings are equal.");
        }
    }
}
