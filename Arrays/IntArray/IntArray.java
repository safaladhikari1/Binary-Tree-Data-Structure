public class IntArray
{
   // field
   private int[] intTestArray;
   
   // constructor
   public IntArray(int[] list)
   {
      this.intTestArray = list;  
   }
   
   // method
   public void printIntArray()
   {   
      if(this.intTestArray.length == 0)
      {
         System.out.print("[]");
      }
      
      else
      {
         System.out.print("[" + this.intTestArray[0]);
         
         for(int i=1; i < this.intTestArray.length; i++)
         {
            System.out.print(", " + this.intTestArray[i]);
         }
         
         System.out.println("]");
      }
  }
  
  public int count(int number)
  {
      // loop through the array
      // if array[i] == number, count++
      // return count
      
      int count = 0;
      
      for(int i=0; i < this.intTestArray.length; i++)
      {
         if(intTestArray[i] == number)
         {
            count++;
         }
      }
      
      return count;  
  }
  
  
   
   
   
   
}