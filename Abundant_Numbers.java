import java.util.*;
class Sub{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,s=0;
        n=sc.nextInt();
        for(int i=1;i<n;i++){
            if(n%i==0){
                s+=i;
            }
        }
        if(s>n){
             System.out.printf("True");
        }
        else
        System.out.printf("False");
    }
}