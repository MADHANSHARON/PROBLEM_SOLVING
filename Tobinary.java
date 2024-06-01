/**
 * Tobinary
 */
public class Tobinary {

    public static void run(int n){
        int ans=0;
        int multiply=1;
      while(n!=0){
         ans=ans+(n%2)*multiply;
        multiply=multiply*10;
        n=n/2;
      }
      System.out.println("binary:"+ans);
    }
    public static void main(String[] args) {
        run(7);
    }
}