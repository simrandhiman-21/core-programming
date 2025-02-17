import java.util.Scanner;

public class springSeason {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a month in numbers (1-2-3....)");
        int month=sc.nextInt();

        System.out.println("Enter day in number (1-2-3....)");
        int day=sc.nextInt();

        if(findseason(month,day))System.out.println("Its a Spring Season");
        else System.out.println("Not a Spring Season");
    }
    static boolean findseason(int  month,int day){
        return (month==3 && day>=20) || (month==4) || (month==5) || (month==6 && day<=20);
    }
}
