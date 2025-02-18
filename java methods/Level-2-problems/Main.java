import java.util.Scanner;

class StudentVotehecker {

    int age;

    public boolean canstudentVote(int age){
        if (age < 0) {
            System.out.println("Invalid age! Age cannot be negative.");
            return false;
        }
        return age>=18;
    }   
    
}

public class Main{
    
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        
        StudentVotehecker obj=new StudentVotehecker();

        int[] studentsage=new int[10];
        for(int i=0;i<studentsage.length;i++){
            System.out.println("Enter the age of student"+(i+1)+" : ");
            studentsage[i]=sc.nextInt();
            if(obj.canstudentVote(studentsage[i])){
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
           
    }
}
