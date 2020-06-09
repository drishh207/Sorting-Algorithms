package algorithms;

public class insertion_sort 
{
    public static void main(String args[])
    {
        int[] arr = {35, 20, -15, 7, 55, 1, -22};
        int[] arr1= {20, 12, 35, 44, 76, 56};
        insertionsort_method1(arr1);
        insertionsort_method2(arr);
    }
    
    public static void insertionsort_method1(int[] arr) //sorted portion increases from left to right
    {
        for(int i=1; i < arr.length; i++)
        {
            int value = arr[i];
            int j;
            for(j=i; j>0; j--)    //for(j=i; j>0 && arr[j-1] > value; j--)
            { 
                if(arr[j-1] >  value)
                    arr[j] = arr[j-1]; 
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
        
        System.out.print("The sorted array by method1 is");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println("");
    }
    
    public static void insertionsort_method2(int[] arr) //sorted portion increases from right to left
    {
        for(int i=arr.length-2; i>=0; i--)
        {
            int value = arr[i];
            int j;
            for(j=i; j<arr.length-1; j++)
            {
                if(arr[j+1] < value)
                    arr[j] = arr[j+1];
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
        
        System.out.print("The sorted array by method2 is");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println("");
    }
}
