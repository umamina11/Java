
package demo;

import java.util.Scanner;
public class loops
       
{
    public static void main(String args[])
    {
        int age;
        Scanner s=new Scanner(System.in);
       System.out.println("entre your age");
       age=(int)s.nextInt();
        if(age<18)
        {
            System.out.println("your are not elegible");
        }
        else
            System.out.println("you are eligible ...prceed with voting process");
        
    }
    
}
