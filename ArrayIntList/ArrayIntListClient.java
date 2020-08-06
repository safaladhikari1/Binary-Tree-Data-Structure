import java.util.*;

public class ArrayIntListClient
{
   public static void main(String[] args)
   {
      ArrayList<String> myList = new ArrayList<>();
      
      myList.add("harry");
      
      System.out.println(myList);
      
      Iterator<String> itr = myList.iterator();
      
      System.out.println(itr.next());
      System.out.println(itr.next());
   }
}