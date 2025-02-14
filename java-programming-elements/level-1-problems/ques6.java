public class ques6 {
    public static void main(String[] args) {
                // Define the course fee
                double fee = 125000;
                
                // Define the discount percentage
                double discountPercent = 10;
                
                // Calculate the discount amount
                double discount = (discountPercent / 100) * fee;
                
                // Calculate the final discounted price
                double finalFee = fee - discount;
                
                // Print the results
                System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f\n", discount, finalFee);
            }
        }        
