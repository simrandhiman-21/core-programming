
import java.util.Scanner;
public class totalprice {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the unit price of the item
        System.out.print("Enter the unit price of the item (in INR): ");
        double unitPrice = input.nextDouble();
        
        // Prompt the user to enter the quantity to be bought
        System.out.print("Enter the quantity of the item: ");
        int quantity = input.nextInt();
        
        // Calculate the total price
        double totalPrice = unitPrice * quantity;
        
        // Output the result
        System.out.printf("The total purchase price is INR %.2f if the quantity is %d and unit price is INR %.2f\n", totalPrice, quantity, unitPrice);
        

    }
}
