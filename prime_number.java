import java.util.*;
class Sub{
    public static boolean prime(int n){
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(prime(n)){
            System.out.printf("prime");
        }
         else{
            System.out.printf("not a prime");
        }
    }
}