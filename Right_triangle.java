public class Right_triangle {
    static void pattern(int n){
        for (int i=0;i<=n;i++){
            for(int k=0;k<n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
         
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
