import java.util.*;

class UniqueNumber

{

public static void main(String args[] )

{

Scanner sc=new Scanner(System.in);



int n=sc.nextInt();

String s= Integer.toString(n); // converting the given number into String datatype

// Int datatype is converting to String , String helps to extract the character by charAt() and check each character is matching with the rest.

int l=s.length();

int flag=0,i, j;

//Loops to check the digits are repeated

for(i=0;i<l-1;i++)

{

for(j=i+1;j<l;j++){

if(s.charAt(i)==s.charAt(j)) // if any digits are repeated, then it is not a UniqueNumber

{ flag=1;

break; }

}

}

if(flag ==0)

System.out.println("Unique Number");

else

System.out.println("Not Unique Number");

}

}
