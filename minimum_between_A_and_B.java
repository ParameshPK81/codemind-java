import java.util.*;
class Mbab{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] a = new int[n];
        
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int l,r,min,j=0,c=0;
        l=sc.nextInt();
        r=sc.nextInt();
        for(int i=0;i<n;i++){
            if(l<=a[i] && a[i]<=r){
                j=i;
                break;
            }
        }
        min=a[j];
         for(int i=0;i<n;i++){
            if(l<=a[i] && a[i]<=r){
                c=1;
               if(a[i]<min){
                   min=a[i];
                  
               }
            }
        }
        if(c==1){
        System.out.print(min);
        }
        else{
            System.out.print(-1);
        }
    }
}