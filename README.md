# Sorting-Algorithms
Bubble, Selection, Insertion, Shell, Merge, Quick and Radix Sort and their possible implementations.

To view the java files, follow the path: Soting-algorithms / src / algorthims

1. Bubble Sort: <br />
   One of the most easy and basic sorting alogrithms. Every element is compared with its adjacent element and swapped accordingly.
   It is an in-place algorithm. 
   Time complexity: O(n^2) Worst case occurs when array is reverse sorted.
 
2. Selection Sort:<br />
   The array divides into sorted and unsorted portions. In every iteration, the smallest element is found from the unsorted portion.
   It is then swapped with the first index of unsorted portion.
   It is an in-place algorithm.
   Time Complexity: O(n^2) quadratic complexity, but involves less swapping than bubble sort.
   
3. Insertion Sort:<br />
   The array divides into sorted and unsorted portions. The first element of the unsorted potions is chosen and then inserted at the correct       
   position in the sorted portion.
   It is an in-place algorithm. 
   Time Complexity: O(n^2) quadratic complexity, and involves a lot of shifting of elements.
   
4. Shell Sort: <br />
   -It is a variation of insertion sort with an aim to reduce the shifting of elements.
   The value to be choosen from thw unsorted portion is choosen with the largest gap and as the algorithm progresses, the gap reduces and
   finally becomes 1. The algo does some preliminary work(using gap values greater than 1) and then becomes insertion sort. By the time, it
   becomes insertion sort, the array is moslty sorted, so no shifting is needed.<br />
   -One of the most efficient gap sequence is the knuth sequence. But for simplicity, gap = array.length / 2 is considered.<br />
   -It is an in-place algorithm.<br />
   -Time complexity depends on the gap values chosen. But worst case is O(n^2).<br />
   -Better performance than insertion sort.<br />
   
 
   
   
