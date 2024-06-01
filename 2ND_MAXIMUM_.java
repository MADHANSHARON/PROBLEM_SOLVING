import java.util.Scanner;

class Sample{
    int size;
    void max(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size");
        size=s.nextInt();
        System.out.println("enter elements");
        int i;
        int[] a=new int[size];
        for(i=0;i<size;i++){
          a[i]=s.nextInt();
        }
       
        for (i=0;i<size;i++){
          for(int j=i+1;j<size;j++)
          {
             if(a[i]>a[j]){
                 int t=a[i];
                 a[i]=a[j];
                 a[j]=t;
                 
             }
          }
          
         
    }
    System.out.println("Second maximum element is"+a[size-2]);
    
}
}
class 2ND_MAXIMUM{
    public static void main(String[] args) {
        Sample ss=new Sample();
        ss.max();


    }
}
