import java.util.*;
class Disk{
    public  static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int d=2,t,s,b,m=512;
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        System.out.println(d*m*t*s*b);
    }
    
}