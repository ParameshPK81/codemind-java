import java.util.*;
class Main{
   
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int r,c,sum=0;
        r= sc.nextInt();
        c= sc.nextInt();
        int a[][] = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
                sum+=a[i][j];
            }
        }
        System.out.print(sum);
        
        
    }
}