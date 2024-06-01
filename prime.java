import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter");
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i%j==0){
                    break;
                }
                if(i==j){
                    System.out.println(i);
                }
            }
        }
           
    }
}
