import java.util.Scanner;
class palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k,c=0,d;
       n= sc.nextInt();
       k=sc.nextInt();
       int[] a=new int[n];
       for(int i:a){
           i=sc.nextInt();
           if(i%k==0){
               c++;
           }
       }
       System.out.println(c);
      
    }
}