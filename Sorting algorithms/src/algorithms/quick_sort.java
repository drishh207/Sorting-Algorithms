package algorithms;

public class quick_sort
{
    public static void main(String args[])
    {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        int[] arr1= {20, 12, 35, 44, 76, 56};
        quicksort(arr, 0, arr.length);
        
        System.out.print("The sorted array is");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println("");
    }
    
    public static void quicksort(int[] arr, int start, int end)
    {
        if(end - start < 2)
            return;
        
        int pivot = partition(arr, start, end);
        quicksort(arr, start, pivot);
        quicksort(arr, pivot+1, end);
    }
    
    public static int partition(int[] arr, int start, int end) //end is arr.length
    {
        //here, we are checking for elements greater than or less than the pivot in an alternating fashion.
        //so no element gets missing or overridden in the original array
        int pivot = arr[start];
        int i = start;
        int j = end;
        
        while(i < j)
        {
            while(i < j && arr[--j] >= pivot);  //moving to a location right to left where the element is less than pivot
            if(i < j)
                arr[i] = arr[j];
            
            while(i < j && arr[++i] <= pivot); //moving to a location left to right where the element is greater than pivot
            if(i < j)
                arr[j] = arr[i];
        }
        
        arr[j] = pivot;
        return j;       
    }
}
