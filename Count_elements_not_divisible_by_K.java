import java.util.*;
class Count{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
        k = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int c=0;
        for(int i:a){
            if(i%k==0){
                c++;
            }
        }
        System.out.print(n-c);
        
        
        
    }
}