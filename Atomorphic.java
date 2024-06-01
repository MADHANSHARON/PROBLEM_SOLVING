public class Atomorphic {
    public static void check(int n){
        int ans=0;
        int k=10;
       while(ans<n){
        ans=(n*n)%k;
        k=k*10;

       }
       if(n==ans){
        System.out.println("Atomorphic");
       }
       else{
        System.out.println("Not Atomorphic");
       }
    }
    public static void main(String[] args) {
        check(32);
    }
}
