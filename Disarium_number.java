import java.util.*;
class Main{
    public static int rev(int n){
        int s=0,r;
        while(n>0){
            r=n%10;
            s++;
            n/=10;
        
        }
        return s;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,c,r,s=0,q;
        n=sc.nextInt();
        q=n;
        c=rev(n);
        
        while(c>0){
            r=n%10;
            s+=Math.pow(r,c);
            n/=10;
            c-=1;
        }
        if(s==q){
        System.out.print("True");
        }
        else{
        System.out.print("False");
        }
        
        
       
        
    }    
}