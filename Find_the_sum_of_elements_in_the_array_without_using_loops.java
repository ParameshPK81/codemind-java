import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int s=0,t,n;
        t=sc.nextInt();
        for(int i=0;i<t;i++){
            n=sc.nextInt();
            s=s+n;
        }
        System.out.println(s);
    }
}