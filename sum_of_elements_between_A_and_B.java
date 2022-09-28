import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,sum=0;
        n = sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int l,r;
        l = sc.nextInt();
        r = sc.nextInt();
        for(int i:a){
            if(l<=i && i<=r){
                sum+=i;
            }
        }
         System.out.println(sum);
    }
}