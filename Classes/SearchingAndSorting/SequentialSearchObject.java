public class SequentialSearchObject
{
   // Sequential search algorithm.
   // Returns the index at which the target first
   // appears in the given input array, or -1 if not found.
   
   public static int indexOf(Object[] objects, Object target)
   {
      for(int i=0; i<objects.length; i++)
      {
         if(objects[i].equals(target))
         {
            return i; // found it!
         }
      }
      
      return -1; // not found
   }
}