
package demo;

public class areaoverload {
    void area(float x)
    {
        System.out.println("the area of a square" +Math.pow(x,2)+"sq units");
    }
    void area(float x, float y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is "+z+" sq units");
    }
}
class overload 
{
     public static void main(String args[]) 
	{
	   areaoverload ob = new areaoverload();
	   ob.area(9);
	   ob.area(7,11);
	   ob.area(5.67);
        }
    
}
