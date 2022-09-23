import java.util.*;
class Sub{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,num,r,s=0;
        n=sc.nextInt();
        num=n;
        while(n>0){
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(s==num){
            System.out.printf("True");
        }
        else{
             System.out.printf("False");
        }
        
    }
}