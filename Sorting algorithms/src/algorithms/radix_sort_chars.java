//Radix sort implementation for array of strings
package algorithms;

public class radix_sort_chars 
{
    public static void main(String args[])
    {
        String[] arr = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};
        radixsort(arr, 5, 26);
        
        System.out.print("The sorted array is");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println("");
    }
    
    public static void radixsort(String[] arr, int width, int radix)
    {
        for(int i=width-1; i>=0; i--)
        {
            radixsinglesort(arr, i, radix);
        }
    }
    
    public static void radixsinglesort(String[] arr, int pos, int radix)
    {
        int[] countarray = new int[radix];              //array created to store the counts 
        
        for(int i=0; i<arr.length; i++)
        {
            int index = arr[i].charAt(pos) - 'a';       //creating the count array as done in counting sort
            System.out.println(""+index);
            countarray[index]++;                        
        }
        
        //stable counting sort
        String[] temp = new String[arr.length];         //creating temp to put the sorted values after each iteration
        for(int j=1; j<radix; j++)
        {
            countarray[j] += countarray[j-1];           //adjusting the countarray to put realtive counts
        }
        
        for(int i=arr.length-1; i>=0; i--)              //traversing from right to left
        {
            int character = arr[i].charAt(pos) - 'a';   //getting the appropriate character 
            temp[--countarray[character]] = arr[i];     //setting it in the temp array by decrementing the relative count
        }
        
        System.arraycopy(temp, 0, arr, 0, arr.length);  //copying temp array to the original array
    }
    
}
