import java.util.*;

public class substring {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first String ");
        String input=sc.nextLine();
        
        System.out.println("Enter Start of substing ");
        int start=sc.nextInt();
        System.out.println("Enter End of substring ");
        int end=sc.nextInt();

        String inbuild=findsubstring(input,start,end);
        String manual= manualSubstring(input,start,end);    
        
        System.out.println("Inbuild string "+inbuild);
        System.out.println("Manual string "+manual);


        boolean areEqual=compareStrings(inbuild,manual);
        if (areEqual) {
            System.out.println("Both substrings are equal.");
        } else {
            System.out.println("Substrings are NOT equal.");
        }    
   }

    public static String findsubstring(String firststr,int start,int end){
        return firststr.substring(start,end);    
    }    

    public static String manualSubstring(String input,int start,int end){

        StringBuilder sb=new StringBuilder();

        for(int i=start;i<end;i++){
            sb.append(input.charAt(i));
        }
        return sb.toString();         
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
