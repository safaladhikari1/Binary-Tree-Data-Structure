// This program implements merge sort for arrays of integers.

// The merge sort algorithm is named for the observation that if you have two sorted
// subarrays, you can easily merge them into a single sorted array.

// Merge Sort is actually an O(N log N) algorithm.
// We have to split the array in half repeatedly until we hit the algorithm's base case, in which 
// the subarrays each contain 1 element.

import java.util.*;

public class MergeSort
{
   public static void main(String[] args)
   {
      int[] list = {14, 32, 67, 76, 23, 41, 58, 85};
      System.out.println("before: " + Arrays.toString(list));
      
      mergeSort(list);
      
      System.out.println("after: " + Arrays.toString(list));
   }
   
   // Places the elements of the given array into sorted order
   // using the merge sort algorithm.
   // post: array is in sorted (nondecreasing) order 
   public static void mergeSort(int[] a)
   {
      if(a.length > 1)
      {
         // split array into two halves
         int[] left = Arrays.copyOfRange(a, 0, a.length / 2);
         int[] right = Arrays.copyOfRange(a, a.length / 2, a.length);
         
         // recursively sort the two halves
         mergeSort(left);
         mergeSort(right);
                
         // merge the sorted halves into a sorted whole
         merge(a, left, right);
      }
   }
   
   /*
      Psedudocode for merge method:
      
      if(i2 has passed the end of the right array, or
         left element at i1 <= right element at i2)
      {
         take from left.   
      }
      else
      {
         take from right.
      }
   */
   
   // Merges the given left and right arrays into the given
   // result array.
   // pre: result is empty; left/right are sorted
   // post: result contains result of merging sorted lists;
   public static void merge(int[] result, int[] left, int[] right)
   {
      int i1 = 0; // index into left array
      int i2 = 0; // index into right array
      for(int i=0; i<result.length; i++)
      {
         if(i2 >= right.length || (i1 < left.length && left[i1] <= right[i2]))
         {
            result[i] = left[i1]; // take from left
            i1++;
         }
         else
         {
            result[i] = right[i2]; // take from right
            i2++;
         }
      }
   }
   
     
}