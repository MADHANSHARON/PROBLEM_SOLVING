

public class Arrayrotation {
    public static void rotate(int a[],int m,int n){
        int [] temp=new int[a.length];
        int k=0;
        for(int i=m;i<n;i++){
            temp[k]=a[i];
            k++;
        }
        for(int i=0;i<m;i++){
            temp[k]=a[i];
            k++;
        }
        for(int i=0;i<n;i++){
            a[i]=temp[i];
        }
        for(int i=0;i<n;i++){
          System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,70,80};
        int n=arr.length;
        
        rotate(arr, 5,n);
    }
}
