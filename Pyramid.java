public class Pyramid {
   
    static void check(int n){
        for (int i=0;i<n;i++){
            for(int k=0;k<n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
         
        }
    }
    public static void main(String[] args) {
        check(6);
    }
}
