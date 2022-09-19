import java.util.*;
class Pal{
    public static boolean pal(int n){
        int s=0,r,m;
        m=n;
        while(n>0){
            r=n%10;
            s=s*10+r;
            n/=10;
        }
        if(m==s){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n,c=0;
        n=sc.nextInt();
        int[] a=new int[n];
        for(int i:a){
            i=sc.nextInt();
            if(pal(i)){
              c++;  
            }
        }
        System.out.println(c);
    }
}