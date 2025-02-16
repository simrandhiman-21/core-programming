import java.util.Scanner;

public class bmiTwoDArray {
 public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the number of persons: ");
        int numPersons = sc.nextInt();

        
        double[][] personData = new double[numPersons][3]; // [height, weight, BMI]
        String[] weightStatus = new String[numPersons];

       
        for (int i = 0; i < numPersons; i++) {
            do {
                System.out.println("Enter height (in meters) for person " + (i + 1) + ": ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Height must be a positive value. Please enter again.");
                }
            } while (personData[i][0] <= 0);

            do {
                System.out.println("Enter weight (in kg) for person " + (i + 1) + ": ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Weight must be a positive value. Please enter again.");
                }
            } while (personData[i][1] <= 0);
        }

        // Calculating BMI and determining weight status
        for (int i = 0; i < numPersons; i++) {
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);
            
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25 && personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Displaying results
        System.out.println("\nPerson Details:");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1) + ": Height = " + personData[i][0] + "m, Weight = " + personData[i][1] + "kg, BMI = " + String.format("%.2f", personData[i][2]) + ", Status = " + weightStatus[i]);
        }
    }
}

