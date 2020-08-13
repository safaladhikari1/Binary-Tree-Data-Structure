// Implements a set of objects using a hash table.
// The hash table uses separate chaining to resolve collisions.
public class HashSet<E>
{
   // Represents a single value in a chain stored in one hash bucket.
   private class HashEntry
   {
      public E data;
      public HashEntry next;
      
      public HashEntry(E data)
      {
         this(data, null);
      }
      
      public HashEntry(E data, HashEntry next)
      {
         this.data = data;
         this.next = next;
      }
   }
   
   private static final double MAX_LOAD_FACTOR = 0.75;
   private HashEntry[] elementData;
   private int size;
   
   // Constructs an empty set.
   public HashSet()
   {
      elementData = (HashEntry[]) new HashSet.HashEntry[10];
      size = 0;
   }
   
   // Returns the preferred hash bucket index for the given value.
   private int hashFunction(E value)
   {
      return Math.abs(value.hashCode()) % elementData.length;
   }
   
   // Adds the given element to this set, if it was not
   // already contained in the set.
   public void add(E value)
   {
      if(!contains(value))
      {
         if(loadFactor() >= MAX_LOAD_FACTOR)
         {
            rehash();
         }
         
         // insert new value at front of list
         int bucket = hashFunction(value);         
         elementData[bucket] = new HashEntry(value, elementData[bucket]);
         size++;
      }
   }
   
   // Returns true if the given value is found in this set.
   public boolean contains(E value)
   {
      int bucket = hashFunction(value);
      
      HashEntry current = elementData[bucket];
      
      while(current != null)
      {
         if(current.data.equals(value))
         {
            return true;
         }
         
         current = current.next;
      }
      
      return false;
   }
   
   // Removes the given value if it is contained in the set.
   // If the set does not contain the value, has no effect.
   public void remove(E value)
   {
      int bucket = hashFunction(value);
      
      if(elementData[bucket] != null)
      {
         // check front of list        
         if(elementData[bucket].data.equals(value))
         {
            elementData[bucket] = elementData[bucket].next;
            size--;
         }
         else
         {
            // check rest of list
            HashEntry current = elementData[bucket];
            
            while(current.next != null && !current.next.data.equals(value))
            {
               current = current.next;
            }
            
            // if the element is found, remove it
            if(current.next != null && current.next.data.equals(value))
            {
               current.next = current.next.next;
               size--;
            }            
         }
      }  
   }
   
   // Removes all elements from the set.
   public void clear()
   {
      for(int i=0; i < elementData.length; i++)
      {
         elementData[i] = null;
      }
      
      size = 0;
   }
   
   // Returns true if there are no elements in this queue.
   public boolean isEmpty()
   {
      return size == 0;
   }
   
   // Returns the number of elements in the queue.
   public int size()
   {
      return size;
   }
   
   private double loadFactor()
   {
      return (double) size / elementData.length;
   }
   
   // Resizes the hash table to twice its former size.
   private void rehash()
   {
      // replace element data array with a larger empty version
      HashEntry[] oldElementData = elementData;
      elementData = (HashEntry[]) new HashSet.HashEntry[2 * oldElementData.length];
      //elementData = new HashEntry[2 * oldElementData.length];
      size = 0;
      
      // re-add all of the old data into the new array
      for(int i=0; i < oldElementData.length; i++)
      {
         HashEntry current = oldElementData[i];
         while(current != null)
         {
            add(current.data);
            current = current.next;
         }
      }
   }
   
   // Returns a string representation of this queue
   // The elements are not guaranteed to be listed in sorted order.
   public String toString()
   {
      String result = "[";
      boolean first = true;
      if(!isEmpty())
      {
         for(int i=0; i < elementData.length; i++)
         {
            HashEntry current = elementData[i];
            while(current != null)
            {
               if(!first)
               {
                  result += ", ";
               }
               result += current.data;
               first = false;
               current = current.next;
            }
         }
      }
      return result + "]";
   } 
   
}