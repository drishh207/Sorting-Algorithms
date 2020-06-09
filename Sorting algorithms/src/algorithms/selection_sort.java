
package algorithms;

public class selection_sort
{
    public static void main(String args[])
    {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        selectionsort_method1(arr);
        selectionsort_method2(arr);
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
    
    public static void selectionsort_method1(int[] arr) //partition of sorted elements increasing from left to right
    {
        for(int i=0; i < arr.length; i++)
        {
            int smallest = i;
            for(int j=i; j < arr.length; j++)
            {
                if(arr[smallest] > arr[j])
                    smallest = j;
            }
            swap(arr, i, smallest); 
            for(int k=0; k<arr.length; k++)
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
    
    
    public static void selectionsort_method2(int[] arr) //partition of sorted elements increasing from right to left
    {
        for(int i=arr.length-1; i>0; i--)
        {
           int largest=i;
           for(int j=0; j<i; j++)
           {
               if(arr[j] > arr[largest])
                   largest=j;
           }
           swap(arr, i, largest);
           for(int k=0; k<arr.length; k++)
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
