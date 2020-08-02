// Returns the range of values in the given array:

public class RangeAlgorithm
{
   // The algorithm is O(N^2)
   public static int range1(int[] numbers)
   {
      int maxDiff = 0;
      for(int i=0; i<numbers.length; i++)
      {
         for(int j=0; j<numbers.length; j++)
         {
            int diff = Math.abs(numbers[j] - numbers[i]);
            if(diff > maxDiff)
            {
               maxDiff = diff;
            }
         }
      }
      
      return maxDiff;
   }
   
   // The algorithm is O(N^2)
   public static int range2(int[] numbers)
   {
      int maxDiff = 0;
      for(int i=0; i<numbers.length; i++)
      {
         for(int j=i+1; j<numbers.length; j++)
         {
            int diff = Math.abs(numbers[j] - numbers[i]);
            maxDiff = Math.max(maxDiff, diff);
         }
      }
      
      return maxDiff;
   }
   
   // The final version is O(N). It runs MUCH faster.
   public static int range3(int[] numbers)
   {
      int max = numbers[0];
      int min = max;
      
      for(int i=1; i<numbers.length; i++)
      {
         if(numbers[i] < min)
         {
            min = numbers[i];
         }
         
         if(numbers[i] > max)
         {
            max = numbers[i];
         }
      }      
      return max - min;
   }  
}