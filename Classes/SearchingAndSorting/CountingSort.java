/*
   Sources: Geek for Geeks: https://youtu.be/7zuGmKfUt7s
   
            Jenny's Lectures: https://youtu.be/pEJiGC-ObQE
   
   Counting Sort Algorithm:
   
   1. We give the input array:
      
      [2, 1, 1, 0, 2, 5, 4, 0, 2, 8, 7, 7, 9, 2, 0, 1, 9]
   
   2. We know the highest element on the above array is 9,
   
      so our count table's length is highestElement + 1.
      
      int[] count = new int[highestElement + 1]
      
      It will intialize the count to all 0s.
      
   3. After the for loop, we have a tally on the input values on the count table:
      
      [3, 3, 4, 0, 1, 1, 0, 2, 1, 2]
      
      For example: 0 appeared 3 times, 1 appeared 3 times. 2 appears 4 times and so on.
      
   4. Now we know that once the input array is sorted it will look like:
   
      [0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 4, 5, 7, 7, 8, 9, 9]
      
      On our count table, we know that there are 3 zero's at the front, then 3 one's, 4 two's
      But we don't know the positions of each of those two's and one's on our result array.
      
      For example: Do 2 goes in 4th index, 5th index ?? and and so on.
      
      That's why we make changes to our count table by doing the addition:
      
      [3, 6, 10, 10, 11, 12, 12, 14, 15, 17]
      
      On the second for loop on the code below,
      We just added the elements from the left, and elements on the right got the additions from the left.
      
  5.  Let's look back at our input array again:
      
      Input -> [2, 1, 1, 0, 2, 5, 4, 0, 2, 8, 7, 7, 9, 2, 0, 1, 9]
      
      Output should be -> [0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 4, 5, 7, 7, 8, 9, 9]
      
      Our CountTable -> [3, 6, 10, 10, 11, 12, 12, 14, 15, 17]
      
      -----
      
      First Iteration:
      
      We start from the back of the array, for the stability of the counting sort.
      
      There are two 9s, the first nums[12] = 9, should come before second nums[16] = 9, on the output array.
      
      We start from the last index of the Input array:
      
      [2, 1, 1, 0, 2, 5, 4, 0, 2, 8, 7, 7, 9, 2, 0, 1, 9]
      
      nums[16] = 9
      
      We look at the 9th index on our count table         
      
      [3, 6, 10, 10, 11, 12, 12, 14, 15, 17]
       0  1   2   3   4  5   6   7   8   9
       
      count[9] = 17
      
      On our output, we don't have 17th index, our last index is 16th, [0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 4, 5, 7, 7, 8, 9, 9]
      
      So we will decrement 17 by 1
      
      Count Table will look like:
      
      [3, 6, 10, 10, 11, 12, 12, 14, 15, 16]
       0  1   2   3   4  5   6   7   8   9
      
      Now, on our output we will say, go to the 16th index, and put 9.
      
      [  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,   ,   ,   ,   ,   ,   ,  9]
       0  1  2  3  4  5  6  7  8  9  10  11  12  13  14  15  16
       
      -----
      
      Second iteration:
      
      We are on the second last index of the input array
      
      [2, 1, 1, 0, 2, 5, 4, 0, 2, 8, 7, 7, 9, 2, 0, 1, 9]
      
      nums[15] = 1
      
      We look at the 1st index on our count table         
      
      [3, 6, 10, 10, 11, 12, 12, 14, 15, 16]
       0  1   2   3   4  5   6   7   8   9
       
      count[1] = 6
        
      So we will decrement 6 by 1
      
      [3, 5, 10, 10, 11, 12, 12, 14, 15, 16]
       0  1   2   3   4  5   6   7   8   9     
      
      Now, on our output we will say, go to the 5th index, and put 1.
      
      [  ,  ,  ,  ,  ,1  ,  ,  ,  ,  ,   ,   ,   ,   ,   ,   ,  9]
       0  1  2  3  4  5  6  7  8  9  10  11  12  13  14  15  16
      
     ------
    
     Third iteration:
      
     We are on the third last index of the input array
    
     It repeats the same pattern  
     
     
     -------
     
     Time-Complexity: O(N + K), where K is the range (highest element), N is the number of elements in the array.    


*/
import java.util.Arrays;

class CountingSort
{
   public static void main(String[] args)
   {
      int[] testArray1 = {2, 1, 1, 0, 2, 5, 4, 0, 2, 8, 7, 7, 9, 2, 0, 1, 9};
      
      System.out.println(Arrays.toString(countingSort(testArray1, 9)));
   }
   
   public static int[] countingSort(int[] nums, int highestElement)
   {
      int[] count = new int[highestElement + 1];
      
      int[] result = new int[nums.length];
      
      for(int i=0; i < nums.length; i++)
      {
         count[nums[i]]++;
      }
      
      for(int i = 1; i <= highestElement; i++)
      {
         count[i] = count[i] + count[i - 1];
      }
      
      for(int i = nums.length - 1; i >= 0; i--)
      {
         result[--count[nums[i]]] = nums[i];
      }
      
      for(int i=0; i<nums.length; i++)
      {
         nums[i] = result[i];
      }
      
      return nums; 
   }
}