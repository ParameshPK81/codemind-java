import java.util.*;
class Eve{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int count=0;
        for(int i:a){
           // int k =String.valueOf(i).length();//
            //String s=i+"";
            int k=(int)Math.log10(i)+1;
            if(k%2==0)
             count++;
        }
        System.out.println(count);
    }
}