public class IntTree
{
   //fields
   private IntTreeNode root;
   
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
   
   
   
   
}