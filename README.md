# Sorting-Algorithms
Bubble, Selection, Insertion, Shell, Merge, Quick and Radix Sort and their possible implementations.

To view the java files, follow the path: Soting-algorithms / src / algorthims

1. Bubble Sort: <br />
   One of the most easy and basic sorting alogrithms. Every element is compared with its adjacent element and swapped accordingly.
   It is an in-place algorithm. <br />
   Time complexity: O(n^2) Worst case occurs when array is reverse sorted.<br />
 
2. Selection Sort:<br />
   The array divides into sorted and unsorted portions. In every iteration, the smallest element is found from the unsorted portion.
   It is then swapped with the first index of unsorted portion.<br />
   It is an in-place algorithm.<br />
   Time Complexity: O(n^2) quadratic complexity, but involves less swapping than bubble sort.<br />
   
3. Insertion Sort:<br />
   The array divides into sorted and unsorted portions. The first element of the unsorted potions is chosen and then inserted at the correct       
   position in the sorted portion.<br />
   It is an in-place algorithm. <br />
   Time Complexity: O(n^2) quadratic complexity, and involves a lot of shifting of elements.<br />
   
4. Shell Sort: <br />
  -It is a variation of insertion sort with an aim to reduce the shifting of elements.
   The value to be choosen from the unsorted portion is choosen with the largest gap and as the algorithm progresses, the gap reduces and
   finally becomes 1. The algo does some preliminary work(using gap values greater than 1) and then becomes insertion sort. By the time, it
   becomes insertion sort, the array is mostly sorted, so no shifting is needed.<br />
  -One of the most efficient gap sequence is the knuth sequence. But for simplicity, gap = array.length / 2 is considered.<br />
  -It is an in-place algorithm.<br />
  -Time complexity depends on the gap values chosen. But worst case is O(n^2).<br />
  -Better performance than insertion sort.<br />
  
  
5. Merge Sort: <br />
  -It is a divide and conquer algorithm.<br />
  -It has 2 phases: <br />
   &nbsp;&nbsp;&nbsp;&nbsp;1. Splitting: Dividing the array till we get 1 element array.<br />
   &nbsp;&nbsp;&nbsp;&nbsp;2. Merging: Merging these elements in the same order as they were divided in a soted manner.<br />
  -Time Complexity: O(nlogn) It takes log(n+1) steps to divide the array and linear time O(n) to merge the 2 halves.<br />
  -It is not an in-place algorithm.<br />
  
  
6. Quick Sort: <br />
  -It is also based on divide and conquer rule but with 1 difference that the partitioning is done according to the pivot element chosen.The elements left to the pivot are less than it and to the right are greater then it. Therefore, the pivot comes to its correct position.<br />
  -It is an in-place algorithm. <br />
  -Time Complexity: Best and average case: O(nlogn)<br />
   &emsp;&emsp;&emsp;&emsp;&emsp;Worst case: O(n^2) Occurs mostly when a lot of duplicate elements are there in the array. <br />
               
               
7. Counting Sort: <br />
  -In this sort, assumptions are made about the data. It works with non-negative discrete values within a specific range. So, floating point numbers and Strings cannot be sorted.<br />
  -It doesnot use comparisons but counts the number of occurences of each value, stores them in a temporary array at correct indices of the numbers and then accordingly puts elements in the original array.<br />
  -It is not an in-place algorithm.<br />
  -Time Complexity: O(n) linear time complexity.<br />


8. Radix Sort:<br />
  -Like counting sort, radix sort also makes assumptions about the data. The data must have same radix and width.<br />
  -Radix: It is the number of unique digits or values in case of characters that a numbering system or an alphabet has.<br />
  -Width: It is the number of digits or letters. <br />
  -For e.g. radix of decimal numbers is 10.<br />
   &emsp;&emsp;&emsp;&emsp;width of 12345 is 5.<br />
  -Radix sort can be used to sort decimal and strings, not floating point numbers.<br /> 
  -A stable sort is required at every stage. So counting sort is used.<br />
  -The sorting is done first for digits at units place, then for ten's place and so on...<br />
  -It is not an in-place algorithm since counting sort is used.<br />
  -Time Complexity: O(n) because we are making assumptions about the data but runs slower than O(nlogn) algos due to overhead.<br />
   
