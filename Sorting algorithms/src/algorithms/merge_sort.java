
package algorithms;


public class merge_sort 
{
    public static void main(String args[])
    {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        int[] arr1= {20, 12, 35, 44, 76, 56};
        mergesort(arr, 0, arr.length);
        
        System.out.print("The sorted array is");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println("");
    } 
    
    public static void mergesort(int[] arr, int start, int end)
    {
        if(end - start < 2)
            return;
        
        int mid = (start + end) / 2;
        mergesort(arr, start, mid);
        mergesort(arr, mid, end);
        merge(arr, start, mid, end);
    }
    
    public static void merge(int[] arr, int start, int mid, int end)
    {
        if(arr[mid-1] <= arr[mid])   //the left and right subarrays are already sorted among themselves.
            return;                  //so if the last element of left subarray is <= the starting element of
                                     //right sub array, then no need of shifting as they are already in correct positions.
        
        int[] temp = new int[end - start];
        int i = start;
        int j = mid;
        int tempindex = 0;   //couter for temp array
        
        while(i < mid && j < end)
        {
            temp[tempindex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }
        
        //if elements are left in right subarray to be copied, they need not be copied in the temp array
        //since they are already in the correct position in the original array.
        //the elements left in the left subarray need to be copied in the original array.
        
        System.arraycopy(arr, i, arr, start + tempindex, mid - i);
        System.arraycopy(temp, 0, arr, start, tempindex);
        
    }
}
