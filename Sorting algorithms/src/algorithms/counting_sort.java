package algorithms;

public class counting_sort
{
    public static void main(String args[])
    {
        int[] arr = {7, 6, 3, 9, 7, 2, 8, 6, 10}; 
        countingsort(arr, 2, 10);
        
        System.out.print("The sorted array is");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println("");
    }
    
    //unstable counting sort
    public static void countingsort(int[] arr, int min, int max)
    {
        int[] temp = new int[(max - min) + 1];  //creating new array of length = no. of orignial array elements
        
        for(int i=0; i<arr.length; i++)
        {
            temp[arr[i]-min]++;                 //counting the number of occurences of element in the original array
        }                                       //and storing at appropriate address in the temp array
        
        int index = 0;
        for(int i=min; i<=max; i++)
        {
            int count = temp[i - min];          //retrieving the occurence of i from the temp array
            //System.out.println(count);
            for(int j=0; j<count && count >= 1; j++)
            {
                arr[index] = i;                 //storing the value if i count number of times
                index++;
            }
        }
    }
}
