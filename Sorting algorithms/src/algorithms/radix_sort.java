//Radix sort using stable counting sort for integers
package algorithms;

public class radix_sort 
{
    public static void main(String args[])
    {
        int[] arr = {4725, 4586, 1330, 8792, 1594, 5729};
        int no = arr[0];
        int width = 0;
        while(no != 0)                    //calculating the width of the numbers
        {
            no = no / 10;
            width++;
        }
        
        radixsort(arr, width, 10);
        
        System.out.print("The sorted array is");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println("");
    }
    
    public static void radixsort(int[] arr, int width, int radix)
    {
        //counting_sort s = new counting_sort();
        for(int i=0; i<width; i++)
        {
            //s.countingsort(arr, 1, 10);
            radixsinglesort(arr, i, radix);
        }
    }
    
    public static void radixsinglesort(int[] arr, int pos, int radix)
    {
        int[] countarray = new int[radix];              //array created to store the counts 
        
        for(int i=0; i<arr.length; i++)
        {
            countarray[getDigit(arr[i], pos, radix)]++; //creating the count array as done in counting sort
        }
        
        //stable counting sort
        int[] temp = new int[arr.length];               //creating temp to put the sorted values after each iteration
        for(int j=1; j<radix; j++)
        {
            countarray[j] += countarray[j-1];           //adjusting the countarray to put realtive counts
        }
        
        for(int i=arr.length-1; i>=0; i--)              //traversing from right to left
        {
            int digit = getDigit(arr[i], pos, radix);   //getting the appropriate digit 
            temp[--countarray[digit]] = arr[i];         //setting it in the temp array by decrementing the relative count
        }
        
        System.arraycopy(temp, 0, arr, 0, arr.length);  //copying temp array to the original array
    }
    
    public static int getDigit(int value, int pos, int radix)
    {
        int x = value / (int) Math.pow(10,pos);
        int result = x % radix;
        return result;
    }
}
