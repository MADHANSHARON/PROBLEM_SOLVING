import java.util.Scanner;

public class Second_MAXIMUM_ {
    public static void max(int arr[]){
        int max=arr[0];
        int secondmax=arr[0];
       for (int i=0;i<arr.length;i++){
         if(max<arr[i]){
            secondmax=max;
            max=arr[i];
         }
       }
       System.out.println("second largest element is:"+secondmax);
 
        
    }
    public static void main(String[] args) {
        int arr[]={10,30,5,60,70};
        max(arr);

    }
}