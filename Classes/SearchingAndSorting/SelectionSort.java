// Selection sort is an O(N^2) sorting algorithm

// Since the code has two nested for loops, each of which processes the entire array,
// the algorithm executes roughly N^2 statements.

public class SelectionSort
{
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
}