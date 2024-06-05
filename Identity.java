public class Identity {

    static void check(int a[][],int r,int c){
        boolean flag=true;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j && a[i][j]!=1){
                  flag=false;
                  break;
                  
                }
                if(i !=j && a[i][j]!=0){
                    flag=false;
                    break;
                }
            }
        }
        if(flag){
            System.out.println("Identity");
        }
        else{
            System.out.println("Not identity");
        }  
    }
    public static void main(String[] args) {
        int r=3;
        int c=3;
        int arr[][]={{1,0,0},{0,1,0},{0,0,1}};
        check(arr, r, c);
    }
}
