import java.util.*;

public class switchCaseCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Getting user input
        System.out.print("Enter the first number: ");
        double first = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double second = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        String op = sc.next();


       switch (op) {
            case "+":
                System.out.println("Result is : "+(first+second));
                break;

            case "-":
                System.out.println("Result is : " + (first-second));
                break;

            case "*":
                System.out.println("Result is :" + (first*second));
                break;
        
            case "/":
                if(second!=0){
                    System.out.println("Result is :" +(first/second));
                }
                else{
                    System.out.println("Error: Division by zero is not allowed");
                }

            default:
            System.out.println("Invalid Operator"); 
            break;
       }

    }
}
