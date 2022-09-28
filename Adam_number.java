import java.util.*;
class Main{
    public static int rev(int n){
        int s=0,r;
        while(n>0){
            r=n%10;
            s=s*10+r;
            n/=10;
        }
        return s;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,sq,rn,sqrn;
        n=sc.nextInt();
        
        sq=n*n;
        rn=rev(n);
    
        sqrn=rn*rn;
        if(sq==rev(sqrn)){
            System.out.printf("True");
        }
        else
        System.out.printf("False");
        
        
    }    
}