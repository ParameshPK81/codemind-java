import java.util.*;
class Main{
    public static boolean sq(int n){
        if(n%Math.sqrt(n)==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int e=0,o=0;
        for(int i:a){
           if(sq(i)){
               e+=i;
           }
        }
        System.out.printf("%d",e);
    }
}