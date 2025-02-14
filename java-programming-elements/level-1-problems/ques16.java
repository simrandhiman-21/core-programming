import java.util.Scanner;
public class ques16 {
        public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        
        // Calculate the maximum number of handshakes using the combination formula
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        
        // Output the result
        System.out.println("The maximum number of possible handshakes among " + numberOfStudents + " students is: " + handshakes);
        
        // Close the scanner to prevent resource leak
        input.close();
    }
}
