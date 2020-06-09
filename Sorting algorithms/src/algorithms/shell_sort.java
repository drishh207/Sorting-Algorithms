
package algorithms;

public class shell_sort
{
    public static void main(String args[])
    {
        int[] arr = {35, 20, -15, 7, 55, 1, -22};
        int[] arr1= {20, 12, 35, 44, 76, 56};
        shellsort(arr);
    }
    
    public static void shellsort(int[] arr)
    {
        for(int gap = arr.length/2; gap > 0; gap/=2)
        //for(int gap=(int)((Math.pow(3,2)-1)/2); gap > 0; gap/=3)
        {
            for(int i=gap; i < arr.length; i++)
            {
                int value = arr[i];
                int j;
                for(j=i; j>=gap; j-=gap)    //for(j=i; j>=gap && arr[j-gap] > value; j--)
                { 
                    if(arr[j-gap] >  value)
                        arr[j] = arr[j-gap]; 
                    else
                        break;
                }
                arr[j] = value;
                for(int k=0; k < arr.length; k++)
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
