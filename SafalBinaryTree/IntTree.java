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
   
   // returns sum of data stored in the IntTreeNodes in the tree
   // if the tree has not IntTreeNodes, it returns 0
   public int sum()
   {
      return sum(root);   
   }
   
   private int sum(IntTreeNode root)
   {
      if(root == null)
      {
         return 0;
      }
      else
      {
         return root.data + sum(root.left) + sum(root.right);
      }
   }
   
   // returns the number of levels in a tree
   // height of a tree of one node == 0, empty tree has height of -1
   // height of a tree is 1 less than its number of levels
   public int countLevels()
   {
      return countLevels(root);
   }
   
   private int countLevels(IntTreeNode root)
   {
      if(root == null)
      {
         return 0;
      }
      else
      {
         return 1 + Math.max(countLevels(root.left), countLevels(root.right));
      }
   }
   
   // returns a count of the number of leaf nodes in a tree
   // Both left and right child nodes of leaf node are NULL.
   // each leaf node returns 1, and those answers are added together by other calls
   public int countLeaves()
   {
      return countLeaves(this.root);
   }
   
   private int countLeaves(IntTreeNode root)
   {
      if(root == null)
      {
         return 0;
      }
      else if(root.left == null && root.right == null)
      {
         return 1;
      }
      else
      {
         return countLeaves(root.left) + countLeaves(root.right);
      }
   }  
}