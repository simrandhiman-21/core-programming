import java.util.*;


public class gradePercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade: ");

        double physics=sc.nextDouble();
        double chemistry=sc.nextDouble();
        double math=sc.nextDouble();


        double totalMarks=physics+chemistry+math;
        double percentage=totalMarks/3.0;

        String grade,remarks;
        if(percentage>=80){
            remarks="Level 4,above agency-normalized standards";
            grade="A";
        }
        else if(percentage>=70 && percentage<=79){
            remarks="Level 3,agency-normalized standards";
            grade="B";
        }
        else if(percentage>=60 && percentage<=69){
                remarks="Level 2, below but approaching agency-normalized standards";
                grade="C";
        }
        else if(percentage>=50 && percentage<=59){
                remarks="Level 1,well below agency-normalized standards";
                grade="D";
        }
        else if(percentage>=40 && percentage<=49){
                remarks="Level 1- ,too below agency-normalized";
                grade="E";
        }
        else{
                remarks="Remidial standards ";
                grade="R";
        }



        System.out.println("Total Marks: " + totalMarks + " / 300");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);




    }
    
}
