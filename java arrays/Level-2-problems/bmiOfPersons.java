import java.util.Scanner;

public class bmiOfPersons {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      
        System.out.println("Enter the number of persons: ");
        int numPersons = sc.nextInt();

      
        double[] heights = new double[numPersons];
        double[] weights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] weightStatus = new String[numPersons];

        
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter height (in meters) for person " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            System.out.println("Enter weight (in kg) for person " + (i + 1) + ": ");
            weights[i] = sc.nextDouble();
        }

        // Calculating BMI and determining weight status
        for (int i = 0; i < numPersons; i++) {
            bmis[i] = weights[i] / (heights[i] * heights[i]);
            
            if (bmis[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmis[i] >= 25 && bmis[i] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nPerson Details:");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1) + ": Height = " + heights[i] + "m, Weight = " + weights[i] + "kg, BMI = " + String.format("%.2f", bmis[i]) + ", Status = " + weightStatus[i]);
        }
    }
}

