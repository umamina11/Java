
package demo;

import java.util.Scanner;

public class factorial 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int num=s.nextInt();
        int factorial=fact(num);
        System.out.println("factorial of the number "+factorial);
    }
   static int fact(int n)
    {
        int result;
        if(n==1)
        {
            return 1;
        }
        result=fact(n-1)*n;
        return result;
    }
    
}
