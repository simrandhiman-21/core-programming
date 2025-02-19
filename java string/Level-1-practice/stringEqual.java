import java.util.Scanner;

public class stringEqual {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first String ");
        String firststr=sc.nextLine();
        System.out.println("Enter second String ");
        String secondstr=sc.nextLine();

       boolean ans= compare(firststr,secondstr);
       
       if(ans){
        System.out.println("Both Strings are Equal");
       }
       else{
            System.out.println("Stings are not Equal ");
       }

    }

    public static boolean compare(String firststr,String secondstr){

        for(int i=0;i<firststr.length()-1;i++){
            char c1=firststr.charAt(i);
            char c2=secondstr.charAt(i);

            if(c1!=c2){
                return false;
            }
        }
        return true;        
    }
}
