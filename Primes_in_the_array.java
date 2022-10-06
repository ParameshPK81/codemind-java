import java.util.Scanner;
import java.lang.Math;
class pir{
    public static boolean prime(int n){
         for(int j=2;j<=Math.sqrt(n);j++)
            {
                if(n%j==0)
                {
                  return false;
                }
            }
            return true;
    }
    public static void main(String args[]){
      
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int c=0,s=0;
    
        for(int i:a){
            if(prime(i) && i!=1){
           
              c++;
            }
        }
        System.out.printf("%d",c);
    }
}