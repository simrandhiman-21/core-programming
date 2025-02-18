import java.util.Scanner;

public class FootballTeam {
    public static void main(String[] args) {
        double[] heights=generateRandomHeightArray(11);

        System.out.println("Heights of the football team:");
        for(double i:heights){
            System.out.print(i+" ");
        }

        double sumofheights=findsumofheights(heights);
        System.out.println("Sum of heights of the football team is "+sumofheights);

        findmeanHeight(heights,sumofheights);

        findShortestHeight(heights);

        findtallestHeight(heights);


    }
    public static  double[] generateRandomHeightArray(int size){
        double[] array=new double[size];
        for(int i=0;i<size;i++){
            array[i]=(int)(Math.random()*200)+150;
        }
        return array;
    }
    public static  double findsumofheights(double[] heights){
        double sum=0;
        for(double i:heights){
            sum+=i;
        }
        return sum;
    }
    public static void findmeanHeight(double[] heights,double sumofheights){

        System.out.println("Mean Height of Players "+ sumofheights/heights.length);

    }

    public static void findShortestHeight(double[] heights){
        double shortest=heights[0];
        for(double i:heights){
            if(i<shortest){
                shortest=i;
            }
        }
        System.out.println("Shortest height is "+shortest);

    }
    
    public static void findtallestHeight(double[] heights){
        double tallest=heights[0];
        for(double i:heights){
            if(i>tallest){
                tallest=i;
            }
        }
        System.out.println("Tallest Height is "+tallest);
    }
    
}
