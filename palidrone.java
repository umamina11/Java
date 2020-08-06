
package demo;
import java.util.Scanner;
public class palidrone {
    public static void main(String args[]){
        
     Scanner sc=new Scanner(System.in);
    int n,a,r,s=0;
    
    	System.out.println("Enter any number ");
       

        n=sc.nextInt();
        a=n;
        do
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        while(n>0);
        if(a==s)
        {
            System.out.println("this is a palindrone");
            
        }
        else
        {
            System.out.println("this is not a palindrone");
        }
        }
}
