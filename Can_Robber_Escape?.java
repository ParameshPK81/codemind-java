import java.util.*;
class Rob{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int t,r,o=0;
        t=sc.nextInt();
        for(int i=0;i<t;i++){
            r=sc.nextInt();
            if(r%2!=0){
                o+=1;
            }
        }
        if(o<=2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}