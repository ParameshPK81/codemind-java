import java.util.*;
class Sub{
     public static int gcd(int a,int b){
       if(b==0){
           return a;
       }
       return gcd(b,a%b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,k,g;
        n=sc.nextInt();
        k=sc.nextInt();
        g=gcd(n,k);
        System.out.printf("%d",g);
    }
}