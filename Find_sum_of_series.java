import java.util.Scanner;
class cpn{
    public static void main(String args[]){
        int n;
        double c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            c+=(1/(float)i);
        }
        System.out.printf("%.2f",c);
   }
}