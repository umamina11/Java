/**WAP to calculate electric bill amount according to the following rules:-
if consumption is <=200 unit charge is 0
if consumption is >200 and <=500 unit then charge is Rs. 2/unit.
if consumption is >500 and <=1000 unit then charge is Rs. 5/unit.
if consumption is >1000 unit then charge is Rs. 7/unit.
Fixed charge is Rs. 400.**/
package demo;

import java.util.*;
public class bill 
{
    public static void main(String args[])
    {
        long units;
        
        
        Scanner sc=new Scanner(System.in);
 
	   System.out.println("enter number of units");
	   
           units=sc.nextLong();
 
        if(units<=200)
        {
             System.out.println(units*0+400);
        }
        else if(units>200&&units<=500)
        {
            System.out.println(((100*0)+(units-200)*2)+400);
        }
        else if( units>500 && units<=1000)
        {
            System.out.println(((100*0)+(100*2)+(units-500)*5)+400);
        }
        else if(units>1000)
        {            
            System.out.println(((100*0)+(100*2)+(100*5)+(units-1000)*7)+400);
        }              
        else
        {
            System.out.println("400");
        }
    }
}

                    
            
            
 