import java.util.*;
class Pro{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,a=0,b=1,c,f=0,num;
       
        n=sc.nextInt();
         num=n;
        while(n>0){
            c=a+b;
            if(num==a){
                f=1;
            }
            
            a=b;
            b=c;
            n--;
        }
        if(f==1){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}