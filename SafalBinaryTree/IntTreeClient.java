public class IntTreeClient
{
   public static void main(String[] args)
   {
     IntTree tree = new IntTree(8);
     System.out.println("Tree structure: ");
     
     tree.printSideways(); 
     System.out.println();
     
     System.out.print("PreOrder: ");
     tree.printPreOrder();
     System.out.println();
     
     System.out.print("InOrder: ");
     tree.printInOrder();
     System.out.println();
     
     System.out.print("PostOrder: ");
     tree.printPostOrder();
     System.out.println(); 
     
     System.out.println("Sum: " + tree.sum());
     
     System.out.println("Levels on a tree: " + tree.countLevels()); 
     System.out.println("Number of leaf nodes: " + tree.countLeaves());     
   }
}