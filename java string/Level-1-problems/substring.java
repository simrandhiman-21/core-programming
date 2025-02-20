import java.util.*;

public class substring {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first String ");
        String firststr=sc.nextLine();
        System.out.println("Enter second String ");
        String secondstr=sc.nextLine();

        System.out.println("Enter Start of substing ");
        int start=sc.nextInt();
        System.out.println("Enter End of substring ");
        int end=sc.nextInt();


       boolean ans= compare(firststr,secondstr);
       if(ans==true){
        System.out.println("Both strings are equal");
       }
       else {
        System.out.println("Both strings are not equal");
       }

       String substr1=findsubstring(firststr,start,end);
       String substr2=findsubstring(secondstr,start,end);

       if(substr1==substr2){
        System.out.println("Both SUBSTRINGS  have same substring");
       }
       else{
        System.out.println("Both SUBSTRINGS do not have same substring");
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
    public static String findsubstring(String firststr,int start,int end){
        return firststr.substring(start,end+1);    
    }    
}
