class Palindrome{
    public static void palin(int n){
        int reverse=0;
        int temp=n;
        while(temp>0){
            int lastdigit=temp%10;
            reverse=reverse*10+lastdigit;
            temp=temp/10;

        }
        if(reverse==n){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
    public static void main(String[] args) {
        palin(121);
    }
}