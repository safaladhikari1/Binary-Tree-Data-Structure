/*
   Inner implementation of a queue using a linked list
   A queue implements FIFO(first-in first-out) ordering.
   
   Example: As in a line or queue at a ticket stand, items are removed
            from the data structure in the same order that they are added. 
   
   Be careful, it is easy to mess up the updating of the first and last nodes in a queue.
*/

import java.util.NoSuchElementException;

public class MyQueue<T>
{
   private static class QueueNode<T>
   {
      private T data;
      private QueueNode<T> next;
      
      public QueueNode(T data)
      {
         this.data = data;
      }
   }
   
   private QueueNode<T> first;
   private QueueNode<T> last;
   
   // Add an item to the end of the queue.
   public void add(T item)
   {
      QueueNode<T> t = new QueueNode<T>(item);
      
      if(last != null)
      {
         last.next = t;
      }
      
      last = t;
      
      if(first == null)
      {
         first = last;
      }
   }
   
   //Remove the first item in the queue
   public T remove()
   {
      if(first == null)
      {
         throw new NoSuchElementException();
      }
      
      T data = first.data;
      
      first = first.next;
      
      if(first == null)
      {
         last = null;
      }
      
      return data;     
   }
   
   // Return the top of the queue.
   public T peek()
   {
      if(first == null)
      {
         throw new NoSuchElementException();
      }
      
      return first.data;
   }
   
   // Return true if and only if the queue is empty.
   public boolean isEmpty()
   {
      return first == null;
   } 
}