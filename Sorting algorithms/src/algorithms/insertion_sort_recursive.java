//recursive insertion sort
package algorithms;


public class insertion_sort_recursive 
{
    public static void main(String args[])
    {
        int[] arr = {35, 20, -15, 7, 55, 1, -22};
        int[] arr1= {20, 12, 35, 44, 76, 56};
        insertionsort(arr,1);
        
        System.out.print("The sorted array is");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println("");
    }
    
    public static void insertionsort(int[] arr, int pos)
    {
        if(pos == arr.length)
            return;
        
        int value = arr[pos];
        int j;
        for(j=pos; j>0; j--)    //for(j=i; j>0 && arr[j-1] > value; j--)
        { 
            if(arr[j-1] >  value)
                arr[j] = arr[j-1]; 
            else
               break;
        }
        arr[j] = value;
        pos++;
        
        insertionsort(arr,pos);
    }
}
