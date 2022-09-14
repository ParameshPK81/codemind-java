import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t,x1,x2,y1,y2;
        t=sc.nextInt();
        for(int i=0;i<t;i++){
             x1=sc.nextInt();
             x2=sc.nextInt(); 
             y1=sc.nextInt();
             y2=sc.nextInt();
             double a,b;
             a=y1/(float)x1;
             b=y2/(float)x2;
             if(a<b){
                 System.out.println("-1");
             }
             if(a==b){
                 System.out.println("0");
             }
             if(a>b){
                 System.out.println("1");
             }
            
        }
        
    }
}