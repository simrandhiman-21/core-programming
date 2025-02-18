

public class otpNumber {
    public static void main(String[] args) {
        
        String[] opts=new String[10];

        for(int i=0;i<10;i++){
            opts[i]=generateoptsixdigit();
        }

        if(unique){
            System.out.println("Unique");
        }
        else{
            System.out.println("Not Unique");
        }

    }
    public static String generateoptsixdigit(){
        int otp=(int)(Math.random()*900000)+100000;
        return String.valueOf(otp); 
    }
    
    
}
