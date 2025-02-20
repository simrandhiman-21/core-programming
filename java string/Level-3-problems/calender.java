import java.util.Scanner;

public class calender {

    private static final String[] MONTHS = {"January", "February", "March", "April", "May", "June", "July",
    "August", "September", "October", "November", "December"};

    private static final int[] DAYS_IN_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the month");
        int month=sc.nextInt();
        System.out.println("Enter the year");
        int year=sc.nextInt();

        displayCalender(month,year);
    }
    public static void displayCalender(int month,int year){ 

        System.out.println("\n"+MONTHS[month-1]+" "+year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int dayInmonth=DAYS_IN_MONTH[month-1];
        if(month==2 && isLeapYear(year)){
            dayInmonth=29;
        }
        int firstdayofmonth=getFirstDayOfMonth(month, year);
        // Print initial spaces for the first day
        for (int i = 0; i < firstdayofmonth; i++) {
            System.out.print("    ");
        }
        // Print days of the month
        for (int day = 1; day <= dayInmonth; day++) {
            System.out.printf("%3d", day);
            if((firstdayofmonth+day)%7==0){
                System.out.println();
            }
        }
        System.out.println();    
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    public static int getFirstDayOfMonth(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m0) / 12) % 7;
    }

}
