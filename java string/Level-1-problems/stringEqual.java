import java.util.Scanner;

public class stringEqual {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first String ");
        String firststr=sc.nextLine();
        System.out.println("Enter second String ");
        String secondstr=sc.nextLine();

        // Comparing strings using charAt method
       boolean ans= compare(firststr,secondstr);

       // Comparing using built-in equals method
       boolean equals=firststr.equals(secondstr);

       System.out.println("Answer string is " +ans);
       System.out.println("Answer string is " +equals);
       
       if(ans==equals){
            System.out.println("Both methods give the same result.");
       }
       else{
        System.out.println("Methods give different results.");
       }

    }

    public static boolean compare(String firststr,String secondstr){

        if(firststr.length()!=secondstr.length()){
            return false;
        }

        for(int i=0;i<firststr.length();i++){
            char c1=firststr.charAt(i);
            char c2=secondstr.charAt(i);

            if(c1!=c2){
                return false;
            }
        }
        return true;        
    }
}
