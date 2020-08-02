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
   
   public static int range2(int[] numbers)
   {
      int maxDiff = 0;
      for(int i=0; i<numbers.length; i++)
      {
         for(int j=i+1; j<numbers.length; j++)
         {
            int diff = Math.abs(numbers[j] - numbers[i]);
            maxDiff = Math.max(maxDiff, diff);
         }
      }
      
      return maxDiff;
   }
}