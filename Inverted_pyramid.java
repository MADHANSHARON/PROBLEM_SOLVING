public class Inverted_pyramid {
    static void check(int n){
        for (int i=0;i<n;i++){
            for(int k=0;k<i;k++){
                System.out.print(" ");
            }
            for(int j=i;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
         
        }
    }
    public static void main(String[] args) {
        check(6);
    }
}
