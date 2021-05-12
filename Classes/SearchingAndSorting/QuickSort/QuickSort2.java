/*
   QuickSort
   
   Algorithm:
   
   1. This Algorithm is best explained on: https://www.geeksforgeeks.org/quick-sort/
   
   2. The idea is, if we have an unsorted array:
      
      [10, 80, 30, 90, 40, 50, 70]
      
      We know the initial index, which is 0
      and the last index, which is array.length - 1
      
   3. We check first if the array has at least length of more than 1. (This is also our base case for the recursion later)
      
      if(begin < end)
      
         If it is, we will figure out the partitionIndex using the partition() method, by passing in our array, initial index and last index.
   
   4. On partition method()
   
         We will take our last element as pivot. On our array above, it is 70
         
         We will assign it to pivot variable
         i is the index of smaller element, so at first it will be -1 (initial index, which is 0 - 1)
         
         Now we will start our for loop which starts at initial index, goes up to last index, increments by 1
         for(int j = begin; j < end; j++)
            
            We will check if if(nums[j] < pivot) i.e. check the elements from the beginning if it is less than 70
            If it is, increment i, i will be 0 now
            At first loop, i will be 0, j will be 0, so there won't be any swapping.
            
            We are incrementing i, if nums[j] is less than 70
            But j keeps on incrementing with the for loop.
            
            This for loop is mentioned on detail on Illustration of partition() section of the article: https://www.geeksforgeeks.org/quick-sort/
            
   5.  After we exit the loop, we will have the result array [10, 30, 40, 50, 70, 90, 80]
       
       70 is at its correct place because  all elements less than 70 are on the left
       all elements greater than 70 are on the right
       
   6.  We get our first partition index, which is 4, that's where 70 is
       
       Now we recursively sort elements using the same above approach but around 70 on the left side first
       [10, 30, 40, 50]
       
       After left side gets sorted
       
       We do the right side
       [90, 80]
       
   7. At the end we will get our sorted array: 10, 30, 40, 50, 70, 80, 90
   
   -------
   
   Time-Complexity: Worst Case: O(N^2), Best Case: O(N Log N)
   Space-Complexity: O(Log N), better than MergeSort, which is O(N)
   
   --------
   
   Extra:
   
   ThreeWayQuickSort: https://github.com/eugenp/tutorials/blob/master/algorithms-sorting/src/main/java/com/baeldung/algorithms/quicksort/ThreeWayQuickSort.java
   
   https://www.baeldung.com/java-quicksort
   
*/

import java.util.Arrays;

class QuickSort2
{
   public static void main(String[] args)
   {
      int[] testArray = new int[] {10, 80, 30, 90, 40, 50, 70};
      
      quickSort(testArray, 0, 6);
      
      System.out.println(Arrays.toString(testArray));
   }
   
   public static void quickSort(int[] nums, int begin, int end)
   {
      if(begin < end)
      {
         int partitionIndex = partition(nums, begin, end);
         
         quickSort(nums, begin, partitionIndex - 1);
         quickSort(nums, partitionIndex+1, end);
      }   
   }
   
   private static int partition(int[] nums, int begin, int end)
   {
      int pivot = nums[end];
      int i = (begin - 1);
      
      for(int j = begin; j < end; j++)
      {
         if(nums[j] < pivot)
         {
            i++;
            int swapTemp = nums[i];
            nums[i] = nums[j];
            nums[j] = swapTemp;
         }
      }
      
      int swapTemp = nums[i + 1];
      nums[i + 1] = nums[end];
      nums[end] = swapTemp;
      
      return i+1;      
   }
}