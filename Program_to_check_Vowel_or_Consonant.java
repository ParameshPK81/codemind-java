import java.util.*;
class Vowel{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char a;
        int c=0;
        a = sc.next().charAt(0);
        if(a=='a'||a=='A'){
           System.out.println("Vowel");
        }
        else if(a=='e'||a=='E'){
           System.out.println("Vowel");
        }
        else if(a=='i'||a=='I'){
            System.out.println("Vowel");
        }
        else if(a=='o'||a=='O'){
             System.out.println("Vowel");
        }
        else if(a=='u'||a=='U'){
             System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
        
    }
}