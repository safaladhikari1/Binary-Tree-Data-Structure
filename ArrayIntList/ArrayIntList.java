// Class ArrayIntList can be used to store a list of integers.

public class ArrayIntList
{
   //constants
   public static final int DEFAULT_CAPACITY = 100;
   
   //fields
   private int[] elementData;    // list of integers
   private int size;             // number of elements in the list
   
   //constructor
   
   // constructs an empty list with the given capacity
   public ArrayIntList()
   {
      this(DEFAULT_CAPACITY);
   }
   
   public ArrayIntList(int capacity)
   {
      if(capacity < 0)
      {
         throw new IllegalArgumentException("capacity: " + capacity);
      }
      
      elementData = new int[capacity];
      size = 0;
   }
   
   //methods
   public void add(int data)
   {
      // checks if the array has the capacity to add one more value to the list
      checkCapacity(size + 1); 
      
      elementData[size] = data;
      size++;
   }
   
   public void add(int index, int data)
   {
      checkCapacity(size + 1);
      
      for(int i=size; i >= index+1; i--)
      {
         elementData[i] = elementData[i-1];
      }
      
      elementData[index] = data;
      
      size++;
   }
   
   // Adds all of the data from a second ArrayIntList object.
   // one ArrayIntList object can access private elements of another ArrayIntList object,
   // such as other.size, other.elementData, because they both belong to thes same class.
   public void addAll(ArrayIntList other)
   {
      checkCapacity(size + other.size);
      
      for(int i=0; i<other.size; i++)
      {
         add(other.elementData[i]);
      }
   }
   
   // Checks that the underlying array has the given capacity, size() < capacity
   // throwing an IllegalStateException if it does not.
   private void checkCapacity(int capacity)
   {
      if(capacity > elementData.length)
      {
         throw new IllegalStateException("exceeds list capacity");
      }
   }
   
   public void remove(int index)
   {
      checkIndex(index);
      
      for(int i=index; i<size-1; i++)
      {
         elementData[i] = elementData[i+1];     
      }
      
      size--;   
   }
   
   public int size()
   {
      return size;
   }
   
   public int get(int index)
   {
      checkIndex(index);
          
      return elementData[index];   
   }
   
   // client can only get access to array elements 0 through size - 1, because of checkIndex()
   // client will have to make call on add method, in which case old values will be overwritten with new values
   public void clear()
   {
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
   public void set(int index, int data)
   {
      checkIndex(index);
      elementData[index] = data;
   }
   
   public int indexOf(int data)
   {
      for(int i=0; i < size; i++)
      {
         if(elementData[i] == data)
         {
            return i;
         }
      }
      
      return -1;   
   }
   
   // checks whether a particular data appears in the list somewhere
   public boolean contains(int data)
   {
      return indexOf(data) >= 0;
   }
   
   // returns a boolean value indicating whether or not the list is empty
   public boolean isEmpty()
   {
      return size == 0;
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