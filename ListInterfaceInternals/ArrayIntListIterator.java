// Objects of this class can be used to iterate over an
// ArrayIntList and remove values from the list.

/*
import java.util.*;


public class ArrayIntListIterator
{
   private ArrayIntList list;    // list to iterate over
   private int position;         // current list position
   private boolean removeOK;     // okay to remove now?
   
   // post: constructs an iterator for the given list
   public ArrayIntListIterator(ArrayIntList list)
   {
      this.list = list;
      position = 0;
      removeOK = false;
   }
   
   // post: returns true if there are more elements left
   public boolean hasNext()
   {
      return position < list.size();
   }
   
   // pre: hasNext() (throws NoSuchElementException if not)
   // post: returns the next element in the iteration
   public int next()
   {
      if(!hasNext())
      {
         throw new NoSuchElementException();
      }
      
      int result = list.get(position);
      position++;
      removeOK = true;
      
      return result;
   }
   
   // pre: next() has been called without a call on remove
   //      (throws IllegalStateException if not)
   // post: removes the last element returned by the iterator
   public void remove()
   {
      if(!removeOK)
      {
         throw new IllegalStateException();
      }
      
      list.remove(position - 1);
      position--;
      
      removeOK = false;
   }   
}
*/