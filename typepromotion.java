
package demo;


public class typepromotion {
    public static void main(String args [])
 /**   {
            
     int i = 18;  
          
       
        long l = i;  
          
     
        float f = l;  
        System.out.println("Int value "+i); 
        System.out.println("Long value "+l); 
        System.out.println("Float value "+f); 
    }
    
}*/
    {
        double d=4.123;
        byte b=2;
        short s=2;
        float f=9.4f;
        
        int i=(int)(2*d+b-s*f);
        System.out.println("the output is");
        System.out.println(i);
    }
        
}