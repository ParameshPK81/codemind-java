import java.util.*;
class Pat{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>=3 && n<=100){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }
        else{
            System.out.print("The pattern is not possible");
        }
        
    }
}