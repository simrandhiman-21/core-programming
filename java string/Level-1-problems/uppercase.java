import java.util.Scanner;

public class uppercase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string in LowerCase ");
        String input = sc.nextLine();

        String buildInUpper=input.toUpperCase();
        System.out.println("Inbuild " + buildInUpper);
        String manulaUpper=convertUpper(input);
        System.out.println("Manual "+ manulaUpper);

        boolean ans=compareString(buildInUpper,manulaUpper);

        if(ans) System.out.println(" both uppercase results identical ");
        else System.out.println("NOT  uppercase results identical");


    }
    public static String convertUpper(String input){

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);

            if(c>='a' && c<='z'){
                c=(char)(c-32); //upper case by subtract 32 
            }
            sb.append(c);
        }
        return sb.toString();
    }
    public static boolean compareString(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;    
    }
    
}
