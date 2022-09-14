import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x,y,s=0;
        x=sc.nextInt();
        y=sc.nextInt();
        s=(x+2*y);
        if(x==0 && y%2==0){
            System.out.println("YES");
        }
        else if(x==0 && y%2!=0){
             System.out.println("NO");
        }
        else if(s%2==0){
             System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}