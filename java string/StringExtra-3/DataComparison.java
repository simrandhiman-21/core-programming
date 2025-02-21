import java.util.Scanner;

import java.time.LocalDate;
import java.util.Scanner;

public class DataComparison {

    
    public class DateComparison {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            // Get two dates from the user
            System.out.print("Enter the first date (yyyy-MM-dd): ");
            LocalDate date1 = LocalDate.parse(sc.nextLine());
    
            System.out.print("Enter the second date (yyyy-MM-dd): ");
            LocalDate date2 = LocalDate.parse(sc.nextLine());
    
            // Compare dates
            if (date1.isBefore(date2)) {
                System.out.println(date1 + " comes before " + date2);
            } else if (date1.isAfter(date2)) {
                System.out.println(date1 + " comes after " + date2);
            } else {
                System.out.println(date1 + " is the same as " + date2);
            }
    
            sc.close();
        }
    }
}
    