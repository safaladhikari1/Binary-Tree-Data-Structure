// Class SearchTree stores and prints a binary search tree of
// objects of type E. E must implement the Comparable<E>
// interface.

public class SearchTree<E extends Comparable<E>>
{
   
   // fields
   private SearchTreeNode<E> root;
   
   // constructors
   
   // creates a empty SearchTree with null value
   public SearchTree()
   {
      root = null;   
   }
   
   // public helper method - adds a new value/node in the search tree
   public void add(E value)
   {
      root = add(this.root, value);
   }
   
   // private recursive method that does the work
   // refer to pg.1057, x = change(x)
   private SearchTreeNode<E> add(SearchTreeNode<E> root, E value)
   {
      if(root == null)
      {
         root = new SearchTreeNode<E>(value);
      }
      
      else if(value.compareTo(root.data) <= 0)
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
   
   public boolean contains(E value)
   {
      // start the recursion
      return contains(root, value);
   }
   
   // private recursive method, that does the work
   private boolean contains(SearchTreeNode<E> root, E value)
   {
      if(root == null)
      {
         return false;
      }
      else
      {
         int compare = ((Comparable<E>) value).compareTo(root.data);
         if(compare == 0)
         {
            return true;
         }
         else if(compare < 0)
         {
            return contains(root.left, value);
         }
         else // compare > 0
         {
            return contains(root.right, value);
         }
      }  
   }
   
   // prints the tree contents using an inorder Traversal
   
   public void printInOrder()
   {
      printInOrder(root);
   }
   
   private void printInOrder(SearchTreeNode<E> root)
   {
      if(root != null)
      {
         printInOrder(root.left);
         System.out.println(root.data + " ");
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
   private void printSideways(SearchTreeNode<E> root, int level)
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