import java.util.*;
class sor{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int v[]=new int[n];
		int i,k;
		for (k=0;k<n;k++)
		    v[k]=sc.nextInt();
	    k=n/2;
        for (i=n-1;i>=k;i--)
            System.out.print(v[i]+" ");
        for (i=0;i<k;i++)
            System.out.print(v[i]+" ");
    }
}