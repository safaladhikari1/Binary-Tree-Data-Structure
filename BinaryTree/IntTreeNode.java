// Class for storing a single node of a binary tree of ints

public class IntTreeNode
{
   // fields
   public int data;
   public IntTreeNode left; //address of the child node to my left
   public IntTreeNode right; //address of the child node to my right
     
   // helper constructors
   
   // constructs a branch node with given data, left subtree and right subtree
   public IntTreeNode(int data, IntTreeNode left, IntTreeNode right)
   {
      this.data = data;
      this.left = left;
      this.right = right;
   }
   
   // constructs a leaf node with given data
   public IntTreeNode(int data)
   {
      this(data, null, null);
   }  
}