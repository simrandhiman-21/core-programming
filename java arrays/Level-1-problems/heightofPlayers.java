import java.util.Scanner;

public class heightofPlayers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter heights of 11 Players ");

        
        double[] heights=new double[11];
        int i=0;

        while(i<11){
            double height=sc.nextDouble();

            if(height<=0)
            {
                System.out.println("Invalid Input");
                continue;
            }

            heights[i]=height;
            i++;
        }

        double sum=0;
        for(int j=0;j<heights.length;j++){
            sum+=heights[j];
        }
        double mean=sum/11;
        System.out.println("Mean of heights of 11 players is "+mean);

    }
    
}
