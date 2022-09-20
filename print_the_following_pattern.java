import java.util.*;
class Pat{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int j=0;j<n;j++){
            for(int i=n;i>=1;i--){
                System.out.printf("%d ",i);
            }
            System.out.printf("
");
        }
    }
}