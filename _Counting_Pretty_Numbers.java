import java.util.Scanner;
class cpn{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            int v,k,c=0;
            v=sc.nextInt();
            k=sc.nextInt();
            for(int j=v;j<=k;j++){
                int r=j%10;
                if(r==2 || r==3 || r==9){
                    c++;
                }
            }
            System.out.println(c);
        }
        sc.close();
    }
}