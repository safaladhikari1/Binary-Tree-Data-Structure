public class IntArrayMain
{
   public static void main(String[] args)
   {
      int[] myArray1 = {2, 4, 5, 2, 9};
      int[] myArray2 = {23, 57, 90, 12, 3};
      int[] myArray3 = {2, 4, 5, 2, 9};
      
      //IntArray.printIntArray(myArray1);
      //System.out.println(myTestIntArray.count(9));
      
      //System.out.println(myTestIntArray.indexOf(11));
      
      //myTestIntArray.replaceAll(2, 7);
      
      //myTestIntArray.printIntArray();
      
      //System.out.println(IntArray.equals(myArray1, myArray3));

      IntArray.printIntArray(myArray2);
      //IntArray.swap(myArray1, 0, 1);
      
      IntArray.reverse(myArray2);

      IntArray.printIntArray(myArray2);
      
      
   }
}