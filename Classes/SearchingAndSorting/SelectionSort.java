/*
   Complexity Classes
   
   Class            Big-Oh     IfyouDouble N,...
   
   Constant         O(1)       Unchanged
   Logarithmic      O(log2N)   Increases slightly
   Linear           O(N)       Doubles
   Log-Linear       O(Nlog2N)  Slightly more than doubles
   
   Bad:
   
   Quadratic        O(N^2)     Quadruples
   Cubic            O(N^3)     Multiplies by 8
   Explonential     O(2^N)     Multiplies drastically
*/

// Selection sort is an O(N^2) sorting algorithm

// Since the code has two nested for loops, each of which processes the entire array,
// the algorithm executes roughly N^2 statements.
import java.util.*;

public class SelectionSort
{
   public static void main(String[] args)
   {
      int[] testArray = {4, 9, 2, 3, 1, 78, 34};
      
      selectionSort(testArray);
      
      System.out.println(Arrays.toString(testArray));
   }
   
   // Rearranges the elements of a into sorted order using
   // the selection sort algorithm. 
   public static void selectionSort(int[] a)
   {
      for(int i=0; i < a.length - 1; i++)
      {
         // find index of smallest remaining value
         int min = i;
         for(int j=i+1; j < a.length; j++)
         {
            if(a[j] < a[min])
            {
               min = j;
            }
         }
         
         // swap smallest value its proper place front, a[i]
         swap(a, i, min);   
      }
   }
   
   public static void swap(int[] list, int i, int j)
   {
      int temp = list[i];
      list[i] = list[j];
      list[j] = temp;
   }
}