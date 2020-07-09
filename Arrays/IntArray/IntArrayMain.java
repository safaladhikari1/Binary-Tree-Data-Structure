public class IntArrayMain
{
   public static void main(String[] args)
   {
      int[] myTestArray = {2, 4, 5, 2, 9};
      
      IntArray myTestIntArray = new IntArray(myTestArray);
      
      myTestIntArray.printIntArray();
      System.out.println(myTestIntArray.count(9));
   }
}