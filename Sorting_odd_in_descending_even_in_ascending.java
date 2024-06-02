
/**
 * Sorting_odd_in_descending_even_in_ascending
 */
public class Sorting_odd_in_descending_even_in_ascending {
     static void check(int a[],int n){
        for(int i=0;i<n;i++){
            if(i%2!=0){
                a[i]=-a[i];
            }
        }
        for(int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                  int temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
           a[i]=Math.abs(a[i]);
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
         }
        
       
     }
     public static void main(String[] args) {
        int arr[]={8,4,5,6,7,3,2};
        int n=arr.length;
        check(arr,n );
     }
    
}