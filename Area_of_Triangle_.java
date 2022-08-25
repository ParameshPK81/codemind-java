import java.util.*;
class j{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        double s;
        double p;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        
        s=(a+b+c)/2.0;
        p=(double)(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
        System.out.printf("%.2f",(float)p);
    }
}