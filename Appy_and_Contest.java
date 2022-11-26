import java.util.*;
class Appy{
    public static long hcf(long a,long b){
        if(a==0){
            return b;
        }
        return hcf(b%a,a);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=0;j<t;j++){
            long n = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long k = sc.nextLong();
            long c=0;
            long lcm=(a*b)/hcf(a,b);
            c=(n/a)+(n/b)-2*(n/lcm);
            if(c>=k){
                System.out.print("Win
");
            }
            else{
                System.out.print("Lose
");
            }
            
            
        }
        
    }
}