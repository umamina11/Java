
package demo;


public class typecasting {
    public static void  main(String args[])
    {
        byte a=1,b=7,c;
        c=(byte)(a*b);
        System.out.println("the result is");
         System.out.println(c);
         
         float f=1.23f;
         int i=(int)f;
         System.out.println(i);
    }
    
}
            
 /**   {
        byte b;
        int i=20;
        double d=12.667;
        System.out.println("int into byte");
        b=(byte)i;
        System.out.println(b);
        System.out.println("double to int");
        i=(int)d;
        System.out.println(i);
        System.out.println("double to byte");
        b=(byte)(d);
        System.out.println(b);
    }
}*/