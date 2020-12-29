import java.util.Arrays;

class MergeSort2
{
   public static void main(String[] args)
   {
      int[] testArray = {7, 2, 8, 4, 5, 3, 1, 6};
      mergeSort(testArray, 8);   
      System.out.println(Arrays.toString(testArray));
   }
   
   public static void mergeSort(int[] nums, int length)
   {
      if(length < 2)
      {
         return;
      }
      
      int mid = length/2;
      
      int[] left = new int[mid];
      int[] right = new int[length - mid];
      
      for(int i=0; i < mid; i++)
      {
         left[i] = nums[i];
      }
      
      for(int i=mid; i < length; i++)
      {
         right[i - mid] = nums[i];
      }
      
      mergeSort(left, mid);
      mergeSort(right, length - mid);
      
      merge(nums, left, right, mid, length - mid);     
   }
   
   public static void merge(int[] nums, int[] left, int[] right, int leftLength, int rightLength)
   {
      int i=0, j=0, k=0;
      
      while(i < leftLength && j < rightLength)
      {
         if(left[i] <= right[j])
         {
            nums[k] = left[i];
            k++;
            i++;
         }
         else
         {
            nums[k] = right[j];
            k++;
            j++;
         }
      }
      
      while(i < leftLength)
      {
         nums[k] = left[i];
         k++;
         i++;
      }
      
      while(j < rightLength)
      {
         nums[k] = right[j];
         k++;
         j++;
      }
   }
}