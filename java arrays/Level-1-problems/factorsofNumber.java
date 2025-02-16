import java.util.Scanner;

public class factorsofNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enteer a number ");
        int num=sc.nextInt();
        
        int maxFactor=10;
        int[] array=new int[maxFactor];
        
        int index=0;

        for(int i=1;i<=num;i++){
            if(num%i==0){
                if(index==maxFactor){
                    maxFactor*=2;
                    int[] temp=new int[maxFactor];
                    System.arraycopy(array, 0, temp, 0, array.length);
                    array=temp;
                }
                array[index]=i;
                index++;
            }
        }

        System.out.println("\"Factors of \" + num + \" are:\"");

        for(int i=0;i<index;i++){
            System.out.println(array[i]+" ");
        }

    }
    
}
