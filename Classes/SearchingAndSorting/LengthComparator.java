import java.util.*;

public class LengthComparator implements Comparator<String>
{
   // compares String objects by length
   public int compare(String s1, String s2)
   {
      return s1.length() - s2.length();
   }   
}