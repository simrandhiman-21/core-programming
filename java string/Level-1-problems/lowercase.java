import java.util.Scanner;

public class lowercase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string in UPPERCASE ");
        String input = sc.nextLine();

        String buildInLower=input.toLowerCase();
        System.out.println("Inbuild " + buildInLower);
        String manulaLower=convertLower(input);
        System.out.println("Manual "+ manulaLower);

        boolean ans=compareString(buildInLower,manulaLower);

        if(ans) System.out.println(" both uppercase results identical ");
        else System.out.println("NOT  uppercase results identical");

    }
    public static String convertLower(String input){

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);

            if(c>='A' && c<='Z'){
                c=(char)(c+32); //lower case by add 32 
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

        

