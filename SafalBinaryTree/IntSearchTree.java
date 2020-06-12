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
   
   // public helper method
   // search the tree to see whether it contains a particular value
   
   public boolean contains(int value)
   {
      // start the recursion
      return contains(root, value);
   }
   
   // private recursive method, that does the work
   private boolean contains(IntTreeNode root, int value)
   {
      if(root == null)
      {
         return false;
      }
      else if(value == root.data)
      {
         return true;
      }
      else if(value < root.data)
      {
         return contains(root.left, value);
      }
      else // value > root.data
      {
         return contains(root.right, value);
      }   
   }
   
   // prints the tree contents using an inorder Traversal
   
   public void printInOrder()
   {
      printInOrder(root);
   }
   
   private void printInOrder(IntTreeNode root)
   {
      if(root != null)
      {
         printInOrder(root.left);
         System.out.print(root.data + " ");
         printInOrder(root.right);
      }
   }
   
   // prints the tree contents, one per line, following InOrder traversal
   // and using indentation to indicate node depth
   public void printSideways()
   {
      printSideways(this.root, 0);   
   }
   
   // prints in reversed PreOrder the tree with given root
   // indenting each line to the given level
   private void printSideways(IntTreeNode root, int level)
   {
      if(root != null)
      {
         printSideways(root.right, level + 1);
         for(int i=0; i<level; i++)
         {
            System.out.print("   ");
         }
         
         System.out.println(root.data);
         printSideways(root.left, level + 1);
      }   
   }  
}