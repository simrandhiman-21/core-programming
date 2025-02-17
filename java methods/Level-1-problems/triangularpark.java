import java.util.Scanner;

public class triangularpark {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter 1st side of triangular park ");
        double s1=sc.nextDouble();

        System.out.println("Enter 2nd side of triangular park ");
        double s2=sc.nextDouble();

        
        System.out.println("Enter 3rd side of triangular park ");
        double s3=sc.nextDouble();


        if(isValidTriangle(s1,s2,s3)){
            findnumberofrounds(s1,s2,s3);
        }
        else{
            System.out.println("Invalid Triangle");
            System.out.println("Input again ! ");
        }       

    }

    static boolean isValidTriangle(double s1,double s2,double s3){
        return (s1+s2>s3) && (s2+s3>s1) && (s3+s1>s2) ;
    }

    static void findnumberofrounds(double s1,double s2 ,double s3){

        double perimeter =s1+s2+s3;
        //5 km = 5000m
        double distance=5000;
        double rounds=distance/perimeter;

        System.out.println("number of rounds user needs to do to complete 5km run : " + rounds);

    }
    
}
