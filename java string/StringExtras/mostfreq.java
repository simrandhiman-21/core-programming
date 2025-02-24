public class mostfreq {
    public static void main(String[] args) {
        String str="success";

        int[] freq=new int[256];
        int maxcnt=0;
        char ch='a';
        for(char c:str.toCharArray()){
            freq[c]++;
            if(maxcnt<freq[c]){
                maxcnt=freq[c];
                ch=c;
            }
        }
        System.out.println("The character with the highest frequency is: "+ ch + " -> "  +maxcnt);


        

    }
}
