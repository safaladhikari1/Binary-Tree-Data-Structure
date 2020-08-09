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
   private int size;
   
   private int hashFunction(int value)
   {
      return Math.abs(value) % elementData.length;
   }
   
   // Adds the given element to this set, if it was not
   // already contained in the set.
   public void add(int value)
   {
      if(!contains(value))
      {
         // insert new value at front of list
         int bucket = hashFunction(value);
         
         elementData[bucket] = new HashEntry(value, elementData[bucket]);
         size++;
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
   
   // Removes the given value if it is contained in the set.
   // If the set does not contain the value, has no effect.
   public void remove(int value)
   {
      int bucket = hashFunction(value);
      
      if(elementData[bucket] != null)
      {
         // check front of list        
         if(elementData[bucket].data == value)
         {
            elementData[bucket] = elementData[bucket].next;
            size--;
         }
         else
         {
            // check rest of list
            HashEntry current = elementData[bucket];
            
            while(current.next != null && current.next.data != value)
            {
               current = current.next;
            }
            
            // if the element is found, remove it
            if(current.next != null && current.next.data == value)
            {
               current.next = current.next.next;
               size--;
            }            
         }
      }  
   }
   
}