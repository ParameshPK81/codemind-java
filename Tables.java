import java.util.*;
class Pro{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,l;
        n=sc.nextInt();
        l=sc.nextInt();
        for(int i=1;i<=l;i++)
        {
            if(i%2!=0){
                System.out.printf("%d x %d = %d
",n,i,n*i);
            }
        }
        sc.close();
    }
}