import java.util.Scanner;

public class postnegNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int[] nums=new int[5];

        System.out.println("Enter the 5 numbers ");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }


        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                System.out.println(nums[i] + "  is Negative number ");
            }
            else if(nums[i]>0){
                System.out.println(nums[i] + "  is Positive number ");
                    if(nums[i]%2==0){
                        System.out.println(nums[i] + "  is Even number ");
                    }
                    else{
                        System.out.println(nums[i] + "  is Odd number ");
                    }
            }
            else{
                System.out.println(nums[i] + "  is Zero ");
            }
        }
        int n=nums.length;
            int first=nums[0];
            int last=nums[n-1];

            if (first == last) {
                System.out.println("First and last elements are equal.");
            } else if (first > last) {
                System.out.println("First element " + first + " is greater than last element " + last + ".");
            } else {
                System.out.println("Last element " + last + " is greater than first element " + first + ".");
            }
    }
    
}
