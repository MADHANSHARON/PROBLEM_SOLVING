public class Twistedprime {
    public static void check(int n){
        int reversed=0;
        int temp=n;
      while(temp>0){
        int last=temp%10;
        reversed=reversed*10+last;
        temp=temp/10;
      }

        System.out.println(reversed);
    }
    public static void main(String[] args) {
        check(121);
    }
}
