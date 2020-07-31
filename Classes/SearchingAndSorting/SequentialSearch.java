// Sequential Search algorithm is a linear O(N) algorithm because it contains one loop that
// traverses at most N elements in an array.

public class SequentialSearch
{
   public static void main(String[] args)
   {
      long startTime = System.currentTimeMillis();
      System.out.println(startTime);
      
      int[] testArray = {3, 5, 8, 9, 10, 123, 45, 78, 99};
      System.out.println(indexOf(testArray, 56));
      
      long endTime = System.currentTimeMillis();
      System.out.println(endTime);
      
      System.out.println("Elapsed time (ms): " + (endTime - startTime));
   }
   
   // Sequential search algorithm.
   // Returns the index at which the given target number first
   // appears in the given input array, or -1 if it is not found.
   public static int indexOf(int[] list, int target)
   {
      for(int i=0; i<list.length; i++)
      {
         if(list[i] == target)
         {
            return i;
         }
      }
      
      return -1; // not found
   }
   
}