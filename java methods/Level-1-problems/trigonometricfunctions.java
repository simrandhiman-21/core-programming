import java.util.*;

public class trigonometricfunctions  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter angle in degrees ");
        double angle=sc.nextDouble();

        double[] ans=calculateTrigonometricFunctions(angle);
        System.out.println("Sine: "+ans[0]);
        System.out.println("Cosine: "+ans[1]);
        System.out.println("Tangent: "+ans[2]);

    }

    static double[] calculateTrigonometricFunctions(double angle){
       double angleInRadians=Math.toRadians(angle);

       double sine=Math.sin(angleInRadians);
       double cosine=Math.cos(angleInRadians);
       double tangent=sine/cosine;


       return new double[]{sine,cosine,tangent};


    }
}
