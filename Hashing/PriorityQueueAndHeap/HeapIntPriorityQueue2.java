/* 
   Any complete binary tree can actually be stored as an array,
   where index 1 stores the root element,
   and the children of index i are stored as
   indexes 2i and 2i + 1.
   
   So the children of index 1 (the root)
   are at indexes 2 and 3;
   
   the children of index 2 are at indexes 4 and 5.
   { ,10, 50, 20, 70, 60, 44, 90, 80, 99, 65};
   
                10
                
           50          20
              
      70       60    44      90
          
   80   99  65
   
   A min-heap
*/

import java.util.Arrays;
import java.util.NoSuchElementException;

// Implements a priority queue of integers using a 
// min-heap represented as an array.
public class HeapIntPriorityQueue2
{
   private int[] elementData;
   private int size;
   
   // Constructs an empty queue.
   public HeapIntPriorityQueue2()
   {
      elementData = new int[10];
      size = 0;
   }
   
   // Adds the given element to this queue.
   // Page 1108 for visual representation
   public void add(int value)
   {
      // resize if necessary
      if(size + 1 >= elementData.length)
      {
         elementData = Arrays.copyOf(elementData, elementData.length * 2);
      }
      
      // insert as new rightmost leaf
      elementData[size + 1] = value; // at first inserted at the end of the array[size + 1]
      
      // "bubble up" toward root as necessary to fix ordering
      int index = size + 1;
      while(hasParent(index))
      {
         int parent = parent(index);
         
         if(elementData[index] < elementData[parent])
         {
            swap(elementData, index, parent(index));
            index = parent(index);
         }
         else
         {
            break; // proper place found; terminate the loop
         }
      }
      
      size++;
   }
   
   // Returns true if there are no elements in this queue.
   public boolean isEmpty()
   {
      return size == 0;
   }
   
   // Returns the minimum value in the queue without modifying the queue.
   // If the queue is empty, throws a NoSuchElementException.
   public int peek()
   {
      if(isEmpty())
      {
         throw new NoSuchElementException();
      }
      
      return elementData[1];
   }
   
   // Removes and returns the minimum value in the queue.
   // If the queue is empty, throws a NoSuchElementException.
   // Page 1109 for visualization
   public int remove()
   {
      int result = peek();
      
      // move rightmost leaf to become new root
      swap(elementData, 1, size);
      size--;
      
      // "bubble down" root as necessary to fix ordering
      bubbleDown(1);
      return result;    
   }
   
   // Swaps the element at the given index as necessary to fix ordering.
   private void bubbleDown(int index)
   {
      while(hasLeftChild(index))
      {
         int left = leftChild(index);
         int right = rightChild(index);
         int child = left;
         
         if(hasRightChild(index) && elementData[right] < elementData[left])
         {
            child = right;
         }
         
         if(elementData[index] > elementData[child])
         {
            swap(elementData, index, child);
            index = child;
         }
         else
         {
            break; //proper place found; terminate the loop
         }        
      }     
   }
   
   // Returns the number of elements in the queue.
   public int size()
   {
      return size;
   }
   
   // Returns a string representation of this queue, such as "[10, 20, 30]";
   // The elements are not guranteed to be listed in sorted order.
   public String toString()
   {
      String result = "[";
      
      if(!isEmpty())
      {
         result += elementData[1];
         for(int i=2; i <= size; i++)
         {
            result += ", " + elementData[i];
         }
      }
      
      return result + "]";
   }
   
   // helpers for navigating indexes up/down the tree
   private int parent(int index)
   {
      return index / 2;
   }
   
   // returns index of left child of given index
   private int leftChild(int index)
   {
      return index * 2;
   }
   
   // returns index of right child of given index
   private int rightChild(int index)
   {
      return index * 2 + 1;
   }
   
   // returns true if the node at the given index has a parent (is not the root)
   private boolean hasParent(int index)
   {
      return index > 1;
   }
   
   // returns true if the node at the given index has a non-empty left child
   private boolean hasLeftChild(int index)
   {
      return leftChild(index) <= size;
   }
   
   // returns true if the node at the given index has a non-empty right child
   private boolean hasRightChild(int index)
   {
      return rightChild(index) <= size;
   }
   
   // switches the values at the two given indexes of the given array
   private void swap(int[] a, int index1, int index2)
   {
      int temp = a[index1];
      a[index1] = a[index2];
      a[index2] = temp;
   }    
}