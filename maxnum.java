
package demo;

import java.util.Scanner;
public class maxnum {

     // static int arr[] ; 
      
    int arr[];
     static int largest() 
     { 
         int i; 
        int arr[];  
    
         int max = arr[0]; 
        
      
         for (i = 1; i < arr.length; i++) 
             if (arr[i] > max) 
                 max = arr[i]; 
        
         return max; 
     } 
       
  
     public static void main(String[] args)
     
     {
          int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
         int arr[] = new int[n];
        System.out.println("Enter all the elements:");
         
         for(int i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
        }
             System.out.println("Largest number is: " + largest()); 

        }
 } 
    

