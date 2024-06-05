/**
 * Transpose
 */
public class Transpose {

    static void trans(int a[][],int r,int c){
        int tran[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                tran[i][j]=a[j][i];
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(tran[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int r=3;
        int c=3;
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        trans(arr, r, c);
    }
}