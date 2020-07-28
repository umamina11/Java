
package demo;

import java.util.Scanner;
public class area {
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        double h,b;
        System.out.println("enter the height");
          h= s.nextDouble();
          System.out.println("enter the base");
          b= s.nextDouble();
          
          
           double area=(b*h)/2;
      System.out.println("Area of Triangle is: " + area); 
    }
    
}
