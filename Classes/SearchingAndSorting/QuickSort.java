/*
   Quick Sort
   
   Source: https://youtu.be/QN9hnmAgmOc
   
   https://leetcode.com/problems/sort-colors/discuss/148221/Java-2-pass-counting-sort-and-1-pass-quick-partition-(with-video-tutorial-links)
   
   
   1. We have an array, nums = [10, 15, 1, 2, 9, 16, 11]
   
      Pivot(key) = 10
      
      Partition 1 (values < Pivot),   Pivot,   Partition 2(values > Pivot)
      
      Equal values can go either left or right.
      
      This means, anything less than 10 will go left, anything right of 10 go right
      
      Divide and Conquer method:
      
      It will look like:
      
      [2, 1, 9, 10, 15, 11, 16]
      
      
   2. On the above we have two sub arrays: 
   
      Using partition logic we have:
   
      2, 1, 9 on the left
      15, 11, 16 on the right
      
      The above numbers could be re arranged differently based on the partition logic.
      But, anything less than 10 will be on the left. Anything right of 10 will be on the right.
      
  -------
  
  1. We have an array: 
     
     [7, 6, 10, 5, 9, 2, 1, 15, 7]
      0, 1,  2, 3, 4, 5, 6, 7, 8
      
      We set up two pointers:
      
      start is pointing at 7
      end is pointing at 8
      
      If we have pivot = 7 (starting element)
      
      we will say, increment start if it find any elements which are less than or equal to pivot element.
                   (until we find the element that is greater than or equal to pivot element)
      
      For start, on the above
      7 is equal to pivot element, start increments
      6 is less than pivot element, start increments
      start stops at 10
      
      For end, decrement until you find the element that is less than pivot element.
      
      7 is equal to pivot element, not less than pivot element. So it stops at 7 on the right.
      
      Now swap, elements of start and end.
      
   2. After first swap, the array will look like:
      
      [7, 6, 7, 5, 9, 2, 1, 15, 10]
      
      At this time,
      
      start is pointing at 7 on the left
      end is pointing at 10 on the right
      
      On the left:
      
      7 is equal to pivot, increment
      5 is less than pivot, increment
      start stops at 9, because 9 is more than 7.
      
      On the right:
      
      10 is more than pivot, decrement,
      15 is more than pivot, decrement,
      1 is less than pivot, stop at 1.
      
      Swap start and end.
      
   3. After second swap, it will look like:
   
      [7, 6, 7, 5, 1, 2, 9, 15, 10]
      
      At this point,
      
      start is pointing at 1
      end is pointing at 9
      
      Use the same fundamentals of above
      
      end will point at 2
      start will point at 9
      
      But, start has crossed end at this time.
      
  4.  Here, we will swap the pivot element with the end element
  
      So it will look like:
      
      [2, 6, 7, 5, 1, 7, 9, 15, 10]
       0, 1, 2, 3, 4, 5, 6, 7,  8
      
      On the above we find that,
      
      anything that is less than or equal to 7(index 5) is on the left
      anything that is more than 7(index 5) is on the right of 7.
      
  5.  We will repeat the steps from 1, this time:
      
      pivot = 2 (starting element)
      
      start is pointing at 2, it will increment until it finds element that is greater than or equal to 2.
      end is pointing at 10, it will decrement until it finds element that is less than 2. 
      
      Then swap.
      
  -------
  
  Time-Complexity: O(N^2) on the worst case
                   O(NlogN) on the best case      
      
*/

import java.util.Arrays;

class QuickSort
{
   public static void main(String[] args)
   {
      int[] testArray1 = {2, 1, 5, 9, 7};
      
      quickSort(testArray1, 0, 4);
   }
   
   
   public static void quickSort(int[] nums, int lowerBound, int upperBound)
   {
      if(lowerBound < upperBound)
      {
         int location = partition(nums, lowerBound, upperBound);
         
         quickSort(nums, lowerBound, location - 1);
         quickSort(nums, location + 1, upperBound);
      }
     
   }
   
   
   public static int partition(int[] nums, int lowerBound, int upperBound)
   {
      int pivot = nums[lowerBound];
      int start = lowerBound;
      int end = upperBound;
      
      while(start < end)
      {
         while(nums[start] <= pivot)
         {
            start++;
         }
         
         while(nums[end] > pivot)
         {
            end--;
         }
         
         if(start < end)
         {
            swap(nums, nums[start], nums[end]);
         }
      } 
      
      swap(nums, nums[lowerBound], nums[end]);
      
      return end;
   }
   
   private static void swap(int[] nums, int index1, int index2)
   {
      int temp = nums[index1];
      nums[index1] = nums[index2];
      nums[index2] = temp;      
   } 
}
