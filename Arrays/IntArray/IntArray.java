public class IntArray
{   
   // method
   public static void printIntArray(int[] list)
   {   
      if(list.length == 0)
      {
         System.out.print("[]");
      }
      
      else
      {
         System.out.print("[" + list[0]);
         
         for(int i=1; i < list.length; i++)
         {
            System.out.print(", " + list[i]);
         }
         
         System.out.println("]");
      }
  }
  
  public static int count(int number, int[] list)
  {     
      int count = 0;
      
      for(int i=0; i < list.length; i++)
      {
         if(list[i] == number)
         {
            count++;
         }
      }
      
      return count;  
  }
  
  public static int indexOf(int target, int[] list)
  {      
      for(int i=0; i < list.length; i++)
      {
         if(list[i] == target)
         {
            return i;
         }   
      }
      
      return -1;
  }
  
  public static void replaceAll(int target, int replacement, int[] list)
  {
      for(int i=0; i < list.length; i++)
      {
         if(list[i] == target)
         {
            list[i] = replacement;
         }
      }        
  }
  
  public static boolean equals(int[] list1, int[] list2)
  {
      // check what makes it unequal
      
      if(list1.length != list2.length)
      {
         return false;
      }
      
      for(int i = 0; i < list1.length; i++)
      {
         if(list1[i] != list2[i])
         {
            return false;   
         }
      }  
      
      return true;     
  }
  
  public static void reverse(int[] list)
  {
      
      int lastIndex = list.length - 1;
      
      for(int i = 0; i < (list.length / 2); i++)
      {
         swap(list, i , lastIndex);
         lastIndex--;   
      } 
  }
    
  public static void swap(int[] list, int i, int j)
  {
      int temp = list[i];
      list[i] = list[j];
      list[j] = temp; 
  }
  
  public static void rotateLeft(int[] list)
  {
      // store list[0] in temp
      // loop until the second last index
      // assign the last index to temp
      
      int temp = list[0];
      
      for(int i=0; i < list.length - 1; i++)
      {
         list[i] = list[i + 1];
      }
      
      list[list.length - 1] = temp;
  }
  
  public static void rotateRight(int[] list)
  {
      // save the last index list[list.length - 1] to temp
      // loop from last index list[list.length - 1] coming backward, until list[1]
      // then replace the values, while looping backwards
      // assign list[0] the temp value.
      
      int temp = list[list.length - 1];
      
      int startIndex = list.length - 1;
      for(int i = startIndex; i >= 1; i--)
      {
         list[i] = list[i - 1];
      }
      
      list[0] = temp; 
  }     
}