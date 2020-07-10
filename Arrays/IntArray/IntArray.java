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
  
  
  
  
  
   
   
   
   
}