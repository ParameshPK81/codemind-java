import java.util.*;
class Pro{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,a=0,b=1,c;
        n=sc.nextInt();
        while(n>0){
            c=a+b;
            System.out.printf("%d ",a);
            a=b;
            b=c;
            n--;
        }
        
    }
}