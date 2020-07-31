// Binary search algorithm is in the logarithmic complexity class, or O(log N).

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
      
      
      System.out.println(binarySearch(testArray, 56));
      
      long endTime = System.currentTimeMillis();
      System.out.println(endTime);
      
      System.out.println("Elapsed time (ms): " + (endTime - startTime));   
   }
   
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
}