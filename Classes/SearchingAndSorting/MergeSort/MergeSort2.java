/*
   Merge Sort Algorithm
   
   1. Lets say we have have an unsorted array [7, 2, 8, 4, 5, 3, 1, 6]
      
      With Merge Sort Algorithm,
      
      we recursively divide the array to two halves: [7, 2, 8, 4] and [5, 3, 1, 6]
      The divide the left half to its two halves: [7, 2] and [8, 4]
      
      Until arrays.length is less than 2, which is if there is only one array left in the array, we return. This is our base case.
      
   2. So when we are at the call stack:
      
      left = [7]
      We return, on the same call stack, we have right [2]
      right returns too.
      
      Now we need to merge
      
   3. On Merge, we pass in our original array, our left array, right array, left array's length and right array's length.
      
      We also keep track of the indices of left array, right array and nums array using i, j, k initialized to 0.
      
      while i is less than left length and j is less than right length
      This is the case, when both left and right array's length are equal
         if left[i] is less than or equal to right[i]
            Then take it from the left[i] and assign it to nums[k]
            increment the k
            increment the i
         Otherwise, right[j] must be bigger than left[i]
            Take it from right[j] and assign it to the nums[k]
            increment the k
            increment the j
      
      Sometimes, leftLength might be bigger, which means, there are remaining elements in left array
      while i is still less than leftLength
         Assign the remaining element from left[i] to nums[k]
         increment the k
         increment the i
         
      Sometimes, rightLength might be bigger, which means, there are remaining elements in right array
       while j is still less than rightLength
         Assign the remaining element from right[j] to nums[k]
         increment the k
         increment the j
         
  4. For our input array: 
                              [7, 2, 8, 4, 5, 3, 1, 6]
               [7, 2, 8, 4]                              [5, 3, 1, 6]
           [7, 2]       [8, 4]                     [5, 3]         [1, 6]
         [7]   [2]    [8]   [4]                 [5]   [3]      [1]       [6]
         
     7, 2 gets merged to 2, 7
     8, 4 get merged to 4, 8
     2, 7, 4, 8 gets merged to 2, 4, 7, 8
     
     5, 3 gets merged to 3, 5
     1, 6 gets merged to 1, 6
     3, 5, 1, 6 gets merged to 1, 3, 5, 6
     
     Then 2, 4, 7, 8, 1, 3, 5, 6 gets merged to 1, 2, 3, 4, 5, 6, 7, 8
     
   -------------------------
   
   Time-Complexity: O(N Log N), At each level of the recursion tree, we merge N elements. We know there are Log(N) levels in our tree
                     Because the number of times of N elements are reduced by a factor of 2, until a single element remains.
                     Therefore, N * Log N levels, we end of getting a linearithmic runtime of N Log N. A general way to talk about how many operations are performed. 
   Space-Complexity: O(N), because we are storing temporariliy N elements on our left and right array.                     
*/

import java.util.Arrays;

class MergeSort2
{
   public static void main(String[] args)
   {
      int[] testArray = {7, 2, 8, 4, 5, 3, 1, 6};
      mergeSort(testArray, 8);   
      System.out.println(Arrays.toString(testArray));
   }
   
   public static void mergeSort(int[] nums, int length)
   {
      if(length < 2)
      {
         return;
      }
      
      int mid = length/2;
      
      int[] left = new int[mid];
      int[] right = new int[length - mid];
      
      for(int i=0; i < mid; i++)
      {
         left[i] = nums[i];
      }
      
      for(int i=mid; i < length; i++)
      {
         right[i - mid] = nums[i];
      }
      
      mergeSort(left, mid);
      mergeSort(right, length - mid);
      
      merge(nums, left, right, mid, length - mid);     
   }
   
   public static void merge(int[] nums, int[] left, int[] right, int leftLength, int rightLength)
   {
      int i=0, j=0, k=0;
      
      while(i < leftLength && j < rightLength)
      {
         if(left[i] <= right[j])
         {
            nums[k] = left[i];
            k++;
            i++;
         }
         else
         {
            nums[k] = right[j];
            k++;
            j++;
         }
      }
      
      while(i < leftLength)
      {
         nums[k] = left[i];
         k++;
         i++;
      }
      
      while(j < rightLength)
      {
         nums[k] = right[j];
         k++;
         j++;
      }
   }
}