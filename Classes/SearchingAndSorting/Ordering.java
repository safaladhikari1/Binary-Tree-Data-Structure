import java.util.Arrays;

public class Ordering
{
   public static void main(String[] args)
   {
      String[] strings = {"Foxtrot", "alpha", "echo", "golf", "bravo", "hotel", "Charlie", "DELTA"};
      Arrays.sort(strings);
      
      System.out.println(Arrays.toString(strings));
      
      // sort Strings using case-insensitive Comparator
      Arrays.sort(strings, String.CASE_INSENSITIVE_ORDER);
      System.out.println(Arrays.toString(strings));
      
      
   }
}