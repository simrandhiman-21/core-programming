
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class dataArithmetic {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            // Get user input for date
            System.out.print("Enter a date (yyyy-MM-dd): ");
            String inputDate = sc.nextLine();
    
            // Parse the input date
            LocalDate date = LocalDate.parse(inputDate);
    
            // Perform arithmetic operations
            LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
    
            // Format output
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            System.out.println("Updated date after arithmetic operations: " + newDate.format(formatter));
    
            sc.close();
        }
    }
    