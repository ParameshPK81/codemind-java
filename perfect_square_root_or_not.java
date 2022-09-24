import java.util.*;
class Sub{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,k=0;
        n=sc.nextInt();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(i*i==n){
                k=1;
            }
        }
        if(k==1){
            System.out.printf("True");
        }
        else
        {
             System.out.printf("False");
        }
    }
}