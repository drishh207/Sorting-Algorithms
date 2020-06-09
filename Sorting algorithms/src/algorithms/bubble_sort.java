package algorithms;

public class bubble_sort
{
    public static void main(String args[]) //try to run individually to see each iteration for each algorithm
    {
        int[] arr = {35, 20, -15, 7, 55, 1, -22};
        int[] arr1= {20, 12, 35, 44, 76, 56};
        bubblesort_method1(arr1);
        bubblesort_method2(arr);
        bubblesort_method3(arr);
        bubblesort_recursive(arr, 0);
        
        System.out.print("The sorted array is");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println("");
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
    
    public static void bubblesort_method1(int[] arr)   //sorted partition increases from right to left-implementation1
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                    swap(arr, j, j+1);
            }
            for(int k=0; k<arr.length; k++)
            {
                System.out.print(" "+arr[k]);
            }
            System.out.println("");
        }
        
//        System.out.print("The sorted array by method1 is");
//        for(int i=0; i<arr.length; i++)
//        {
//            System.out.print(" "+arr[i]);
//        }
//        System.out.println("");
    }
    
    public static void bubblesort_method2(int[] arr)  //sorted partition increases from right to left-implementation2
    {
        for(int i=arr.length-1; i>0; i--)
        {
            for(int j=0; j<i; j++)
            {
                if(arr[j] > arr[j+1])
                    swap(arr, j, j+1);
            }
            for(int k=0; k<arr.length; k++)
            {
                System.out.print(" "+arr[k]);
            }
            System.out.println("");
        }
        
//        System.out.print("The sorted array by method2 is");
//        for(int i=0; i<arr.length; i++)
//        {
//            System.out.print(" "+arr[i]);
//        }
//        System.out.println("");
        
    }
    
    public static void bubblesort_method3(int[] arr) //sorted partition increases from left to right
    {
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=arr.length-1; j>i; j--)
            {
                if(arr[j] < arr[j-1])
                    swap(arr, j, j-1);
            }
            for(int k=0; k<arr.length; k++)
            {
                System.out.print(" "+arr[k]);
            }
            System.out.println("");
        }
        
//        System.out.print("The sorted array by method3 is");
//        for(int i=0; i<arr.length; i++)
//        {
//            System.out.print(" "+arr[i]);
//        }
//        System.out.println("");
        
    }
    
    public static void bubblesort_recursive(int[] arr, int index)
    {
        if(index == arr.length)
            return;
        
        for(int j=0; j<arr.length-index-1; j++)
        {
            if(arr[j] > arr[j+1])
                swap(arr, j, j+1);
        }
        
        index++;
        bubblesort_recursive(arr, index);
        
    }
}

