
package demo;


public class threedimarray {
    public static void main(String args[])
    {
     
        int[][][] intArray = { { { 1, 2, 3}, { 4, 5, 6 } ,  { 7, 8, 9 } } }; 
        System.out.println ("3 dimensional array is given below :");
       
        for (int i = 0; i < 1; i++) 
            for (int j = 0; j < 3; j++) 
            for (int z = 0; z < 3; z++) 
                System.out.println ("intArray [" + i 
            + "][" + j + "][" + z + "] = " + intArray [i][j][z]); 
    }
} 
    

