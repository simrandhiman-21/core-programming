public class ASCIIValues {
    public static void main(String[] args) {
        String input="simran";
        int[][]result=findvalues(input);
        for(int i=0;i<result.length;i++){
            System.out.println("charcter is "+(char)result[i][0]+" ---> "+"ASCII code is : "+result[i][1]);
        }
    }
    public static int[][] findvalues(String input){
        
        int[][] matrix=new int[input.length()][2];
        for(int i=0;i<input.length();i++){
            matrix[i][0]=input.charAt(i);
            matrix[i][1]=input.charAt(i);
        }
        return matrix;
    }
}

// public class TruncationExample {
//     public static void main(String[] args) {
//         int largeNumber = 70000;  // Exceeds char range
//         char ch = (char) largeNumber; // Explicit cast (int → char)
        
//         System.out.println("Original Integer: " + largeNumber);
//         System.out.println("Character After Casting: " + ch);
//         System.out.println("Stored Integer Value in char: " + (int) ch);
//     }
// }
