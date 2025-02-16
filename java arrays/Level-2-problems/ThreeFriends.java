import java.util.Scanner;

public class ThreeFriends {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        // Taking input for age and height
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + friends[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.println("Enter height (in cm) of " + friends[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        int yougest=0;
        int tallest=0;

        for(int i=1;i<ages.length;i++){
            if(ages[i]<ages[yougest]){
                yougest=i;
            }
        }
        for(int i=1;i<heights.length;i++){
            if(heights[i]>heights[tallest]){
                tallest=i;
            }
        }
        System.out.println("The youngest is " + friends[yougest]);
        System.out.println("The tallest is " + friends[tallest]);




    }    
}
