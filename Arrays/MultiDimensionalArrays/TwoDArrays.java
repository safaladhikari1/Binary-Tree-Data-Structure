public class TwoDArrays
{
   public static void print(double[][] arrays)
   {
      
      // arrays.length, to ask the number of rows
      // arrays[i].length, to ask the number of columns
      
      // loop through the rows first
      for(int i=0; i < arrays.length; i++)
      {
         // loop through the column
         for(int j = 0; j < arrays[i].length; j++)
         {
            System.out.print(arrays[i][j]  + "   ");   
         }
         
         System.out.println();
      }
   }
   
}