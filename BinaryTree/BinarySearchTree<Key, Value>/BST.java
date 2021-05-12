/*
   Implementation of Binary Search Tree data structure using key, value pairs (ordered symbol-table)
   
   Key extends Comparable, this means:
      Key can only be that class, which has implemented Comparable<Key> interface, with the implementation of compareTo() method.

*/

class BST<K extends Comparable<K>, V>
{
   private Node root;
   
   private class Node
   {
      // key
      private K key;  
      
      // associated value
      private V val;
      
      // links to subtrees
      private Node left, right;   
      
      // no. of nodes in subtree
      private int n;
      
      public Node(K key, V val, int n)
      {
         this.key = key;
         this.val = val;
         this.n = n;
      }  
   }    
      
   public int size()
   {
      return size(root);
   }
   
   private int size(Node x)
   {
      if(x == null)
      {
         return 0;
      }
      else
      {
         return x.n;
      }
   }
   
   // Review pictures on Page 400
   public V get(K key)
   {
      return get(root, key);
   }
   
   private V get(Node x, K key)
   {
      // Return value associated with key in the subtree rooted at x
      // return null if key is not present in subtree rooted at x
      
      if(x == null)
      {
         return null;
      }
      
      int cmp = key.compareTo(x.key);
      
      if(cmp < 0)
      {
         return get(x.left, key);
      }
      else if(cmp > 0)
      {
         return get(x.right, key);
      }
      else
      {
         return x.val;
      }
   }
   
   public void put(K key, V val)
   {
      // Search for key. Update value if found; grow table if new.
      
      root = put(root, key, val);
   }
   
   private Node put(Node x, K key, V val)
   {
      // Change key's value to val if key in subtree rooted at x.
      // Otherwise, add new node to subtree associating key with val.
      
      if(x == null)
      {
         return new Node(key, val, 1);
      }
      
      int cmp = key.compareTo(x.key);
      
      if(cmp < 0)
      {
         x.left = put(x.left, key, val);
      }
      else if(cmp > 0)
      {
         x.right = put(x.right, key, val);
      }
      else
      {
         x.val = val;
      }
      
      x.n = size(x.left) + size(x.right) + 1;
      
      return x;
   }
}