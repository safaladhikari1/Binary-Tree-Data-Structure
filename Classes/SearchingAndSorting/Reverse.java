// This algorithm to reverse an array runs in O(N) time

import java.util.*;

public class Reverse
{
   public static void main(String[] args)
   {
      int[] testArray = {4, 5, 9, 12, 3};
      reverse(testArray);
      
      System.out.println(Arrays.toString(testArray));
   }
   
   public static void reverse(int[] array)
   {
      for(int i=0; i < array.length / 2; i++)
      {
         int other = array.length - i - 1;
         int temp = array[i];
         array[i] = array[other];
         array[other] = temp;
      }
   }
}