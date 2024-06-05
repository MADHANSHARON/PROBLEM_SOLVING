/**
 * Sum_of_diagonal
 */
public class Sum_of_diagonal {

    static void sum(int a[][],int r,int c){
        int s=0;
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j){
                   s=s+a[i][j];
                }
            }
         }
         System.out.println("Sum of diagonal:"+s);
    }
    public static void main(String[] args) {
       int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
       int r=3;
       int c=3;
       sum(arr, r, c);
    }
}