// Class ArrayList<E> can be used to store a list of data of type E.
import java.util.*;

public class ArrayList<E>
{
   private class ArrayListIterator implements Iterator<E>
   {
      private int position;         // current list position
      private boolean removeOK;     // okay to remove now?
      
      // post: constructs an iterator for the given list
      public ArrayListIterator()
      {
         position = 0;
         removeOK = false;
      }
      
      // post: returns true if there are more elements left
      public boolean hasNext()
      {
         return position < size();
      }
      
      // pre: hasNext() (throws NoSuchElementException if not)
      // post: returns the next element in the iteration
      public E next()
      {
         if(!hasNext())
         {
            throw new NoSuchElementException();
         }
         
         E result = elementData[position];
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
         
         ArrayList.this.remove(position - 1);
         position--;
         
         removeOK = false;
      }   
   }
   
   //constants
   public static final int DEFAULT_CAPACITY = 100;
   
   //fields
   private E[] elementData;    // list of data
   private int size;             // number of elements in the list
   
   //constructor
   
   // constructs an empty list with the given capacity
   public ArrayList()
   {
      this(DEFAULT_CAPACITY);
   }
   
   // we can construct an array of type Object[], but not an array of type E[].
   // We introduced a cast
   
   // Java generates a warning about using unsafe or unchecked types, because
   // Java won't let us construct a generic array, we are suppressing the warning
   
   @SuppressWarnings("unchecked")
   public ArrayList(int capacity)
   {
      if(capacity < 0)
      {
         throw new IllegalArgumentException("capacity: " + capacity);
      }
      
      elementData = (E[]) new Object[capacity];
      size = 0;
   }
   
   //methods
   public void add(E data)
   {
      // checks if the array has the capacity to add one more value to the list
      ensureCapacity(size + 1);
      
      elementData[size] = data;
      size++;
   }
   
   // pre : 0 <= index <= size() (throws IndexOutOfBoundsException if not)
   // post: inserts the given value at the given index, shifting subsequent
   //       values right
   public void add(int index, E data)
   {
      if(index < 0 || index > size)
      {
         throw new IndexOutOfBoundsException("index: " + index);
      }
      
      ensureCapacity(size + 1);
      
      for(int i=size; i >= index+1; i--)
      {
         elementData[i] = elementData[i-1];
      }
      
      elementData[index] = data;
      
      size++;
   }
   
   // Adds all of the data from a second ArrayList<E> object.
   // one ArrayList<E> object can access private elements of another ArrayList<E> object,
   // such as other.size, other.elementData, because they both belong to the same class.
   public void addAll(ArrayList<E> other)
   {
      ensureCapacity(size + other.size);
      
      for(int i=0; i<other.size; i++)
      {
         add(other.elementData[i]);
      }
   }
   
   // Checks that the underlying array has the given capacity, size() < capacity
   // it creates a larger array
   public void ensureCapacity(int capacity)
   {
      if(capacity > elementData.length)
      {
         int newCapacity = elementData.length * 2 + 1;
         if(capacity > newCapacity)
         {
            newCapacity = capacity;
         }
         
         //  is optimized to run faster
         elementData = Arrays.copyOf(elementData, newCapacity);
         
         /*
         int[] newList = new int[newCapacity];
         for(int i=0; i < size; i++)
         {
            newList[i] = elementData[i];
         }
         
         elementData = newList;
         */
      }
   }
   
   public void remove(int index)
   {
      checkIndex(index);
      
      for(int i=index; i<size-1; i++)
      {
         elementData[i] = elementData[i+1];     
      }
      
      // after the shifting code, it sets the unused array element back to null
      elementData[size - 1] = null; 
      
      size--;   
   }
   
   public int size()
   {
      return size;
   }
   
   public E get(int index)
   {
      checkIndex(index);
          
      return elementData[index];   
   }
   
   // client can only get access to array elements 0 through size - 1, because of checkIndex()
   // client will have to make call on add method, in which case old values will be overwritten with new values
   public void clear()
   {
      for(int i=0; i < size; i++)
      {
         elementData[i] = null;
      }
      
      this.size = 0;
   }
   
   // throws an IndexOutOfBoundException if the given index is not a legal index
   // of the current list
   private void checkIndex(int index)
   {
      if(index < 0 || index >= size)
      {
         throw new IndexOutOfBoundsException("index: " + index);
      }
   }
   
   // replaces the data at a certain location with some new data
   public void set(int index, E data)
   {
      checkIndex(index);
      elementData[index] = data;
   }
   
   public int indexOf(E data)
   {
      for(int i=0; i < size; i++)
      {
         if(elementData[i].equals(data))
         {
            return i;
         }
      }
      
      return -1;   
   }
   
   // checks whether a particular data appears in the list somewhere
   public boolean contains(E data)
   {
      return indexOf(data) >= 0;
   }
   
   // returns a boolean value indicating whether or not the list is empty
   public boolean isEmpty()
   {
      return size == 0;
   }
   
   // this method constructs an iterator for this list
   public Iterator<E> iterator()
   {
      return new ArrayListIterator();
   }
   
   @Override
   public String toString()
   {
      if(size == 0)
      {
         return "[]";
      }
      else
      {
         String result = "[";
         
         result += elementData[0];
         
         for(int i=1; i<size; i++)
         {
            result += ", " + elementData[i];
         }
         
         result += "]";
         return result;   
      }
   }
}