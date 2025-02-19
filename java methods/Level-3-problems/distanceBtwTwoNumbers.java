import java.util.Scanner;

public class distanceBtwTwoNumbers {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the x1 :  ");
        double x1 = sc.nextDouble();
        System.out.println("Enter the y1 :  ");
        double y1 = sc.nextDouble();

        System.out.println("Enter the x2 : ");
        double x2 = sc.nextDouble();
        System.out.println("Enter the y2 : ");
        double y2 = sc.nextDouble();


        double ans=findEuclideandistance(x1, y1, x2, y2);
        System.out.println("The distance between the two points is : "+ans);

        double[] lineEquation = findEquationOfLine(x1, y1, x2, y2);
        System.out.printf("The equation of the line is: y = %.2fx + %.2f%n", lineEquation[0], lineEquation[1]);

        
        System.out.println("Enter value of X ");
        double x=sc.nextDouble();
        System.out.println("Equation "+lineEquation[0]*x+lineEquation[1]);


    }

    public static double findEuclideandistance(double x1,double y1,double x2,double y2){
         return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    
    public static double[] findEquationOfLine(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1); // Calculate slope (m)
        double b = y1 - (m * x1); // Calculate y-intercept (b)
        return new double[]{m, b}; // Return as an array [m, b]
    }

}
