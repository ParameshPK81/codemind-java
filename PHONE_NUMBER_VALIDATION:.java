import java.io.*;
import java.util.regex.*;
import java.util.*;
// Main class
class Main {
 
    
    public static boolean isValid(String s)
    {
 
       
        Pattern p = Pattern.compile("^\d{10}$");
 
        
        Matcher m = p.matcher(s);
 
      
        return (m.matches());
    }
 
    
    public static void main(String[] args)
    {
        // scanner class
        
        Scanner sc = new Scanner(System.in);
        
       
        String s ;
        s = sc.next();
     
 
       
        if (isValid(s))
 
            
            System.out.println("Valid");
        else
 
            
            System.out.println("Invalid");
 
        
    }
       
}