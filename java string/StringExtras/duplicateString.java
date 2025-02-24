public class duplicateString {
    public static void main(String[] args) {
            String str = "javaprogramming"; //WITHOUT SPCAES AND UPPERCASE 
            System.out.println("Original String: " + str);

            int[] freq=new int[26];

            StringBuilder sb=new StringBuilder();
            for(int i=0;i<str.length();i++)
            {
                char ch = str.charAt(i);
                // Only process lowercase letters
                if (ch >= 'a' && ch <= 'z') {
                    if (freq[ch - 'a'] == 0) {  // Check if the letter is seen for the first time
                        freq[ch - 'a']++;
                        sb.append(ch);
                    }
                }
            }                          
            System.out.println("unique string is : "+sb.toString());
    }
}

/*
* 
public class duplicateString {
    public static void main(String[] args) {
        String str = "java ProgramminG"; //WITH SPCAES AND UPPERCASE 
        System.out.println("Original String: " + str);
        
        int[] freq=new int[256];
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
                char ch = str.charAt(i);
                if(freq[ch]==0){
                    freq[ch]++;
                    sb.append(ch);
                }
            }
            
            System.out.println("unique string is : "+sb.toString());
        }
    }

*/

// int[] freq = new int[52];  // 26 for 'a-z' + 26 for 'A-Z' 2Checks 
    