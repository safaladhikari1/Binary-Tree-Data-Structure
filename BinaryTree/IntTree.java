public class IntTree
{
   // fields
   private IntTreeNode root;
   
   // constructors
    
   //max >= 0, if not throws IllegalArgumentException
   //or constructs a tree with given number of nodes     
   public IntTree(int max)
   {
      if(max < 0)
      {
         throw new IllegalArgumentException("max: " + max);
      }
      
      root = buildTree(1, max); 
   }
   
   // methods
   
   // method returns a value of typeIntTreeNode
   // a reference to the tree it has built
   
   // returns a sequential tree with n as its root unless n is
   // greater than max, in which case it returns an empty tree
   private IntTreeNode buildTree(int n, int max)
   {
      if(n > max)
      {
         return null;
      }
      else
      {
         
         IntTreeNode left = buildTree(2*n, max);
         IntTreeNode right = buildTree(2*n + 1, max);
         return new IntTreeNode(n, left, right); 
      }      
   }
   
   /*
   public IntTree()
   {
      //constructor builds a canned tree
      
      root = new IntTreeNode(17, null, null);
      
      //helper constructor IntTreeNode(int data) puts null on left and right
      root.left = new IntTreeNode(41);
      root.right = new IntTreeNode(9);
      root.left.left = new IntTreeNode(29);
      root.left.right = new IntTreeNode(6);
      root.right.left = new IntTreeNode(81);
      root.right.right = new IntTreeNode(40);     
   }
   */
   
   //public helper method for PreOrder Traversal
   public void printPreOrder()
   {
      // starts the recursion here
      printPreOrder(this.root);
   }
   
   private void printPreOrder(IntTreeNode theRoot)
   {
      if(theRoot != null)
      {
         System.out.print(theRoot.data + " ");
         printPreOrder(theRoot.left);
         printPreOrder(theRoot.right);
      }
   }
   
   //public helper method for InOrder Traversal
   public void printInOrder()
   {
      // starts the recursion here
      printInOrder(this.root);
   }
   
   private void printInOrder(IntTreeNode theRoot)
   {
      if(theRoot != null)
      {
         printInOrder(theRoot.left);
         System.out.print(theRoot.data + " ");
         printInOrder(theRoot.right);
      }
   }
   
   //public helper method for PostOrder Traversal
   public void printPostOrder()
   {
      // starts the recursion here
      printPostOrder(this.root);
   }
   
   private void printPostOrder(IntTreeNode theRoot)
   {
      if(theRoot != null)
      {
         printPostOrder(theRoot.left);
         printPostOrder(theRoot.right);
         System.out.print(theRoot.data + " ");
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