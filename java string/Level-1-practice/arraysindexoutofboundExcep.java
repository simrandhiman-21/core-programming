public class arraysindexoutofboundExcep {
    public static void main(String[] args) {
        int[] arr=new int[5];
         try{
            generateException(arr);
         }
         catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught: "+e);
         }
         handleException(arr);

    }
    public static void generateException(int[] arr) {
    
        try {
            System.out.println("index at "+arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: "+e);
        }   
    }
    public static void handleException(int[] arr){
        try{
            System.out.println("index at "+arr[arr.length]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught: "+e);
        }
        catch(RuntimeException e){
            System.out.println("Exception caught: "+e);
        }
  }
}
