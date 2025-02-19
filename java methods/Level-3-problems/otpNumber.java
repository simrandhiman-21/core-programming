<<<<<<< HEAD

=======
import java.util.*;

import javax.print.DocFlavor.STRING;
>>>>>>> e6799e1 (week 1 Day 4 Level 3 commit)

public class otpNumber {
    public static void main(String[] args) {
        
<<<<<<< HEAD
        String[] opts=new String[10];

        for(int i=0;i<10;i++){
            opts[i]=generateoptsixdigit();
        }

        if(unique){
            System.out.println("Unique");
        }
        else{
            System.out.println("Not Unique");
=======
        HashSet<String> set=new HashSet<>();
        boolean flag=false;


        for(int i=0;i<10;i++){
            String otp=generateoptsixdigit();
            if(!set.contains(otp)){
                flag=true;
            }
            set.add(otp);
            System.out.println("OTP's : "   +otp);
        }

        if(flag){
            System.out.println("No unique OTP");
        }
        else{
            System.out.println("Unique OTP");
>>>>>>> e6799e1 (week 1 Day 4 Level 3 commit)
        }

    }
    public static String generateoptsixdigit(){
<<<<<<< HEAD
        int otp=(int)(Math.random()*900000)+100000;
        return String.valueOf(otp); 
    }
    
=======
        //random within range 
        //(int)Math.random()*(max-min+1)+min;
        
       int randomnumber=(int)(Math.random()*900000)+100000;
       return String.valueOf(randomnumber);
    }   
>>>>>>> e6799e1 (week 1 Day 4 Level 3 commit)
    
}
