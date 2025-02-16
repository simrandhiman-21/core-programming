import java.util.Scanner;

public class calender {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        if(args.length!=3){
            System.out.println("Please enter the year, month and day");
        }

        int m=Integer.parseInt(args[0]);
        int d=Integer.parseInt(args[1]);
        int y=Integer.parseInt(args[2]);

        int y0=y-(14-m)/12;
        int x=y0+y0/4-y0/100+y0/400;
        int m0=m+12*((14-m)/12)-2;
        int d0=(d+x+(31*m0)/12)%7;

       // 0 for Sunday,
       // 1 for Monday, 
       // 2 for Tuesday,
       // 3 for wednesday,
       // 4 for Thursday,
       // 5 for Friday,
       // 6 for Saturday
       

        System.out.println(d0);


    }
    
}
