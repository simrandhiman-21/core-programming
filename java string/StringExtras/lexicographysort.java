import java.util.ArrayList;
import java.util.Arrays;

public class lexicographysort {
    public static void main(String[] args) {

        String[] words = {"dog", "cat", "apple", "banana", "elephant"};    

        Arrays.sort(words);//TimSort (O(n log n)) internally.
        System.out.println(Arrays.toString(words)); 

        //selection sort 
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                if(words[i].compareTo(words[j])>0){
                    String temp=words[i];
                    words[i]=words[j];
                    words[j]=temp;
                }
            }
        }
        System.out.println("Sorted words : "+Arrays.toString(words));
    }
}
