/**
 * prime
 */
public class prime {
    public static void check(int n){
        int flag=0;
        for (int i=2;i<=n/2;i++){
           if(n%i==0){
            flag=flag+1;
           }
        }
        if(flag==0){
            System.out.println(" prime");
        }
        else{
            System.out.println(" not prime");
        }
    }
    public static void main(String[] args) {
        check(20);
    }
}