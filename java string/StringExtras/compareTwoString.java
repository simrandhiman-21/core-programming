import java.util.Scanner;

public class compareTwoString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter String 1:");
        String inputOne = sc.nextLine();
        
        System.out.println("Enter String 2:");
        String inputTwo = sc.nextLine(); 
        boolean flag=false;

        for(int i=0;i<Math.min(inputOne.length(),inputTwo.length());i++){
            if(inputOne.charAt(i)<inputTwo.charAt(i)){
                    System.out.println(inputOne +"  and then "+inputTwo );
                    flag=true;
                    break;
            }
            else if(inputOne.charAt(i)>inputTwo.charAt(i)){
                    System.out.println(inputTwo +"  and then "+inputOne);
                    flag=true;
                    break;
            }
        }
        
        if(!flag){
            if(inputOne.length()<inputTwo.length()){ //prefix and equal case handle
                System.out.println(inputOne+ "comes first and then "+ inputOne +"goes second ");
            }
            else if(inputOne.length()>inputTwo.length()){
                System.out.println(inputTwo+ "comes first and then "+ inputTwo +"goes second ");
            }
            else{
                System.out.println("Both strings are equal");
            }
        }


        
        
    }
}
