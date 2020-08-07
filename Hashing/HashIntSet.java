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
}