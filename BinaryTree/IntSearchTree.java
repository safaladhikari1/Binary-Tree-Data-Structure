/*
   Specialized version of a binary tree called Binary Search Tree
   Particular Ordering: lesser items on left, greater items on right
*/
public class IntSearchTree
{
   // fields
   private IntTreeNode root;
   
   // constructors
   
   // creates a empty IntSearchTree with null value
   public IntSearchTree()
   {
      root = null;   
   }
   
   // public helper method - adds a new value/node in the search tree
   public void add(int value)
   {
      root = add(this.root, value);
   }
   
   // private recursive method that does the work
   // refer to pg.1057, x = change(x)
   private IntTreeNode add(IntTreeNode root, int value)
   {
      if(root == null)
      {
         root = new IntTreeNode(value);
      }
      
      else if(value <= root.data)
      {
         root.left = add(root.left, value);
      }
      else
      {
         root.right = add(root.right, value);
      }
      
      return root;
   }
   
   
   
   
}