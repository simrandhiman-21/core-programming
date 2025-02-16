import java.util.Scanner;

public class canvote {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] age=new int[10];
        System.out.println("Enter the ages of 10 students ");

        for(int i=0;i<age.length;i++){
            age[i]=sc.nextInt();

            if(age[i]<0){
                System.out.println("Invalid age entered. Please enter a valid age.");
                i--;
            }
        }

        for(int i=0;i<age.length;i++){
            if(age[i]>=18){
                System.out.println(age[i]+ " can vote ");
            }
            else{
                System.out.println(age[i]+ " can't vote ");
            }
        }

    }    
}
