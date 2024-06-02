public class Factors {
    public static void check(int n){
        System.out.println("factors:");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        check(15);
    }
}
