import java.util.Scanner;

public class quadraticEquation {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        // Taking input for coefficients a, b, and c
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        findQuadraticRoots(a, b, c);

    }
    public static void findQuadraticRoots(double a ,double b,double c){

        double delta=Math.pow(b,2)+4*a*c;
        
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Two real and distinct roots: " + root1 + " and " + root2);
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("One real and equal root: " + root);
        } else {
            System.out.println("No real roots (Complex roots exist).");
        }
    }
    
}
