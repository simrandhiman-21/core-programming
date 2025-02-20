import java.util.*;

public class ageofStudents {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
   
        
                // Take user input for the number of students
                System.out.println("Enter the number of students:");
                int n = sc.nextInt();
        
                // Generate random ages for students
                int[] studentAges = generateRandomAges(n);
        
                // Check voting eligibility and store in a 2D array
                String[][] eligibilityTable = checkVotingEligibility(studentAges);
        
                // Display results in tabular format
                displayTable(eligibilityTable);
        
                sc.close();
            }
        
            // Method to generate random 2-digit ages for students
            public static int[] generateRandomAges(int n) {
                Random rand = new Random();
                int[] ages = new int[n];
        
                for (int i = 0; i < n; i++) {
                    ages[i] = rand.nextInt(90) + 10; // Generates a random number between 10 and 99
                }
        
                return ages;
            }
        
            // Method to check voting eligibility and return a 2D array
            public static String[][] checkVotingEligibility(int[] ages) {
                String[][] result = new String[ages.length][2];
        
                for (int i = 0; i < ages.length; i++) {
                    result[i][0] = String.valueOf(ages[i]); // Store age
        
                    // Check if age is negative (invalid input) or if the student can vote
                    if (ages[i] < 0) {
                        result[i][1] = "Invalid Age";
                    } else if (ages[i] >= 18) {
                        result[i][1] = "Can Vote";
                    } else {
                        result[i][1] = "Cannot Vote";
                    }
                }
        
                return result;
            }
        
            // Method to display the 2D array in a tabular format
            public static void displayTable(String[][] data) {
                System.out.println("\nStudent Age\tVoting Eligibility");
                System.out.println("----------------------------------");
        
                for (String[] row : data) {
                    System.out.println(row[0] + "\t\t" + row[1]);
                }
            }
        }
        