
package demo;


public class oddarray {
    public static void main(String args[])
    {
        int arr[]={3,4,5,6,7,1,2,0};
        System.out.println("odd numbers in array");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.println(arr[i]);
            }
        }
    }
    
}
