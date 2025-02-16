import java.util.Scanner;

public class marksofStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // Arrays to store marks, percentages, grades, and remarks
        double[] physics = new double[numStudents];
        double[] chemistry = new double[numStudents];
        double[] maths = new double[numStudents];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];
        String[] remarks = new String[numStudents];

        // Taking input for marks using a simple loop
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            System.out.print("Physics (out of 100): ");
            physics[i] = sc.nextDouble();
            if (physics[i] < 0 || physics[i] > 100) {
                System.out.println("Invalid marks! Enter between 0 and 100.");
                i--; // Repeat input
                continue;
            }

            System.out.print("Chemistry (out of 100): ");
            chemistry[i] = sc.nextDouble();
            if (chemistry[i] < 0 || chemistry[i] > 100) {
                System.out.println("Invalid marks! Enter between 0 and 100.");
                i--;
                continue;
            }

            System.out.print("Maths (out of 100): ");
            maths[i] = sc.nextDouble();
            if (maths[i] < 0 || maths[i] > 100) {
                System.out.println("Invalid marks! Enter between 0 and 100.");
                i--;
                continue;
            }

            // Calculate percentage
            percentages[i] = (physics[i] + chemistry[i] + maths[i]) / 3;

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
            System.out.println("Student " + (i + 1) + ": Physics = " + physics[i] +
                ", Chemistry = " + chemistry[i] + ", Maths = " + maths[i] +
                ", Percentage = " + String.format("%.2f", percentages[i]) + "%, Grade = " + grades[i] +
                ", Remarks: " + remarks[i]);
        }

        sc.close(); // Closing scanner
    }
}
