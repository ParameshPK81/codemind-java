import java.util.*;
class Way{
    public static int cnw(int n){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        return cnw(n-1)+cnw(n-2)+cnw(n-3);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        System.out.printf("%d",cnw(n));//3
    }
}