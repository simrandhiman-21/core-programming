import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Year greater than 1582");
        int year = sc.nextInt();
        if (year <= 1582) {
            System.out.println("Invalid input! Please enter a year greater than 1582.");
        }
        else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year");
        }
         else {
                System.out.println(year + " is not a leap year");
        }
    }
}
