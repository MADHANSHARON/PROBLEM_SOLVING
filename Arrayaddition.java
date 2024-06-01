import java.util.*;


 class additionarr {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter size");
        int se=s.nextInt();
        int [] a=new int[se];
        System.out.println("enter array elements");
        
        int r=se-1;
        for (int i=0;i<se;i++){
             a[i]=s.nextInt();
        }
        int b=a[r]+1;
        int []newarr=new int[se];
        for(int j=0;j<se;j++){
            newarr[j]=a[j];
        }
        newarr[se-1]=b;
        System.out.println("After");
        for(int h=0;h<se;h++){
           System.out.println(newarr[h]);
        }
        
    }
}
