import java.util.*;
class Pro{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,c=0;
        n=sc.nextInt();
        for(int i=0;i<=Math.sqrt(n);i++){
           for(int j=0;j<=Math.sqrt(n);j++)
           {
               if(((i*i)+(j*j))==n){
                   c=1;
               }
           }
        }
        if(c==1){
            System.out.print("True");
        }
        else  System.out.print("False");
       
    }
}