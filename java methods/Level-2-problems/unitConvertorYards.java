import java.util.Scanner;

public class unitConvertorYards {

    private static final double YARDS_TO_FEET = 3;
    private static final double FEET_TO_YARDS = 0.333333;
    private static final double METERS_TO_INCHES = 39.3701;
    private static final double INCHES_TO_METERS = 0.0254;
    private static final double INCHES_TO_CM = 2.54;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the value in yards");
        double yards=sc.nextDouble();
        System.out.println(" yards to feet "+convertYardsToFeet(yards));

        System.out.println("Enter the value in feet");
        double feet=sc.nextDouble();
        System.out.println(" yards to feet "+convertFeetToYards(feet));

        System.out.println("Enter the value in meters");
        double meters=sc.nextDouble();
        System.out.println(" yards to feet "+convertMetersToInches(meters));

        System.out.println("Enter the value in inches");
        double inches=sc.nextDouble();
        System.out.println(" yards to feet "+convertInchesToMeters(inches));

        System.out.println("Enter the value in inchees");
        double inchess=sc.nextDouble();
        System.out.println(" yards to feet "+convertInchesToCentimeters(inchess));      

    }


        public static double convertYardsToFeet(double yards){
            return yards*YARDS_TO_FEET;
        }

        public static double convertFeetToYards(double feet){
            return feet*FEET_TO_YARDS;
        }
        public static double convertMetersToInches(double meters){
            return meters*METERS_TO_INCHES;
        }
        public static double convertInchesToMeters(double inches){
            return inches*INCHES_TO_METERS;
        }
        public static double convertInchesToCentimeters(double inchess){
            return inchess*INCHES_TO_CM;
        }


}
