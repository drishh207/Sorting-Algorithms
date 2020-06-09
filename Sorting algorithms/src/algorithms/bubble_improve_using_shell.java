
package algorithms;

public class bubble_improve_using_shell 
{
    public static void main(String args[])
    {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        int[] arr1= {20, 12, 35, 44, 76, 56};
        bubblesort(arr1);
    }
    
    public static void swap(int[] arr, int i, int j)
    {
        if(i == j){
            return;
        }
        
        else
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    
    public static void bubblesort(int[] arr) //sorted array is increasing from left to right
    {
        for(int gap = arr.length/2; gap>0; gap/=2)
        {
            for(int i=gap; i < arr.length-1; i++)
            {
                for(int j=arr.length-1; j>=gap; j--)
                {
                    if(arr[j] < arr[j-gap])
                        swap(arr, j, j-gap);
                }
                for(int k=0; k<arr.length; k++)
                {
                    System.out.print(" "+arr[k]);
                }
                System.out.println("");
            }
        }
        
        System.out.print("The sorted array is");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println("");
    }
    
    
}
