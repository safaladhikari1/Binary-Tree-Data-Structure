/*
   Inner implementation of Stack using a linked list
   A stack uses LIFO(last-in first-out) ordering.
   
   Example: stack of dinner plates, the most recent plate added to the stack
            is the first item to be removed.
            
   Unlike an array, a stack does not offer constant-time access to the ith item. However, it
   does allow constant-time adds and removes, as it doesn't require shifting elements around.
*/

import java.util.EmptyStackException;

public class MyStack
{
   private static class StackNode
   {
      private int data;
      private StackNode next;
      
      public StackNode(int data)
      {
         this.data = data;
      }
   }
   
   private StackNode top;
   
   // Remove the top item from the stack.
   public int pop()
   {
      if(top == null)
      {
         throw new EmptyStackException();
      }
      
      int item = top.data;
      
      top = top.next;
      
      return item;
   }
   
   // Add an item to the top of the stack.
   public void push(int item)
   {
      StackNode t = new StackNode(item);
      
      t.next = top;
      top = t;      
   }
   
   // Return the top of the stack
   public int peek()
   {
      if(top == null)
      {
         throw new EmptyStackException();
      }
      
      return top.data;
   }
   
   // Return true if and only if the stack is empty
   public boolean isEmpty()
   {
      return top == null;
   }     
}