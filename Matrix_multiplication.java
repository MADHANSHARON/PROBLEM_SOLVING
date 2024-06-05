/**
 * Matrix_multiplication
 */
public class Matrix_multiplication {

    static void multiply(int a[][],int b[][],int r,int c){
        int n[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
              n[i][j]=(a[i][j]*b[i][j]);
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }
    }  
    public static void main(String[] args) {
        int a[][]={{10,20},{10,20}};
        int b[][]={{10,20},{10,20}};
        int r=2;
        int c=2;
        multiply(a, b, r, c);

    }
}