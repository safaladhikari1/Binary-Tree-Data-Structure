/* 
   Any complete binary tree can actually be stored as an array,
   where index 1 stores the root element,
   and the children of index i are stored as
   indexes 2i and 2i + 1.
   
   So the children of index 1 (the root)
   are at indexes 2 and 3;
   
   the children of index 2 are at indexes 4 and 5.
   { ,10, 50, 20, 70, 60, 44, 90, 80, 99, 65};
   
                10
                
           50          20
              
      70       60    44      90
          
   80   99  65
   
   A min-heap
*/

// Implements a priority queue of integers using a 
// min-heap represented as an array.
public class HeapIntPriorityQueue
{
   private int[] elementData;
   private int size;
   
   // helpers for navigating indexes up/down the tree
   private int parent(int index)
   {
      return index / 2;
   }
   
   // returns index of left child of given index
   private int leftChild(int index)
   {
      return index * 2;
   }
   
   // returns index of right child of given index
   private int rightChild(int index)
   {
      return index * 2 + 1;
   }
   
   // returns true if the node at the given index has a parent (is not the root)
   private boolean hasParent(int index)
   {
      return index > 1;
   }
   
   // returns true if the node at the given index has a non-empty left child
   private boolean hasLeftChild(int index)
   {
      return leftChild(index) <= size;
   }
   
   // returns true if the node at the given index has a non-empty right child
   private boolean hasRightChild(int index)
   {
      return rightChild(index) <= size;
   }
   
   // switches the values at the two given indexes of the given array
   private void swap(int[] a, int index1, int index2)
   {
      int temp = a[index1];
      a[index1] = a[index2];
      a[index2] = temp;
   }    
}