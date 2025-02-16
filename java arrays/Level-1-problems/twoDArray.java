import java.util.Scanner;

public class twoDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number of Rows ");
        int row=sc.nextInt();
        System.out.println("Enter Number of Columns ");
        int col=sc.nextInt();
        
        int[][] matrix=new int[row][col];
        System.out.println("Enter Elements in 2D Array ");

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        //convert 1-D array 
        int[] arr=new int[row*col];
        int index=0;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[index++]=matrix[i][j];
            }
        }
            
         // Display the copied 1D array
         System.out.println("\nConverted 1D Array:");
         for (int num : arr) {
             System.out.print(num + " ");
         }

    }
    
}
