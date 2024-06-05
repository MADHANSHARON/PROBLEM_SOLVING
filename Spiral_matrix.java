public class Spiral_matrix {
    static void spiral(int spi[][],int r,int c){
        int value=1;
        int mincolumn=0;int maxcolumn=c-1;int minrow=0;int maxrow=r-1;
        while(value<=(c*r)){
            for(int column=mincolumn;column<=maxcolumn;column++){
                spi[minrow][column]=value;
                value++;
            }
            for(int row=minrow+1;row<=maxrow;row++){
                spi[row][maxcolumn]=value;
                value++;
            }
            for(int column=maxcolumn-1;column>=mincolumn;column--){
                spi[maxrow][column]=value;
                value++;
            }
            for(int row=maxrow-1;row>=minrow+1;row--){
                spi[row][mincolumn]=value;
                value++;
            }
            mincolumn++;
            maxcolumn--;
            minrow++;
            maxrow--;

        }
        for(int row=0;row<r;row++){
            for(int col=0;col<c;col++){
                System.out.print(spi[row][col]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int r=3;
        int c=3;
        int ar[][]=new int[r][c];
        spiral(ar, r, c);
    }
}
