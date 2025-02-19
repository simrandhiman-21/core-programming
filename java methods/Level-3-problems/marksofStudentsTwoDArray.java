import java.util.Scanner;

public class marksofStudentsTwoDArray {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
        
            // Taking input for the number of students
            System.out.print("Enter the number of students: ");
            int numStudents = sc.nextInt();
    
            // 2D array to store marks [students][subjects]
            double[][] marks = new double[numStudents][3];
            double[] percentages = new double[numStudents];
            String[] grades = new String[numStudents];
            String[] remarks = new String[numStudents];
            String[] subjects = {"Physics", "Chemistry", "Maths"};
    
            // Taking input for marks using a simple loop
            for (int i = 0; i < numStudents; i++) {
                System.out.println("\nEnter marks for Student " + (i + 1) + ":");
    
                for (int j = 0; j < 3; j++) {
                    while (true) {
                        System.out.print(subjects[j] + " (out of 100): ");
                        marks[i][j] = sc.nextDouble();
    
                        if (marks[i][j] >= 0 && marks[i][j] <= 100) {
                            break; // Valid input, exit loop
                        } else {
                            System.out.println("Invalid marks! Enter between 0 and 100.");
                        }
                    }
                }
    
                // Calculate percentage
                percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;
    
                // Assign grades and remarks
                if (percentages[i] >= 80) {
                    grades[i] = "A";
                    remarks[i] = "Level 4, above agency-normalized standards";
                } else if (percentages[i] >= 70) {
                    grades[i] = "B";
                    remarks[i] = "Level 3, agency-normalized standards";
                } else if (percentages[i] >= 60) {
                    grades[i] = "C";
                    remarks[i] = "Level 2, below but approaching agency-normalized standards";
                } else if (percentages[i] >= 50) {
                    grades[i] = "D";
                    remarks[i] = "Level 1, well below agency-normalized standards";
                } else if (percentages[i] >= 40) {
                    grades[i] = "E";
                    remarks[i] = "Level 1-, too below agency-normalized";
                } else {
                    grades[i] = "R";
                    remarks[i] = "Remedial standards";
                }
            }
    
            // Display results
            System.out.println("\nStudent Details:");
            for (int i = 0; i < numStudents; i++) {
                System.out.println("Student " + (i + 1) + ": Physics = " + marks[i][0] +
                    ", Chemistry = " + marks[i][1] + ", Maths = " + marks[i][2] +
                    ", Percentage = " + String.format("%.2f", percentages[i]) + "%, Grade = " + grades[i] +
                    ", Remarks: " + remarks[i]);
            }
    
            
        }
    }
    
