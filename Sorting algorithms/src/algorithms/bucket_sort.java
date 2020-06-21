package algorithms;
import java.util.*;

public class bucket_sort 
{
    public static void main(String args[])
    {
        int arr[] = {78, 65, 61, 23, 11, 10, 46, 40, 98};
        
        bucketsort(arr);
        
        System.out.print("The sorted array is");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println("");
    }
    
    public static void bucketsort(int[] arr)
    {
        List<Integer>[] buckets = new List[10];
        for(int i = 0; i < buckets.length; i++)
        {
            //using arraylist
            //buckets[i] = new ArrayList<Integer>();
            
            //using linkedlist
            buckets[i] = new LinkedList<Integer>();
        }
        
        for(int i = 0; i < arr.length; i++)
        {
            buckets[hash(arr[i])].add(arr[i]);
        }
        
        for(List bucket : buckets)
        {
            Collections.sort(bucket);
        }
        
        int j = 0;
        for(int i = 0 ; i < buckets.length; i++)
        {
            for(int value:buckets[i])
            {
                arr[j++] = value;
            }
        }
    }
    
    public static int hash(int value)
    {
        return value / (int) 10;
    }
}
