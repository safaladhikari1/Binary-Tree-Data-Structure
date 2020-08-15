// This client program uses a HeapPriority queue to perform
// a version of the "heap sort" sorting algorithm.

/*
   HeapSort Algorithm:
   If you add all elements of an array to a priority queue and them remove them,
   they will come out in ascending (sorted) order.
   
   heapSort(A):
       H = create new heap.
    
   for each element n in A:
      add n to H.
   
   while(H not empty):
      remove element from H.
      add element back into A.
      
  while sorting an array of N elements,
  heap sort performs N add and N remove operations on a heap
  
  Each add or remove has a O(log N) complexity, so the
  overall heap sort algorithm has O(N log N) complexity.
  Heap sort is a fairly efficient algorithm, certainly much faster than
  selection sort and with comparable performance to merge sort.
  
  One drawback of the heap sort algorithm as shown is the memory required. 
  To sort the array, we must create another large data structure (the priority queue, and the array heap inside it)
  to temporarily store the data. For very large data sets this can be undesirable.
  
*/

import java.util.Arrays;

public class HeapSortMain
{
   public static void main(String[] args)
   {
      int[] a = {0, 65, 50, 20, 90, 44, 60, 80, 70, 99, 10};
      heapSort(a);
      System.out.println(Arrays.toString(a));
      
   }
   
   public static void heapSort(int[] a)
   {
      // If we have import java.util.*;
      // Queue<Integer> pq = new PriorityQueue<Integer>();
      HeapPriorityQueue<Integer> pq = new HeapPriorityQueue<Integer>();
      for(int n: a)
      {
         pq.add(n);
      }
      
      for(int i=0; i<a.length; i++)
      {
         a[i] = pq.remove();
      }     
   }  
}