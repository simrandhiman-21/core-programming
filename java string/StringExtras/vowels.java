public class vowels {
    public static void main(String[] args) {
        String str = "Hello World"; 

        int vowelscnt=0;
        int cnostcnt=0;
        int specail=0;
        for(char c:str.toCharArray()){
            if(isVowel(c)) {
                vowelscnt++;
                System.out.println("Vowels: "+c);
            }
            else if(isCOnsonent(c)) {cnostcnt++;
            System.out.println("consetonet: "+c);
            }
            else {specail++;
            System.out.println("Special is "+specail);
        }
        }
        
    }
    public static boolean isVowel(char c){
        return "aeiou".indexOf(c)!=-1;  
    }
    public static boolean isCOnsonent(char c){
        return "bcdfghjklmnpqrstvwxyz".indexOf(c)!=-1;
    }
}
