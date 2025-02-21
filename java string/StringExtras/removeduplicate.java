import java.util.HashSet;
import java.util.Scanner;

public class removeduplicate {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sting ");
        String input=sc.nextLine();

        HashSet<Character> set=new HashSet<>();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<input.length();i++){
            set.add(input.charAt(i));
        }

        for(char c:set){
            sb.append(c);
        }

    System.out.println("String with no duplicates "+    sb.toString());

    }

}

