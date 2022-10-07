import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a[]=new int[3];
        int b[] = new int[3];
    
        int c=0,d=0;
        for(int i=0;i<3;i++){
            a[i]=sc.nextInt();
     
            
        }
         for(int i=0;i<3;i++){
           
            b[i]=sc.nextInt();
            
        }
         for(int i=0;i<3;i++){
           
            if(a[i]>b[i]){
                c+=1;
            }
            if(a[i]<b[i]){
                d+=1;
            }
        }
        System.out.printf("%d %d",c,d);
    }
}