public class HashIntSet
{
   // Represents a single value in a chain stored in one hash bucket.
   private class HashEntry
   {
      private int data;
      private HashEntry next;
      
      public HashEntry(int data)
      {
         this(data, null);
      }
      
      public HashEntry(int data, HashEntry next)
      {
         this.data = data;
         this.next = next;
      }
   }
   
   private HashEntry[] elementData;
   
   private int hashFunction(int value)
   {
      return Math.abs(value) % elementData.length;
   }
   
   // Adds the given element to this set, if it was not
   // already contained in the set.
   public void add (int value)
   {
      if(!contains(value))
      {
         // insert new value at front of list
         
      }
   }
   
   // Returns true if the given value is found in this set.
   public boolean contains(int value)
   {
      int bucket = hashFunction(value);
      
      HashEntry current = elementData[bucket];
      
      while(current != null)
      {
         if(current.data == value)
         {
            return true;
         }
         
         current = current.next;
      }
      
      return false;
   }
   
}