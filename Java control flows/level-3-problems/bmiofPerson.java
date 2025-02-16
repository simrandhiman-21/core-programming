import java.util.Scanner;

public class bmiofPerson {
 public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your Weight (kg)");
        double weight = sc.nextDouble();

        System.out.println("Enter your Height (m)");
        double height = sc.nextDouble();

        double bmi=weight/(height*height);
        System.out.println("Your BMI is: "+bmi);

        // m =  feet* 0.3048

        if(bmi<=18.4){
            System.out.println("You are underweight");
        }
        else if(bmi>=18.5 && bmi<=24.9){
            System.out.println("You are normal weight");
        }
        else if(bmi>=25.0 && bmi<=39.9){
            System.out.println("You are overweight");
        }
        else{
            System.out.println("You are obese");
        }
 }   
}
