import java.util.*;
class Ugly{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int f=0;
        if(n>0){
            while(n>0){
                if (n%2==0){
                    n/=2;
                }
                else if(n%3==0){
                    n/=3;
                }
                else if(n%5==0){
                    n/=5;
                }
                else{
                    f=1;
                    break;
                }
            }
        }
        if(f==1){
            if(n==1){
                System.out.print("Ugly Number");
            }
            else{
                System.out.print("Not Ugly Number");
            }
        }
         else{
                System.out.print("Not Ugly Number");
            }
        
    }
}