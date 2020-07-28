
package demo;

import java.util.Scanner;

public class bitwiseoperator {
    public static void main(String args[])
    {
          int a,b;
        Scanner scan=new Scanner(System.in);
        
        System.out.println("entre any two number");
       
        
        a=scan.nextInt();
        b=scan.nextInt();
        int r=(a<<2)*3;
        System.out.println("the result is");
        System.out.println(r);
    }
    
}
