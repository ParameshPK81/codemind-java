import java.util.*;
class Auto{
    public static int nod(int n) {
        int c=0,r;
        while(n>0){
            n=n/10;
            c++;
        }
        return c;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,dcn;
        n = sc.nextInt();
        dcn=nod(n);
        int nsq;
        nsq=n*n;
        if(nsq%Math.pow(10,dcn)==n){
            System.out.print("Automorphic Number");
        }
        else{
            System.out.print("Not an Automorphic Number");
        }
        
    }
}