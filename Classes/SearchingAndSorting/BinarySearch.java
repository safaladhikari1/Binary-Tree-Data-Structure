// Binary search algorithm is in the logarithmic complexity class, or O(log N).

/*
   How did we know the time cost of binary search was O(log N)?
   
   If we look at our binary search algorithm below:
   
   The only non-constant part of our time cost is the number of times our while loop runs.
   
   Each step on our while loop, will cut the range (dictated by min and max) in half, until our range have at least one index left between min and max.
   
   while(min <= max), if there isn't at least 1 index between min and max, while loop stops.
   
   So, the question is "how many times must we divide our original array size(n) in half until we get down to 1?"
   
   n * 1/2 * 1/2 .... = 1
   
   How many 1/2's are there? We don't know yet, but we can call that number x:
   
   n * (1/2) ^ x = 1
   
   To solve for x:
   
   n * (1^x / 2^x) = 1
   
   n / 2^x = 1
   
   n = 2^x
   
   
   To get the x out of the exponent, We do Logarithms.
   
   ---
   
   Recall: log10 100 means, "What power must we raise 10 to, to get 100"? The answer is 2.
   
   So in this case, if we take the log2 of both sides..
   
   log2n = log2 2^x
   
   The right side asks, "what power must we raise 2 to, to get 2 ^x?"
   The answer is x.
   
   log2n = x
   
   Therefore, the number of times we must divide n in half to get down to 1 is log2n.
   
   So our time complexity is O(log N)
   
   Careful, to use binary search the input array has to be already sorted.
   
*/

import java.util.Arrays;

public class BinarySearch
{
   public static void main(String[] args)
   {
      int[] testArray = {3, 5, 8, 9, 10, 123, 45, 78, 99};
      Arrays.sort(testArray);
      
      System.out.println(Arrays.toString(testArray));
      
      long startTime = System.currentTimeMillis();
      System.out.println(startTime);
      
      
      System.out.println(binarySearch(testArray, 123));
      
      long endTime = System.currentTimeMillis();
      System.out.println(endTime);
      
      System.out.println("Elapsed time (ms): " + (endTime - startTime));   
   }
   
   // Assume that the elements of the input array are in sorted order.
   public static boolean binarySearch(int[] nums, int target)
   {
      
      // floorIndex and ceilingIndex are like walls, in which we can find the possible positions of our target.
      // So by -1 we mean to start our wall to the left of 0th index.
      int floorIndex = -1;
      int ceilingIndex = nums.length;
      
      // If there isn't at least 1 index between floor and ceiling,
      // we have run out of guesses and the number must not be present.
      while(floorIndex + 1 < ceilingIndex)
      {
         int distance = ceilingIndex - floorIndex;
         
         int halfDistance = distance / 2;
         
         int guessIndex = floorIndex + halfDistance;
         
         int guessValue = nums[guessIndex];
         
         if(guessValue == target)
         {
            return true;
         }
         
         if(guessValue > target)
         {
            // target is to the left, so move ceiling to the left
            ceilingIndex = guessIndex;
         }
         else
         {
            // target is to the right, so move floor to the right
            floorIndex = guessIndex;
         }
         
      }
      
      return false;
       
   }
   
   
   
   /*
   public static int binarySearch(int[] numbers, int target)
   {
      int min = 0;
      int max = numbers.length - 1;
      
      while(min <= max)
      {
         int mid = (max + min) / 2;
         if(numbers[mid] == target)
         {
            return mid; // found it!
         }
         else if(numbers[mid] < target)
         {
            min = mid + 1; // too small
         }
         else // numbers[mid] > target
         {
            max = mid - 1; // too large
         }
      }
      
      return -1; // not found
   }
   */
}