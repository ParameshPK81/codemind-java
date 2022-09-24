import java.util.*;
class Sub{
    public static int prime(int n){
        int c=0;
        for(int i=1;i<(n);i++){
            if(n%i==0){
                c+=i;
            }
        }
        return c;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
         m=sc.nextInt();
        if(prime(n)==m){
            System.out.printf("Amicable");
        }
         else{
            System.out.printf("Not Amicable");
        }
    }
}