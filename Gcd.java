public class Gcd {
    public static void check(int no1,int no2){
        int min;
        min=no1<no2 ? no1:no2;
      while(min>=2){
           
          if((no1%min==0)&&(no2%min==0)){
            System.out.println(min);
            break;
          }
          min--;
        }
    }
    public static void main(String[] args) {
        check(20,10);
    }
}
