// Binary search algorithm that works with Strings.
// Returns an index at which the given target String
// appears in the given input array, or -1 if not found.
// pre: array is sorted

public class BinarySearchObject
{
   public static int binarySearch(String[] strings, String target)
   {
      int min = 0;
      int max = strings.length - 1;
      
      while(min <= max)
      {
         int mid = (max + min) / 2;
         int compare = strings[mid].compareTo(target);
         
         if(compare == 0)
         {
            return mid; // found it!
         }
         else if(compare < 0)
         {
            min = mid + 1; // too small
         }
         else // compare > 0
         {
            max = mid - 1; // too large
         }
      }
      
      return -1; // not found
   }
}