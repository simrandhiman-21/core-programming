import java.util.Scanner;

public class findsubstringoccurences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
             // Get user input
                System.out.println("Enter the main string:");
                String mainString = sc.nextLine();
                
                System.out.println("Enter the substring to find:");
                String subString = sc.nextLine();
                
                sc.close(); // Close scanner
        
                int count = countOccurrences(mainString, subString);
                System.out.println("The substring '" + subString + "' occurs " + count + " times in the main string.");
            }
        
            public static int countOccurrences(String mainString, String subString) {
                if (subString.isEmpty()) return 0; // Avoid infinite loop
        
                int count = 0;
                int index = 0;
        
                while ((index = mainString.indexOf(subString, index)) != -1) {
                    count++;
                    index += subString.length(); // Move past the last found substring
                }
                
                return count;
            }
        }
        


// public class findsubstringoccurences {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
             
//                 String str="java programming langugae javaing is good for programming how you doing";
//                 String substr="ing";
//                   int count=0;

//                   for(String word:str.split("\\s+")){
//                     if(word.contains("ing"))count++;
//                  }
                
                
//                 System.out.println(count);
//             }
// }
        