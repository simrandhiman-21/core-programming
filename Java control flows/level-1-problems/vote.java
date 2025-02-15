import java.util.*;

public class vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        if(age>=18){
            System.out.printf("The person's age is %d and can vote.",age);
        }
        else{
            System.out.printf("The person's age is %d and cannot vote.",age);
        }
    }
}
