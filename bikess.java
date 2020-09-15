
package demo;


 abstract class Bike
 {  
   Bike()
   {
       System.out.println("bike models");
   }  
   abstract void speed();  
   void changeGear()
   {
       System.out.println("gear changed");
   }  
 }  

 class ktm extends Bike
 {  
 void speed()
 {
     System.out.println("FULL SPEED.");
 }  
 }  
  
 class TestAbstraction{  
 public static void main(String args[])
 {  
  Bike obj = new ktm();  
  obj.speed();  
  obj.changeGear();  
 }  
}