import java.util.Scanner;

public class temp {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Temperature (°F) less than 50 ");
        double temp=sc.nextDouble();


        System.out.print("Enter Wind Speed (mph) more than 3  ");
        double windspeed=sc.nextDouble();


        if(temp>50 || windspeed<=3){
            System.out.println("Wind chill calculation is only valid for temperatures at or below 50°F and wind speeds above 3 mph.");
        }
        else{

            double ans=findwindSpeed(temp,windspeed);
            System.out.println("WindSpeed is "+ ans);
        }
            
    }

    static double findwindSpeed(double temp,double WindSpeed){

       return 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * Math.pow(WindSpeed,0.16);
       

    }
}
