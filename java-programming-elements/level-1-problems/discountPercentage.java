import java.util.Scanner;
public class discountPercentage {

    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter the student fee: ");
        double fee = input.nextDouble();
        
        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();
        
        // Calculate discount amount
        double discount = (discountPercent / 100) * fee;
        
        // Calculate final fee
        double finalFee = fee - discount;
        
        // Print the result
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f\n", discount, finalFee);
        
      
    }
}
