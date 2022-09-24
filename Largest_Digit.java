import java.util.*;
class Sub{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,k=1,r;
        n=sc.nextInt();
        while(n>0){
            r=n%10;
            if(k<r){
                k=r;
            }
            n/=10;
        }
         System.out.print(k);
    }
}