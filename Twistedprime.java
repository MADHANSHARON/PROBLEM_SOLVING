public class Twistedprime {
    public static void check(int n){
        int reversed=0;
        int temp=n;
        int flag=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
              flag=flag+1;
            }
        }
        if(flag==0){
          while(temp>0){
            int last=temp%10;
            reversed=reversed*10+last;
            temp=temp/10;
          }
        }
        for(int i=2;i<=n/2;i++){
            if(reversed%i==0){
              flag=flag+1;
            }
        }

        if (flag==0) {
            System.out.println("Twisted prime");
        }
        else{
            System.out.println("NOT A TWISTED PRIME");
        }

      
    }
    public static void main(String[] args) {
        check(97);
    }
}
