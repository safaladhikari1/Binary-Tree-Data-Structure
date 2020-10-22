// The CalendarDate class stores information about a single
// calendar date (month and day but no year).
import java.util.*;

public class CalendarDate implements Comparable<CalendarDate>
{
   private int month;
   private int day;
   
   public CalendarDate(int month, int day)
   {
      this.month = month;
      this.day = day;
   }
   
   /*
      Our CalendarDate is implementing Comparable<T> interface: https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html#compareTo-T-
      
      This means, we need a compareTo(T o) method on this class.
      
      T means the class we are using to compare, o means the object of that class. On this example, CalendarDate is our class.
      
      compareTo() returns either - integer, + integer or 0 which is equivalent to: less than, greater than or equal to the specified object.
      
      ------
      
      On the example below, we are comparing month first, if the month are equal then days. But both if or else statements return positive number, negative number or 0.
      
      ------
      
      The benefit of implementing Comparable<T> interface in our class > creating our compareTo(T o) method
      
      So we can sort it by using Collections.sort(List<T> list) method
      It sorts the list into ascending order, according to the ordering we specify on our compareTo(T o) method
      
      https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#sort-java.util.List-
      
      https://github.com/safaladhikari1/Java-Concepts/blob/master/Classes/CalendarDate/CalendarDateTest.java
      
      --------
      
      This means that if we have an ArrayList<CalendarDate> full of CalendarDate objects, we can sort that list
      by using Collections.sort(ArrayList), and it sorts based on the logic we specify on our compareTo(T o) method on the CalendarDate class.
      
      Remember: Collection is the main interface in the Java collections framework, and ArrayList, LinkedList, HashSet, TreeSet implements Collection interface.
      
      https://github.com/safaladhikari1/Java-Concepts/blob/master/ListInterfaceInternals/JavaCollectionFramework.png
      
      ---------
   
   */
   
   // Compares this calendar date to another date.
   // Dates are compared by month and then by day.
   public int compareTo(CalendarDate other)
   {
      if(this.month != other.month)
      {
         return this.month - other.month;
      }
      else
      {
         return this.day - other.day;
      }     
   }
   
   public int getMonth()
   {
      return this.month;
   }
   
   public int getDay()
   {
      return this.day;
   }
   
   @Override
   public String toString()
   {
      return this.month + " /" + this.day;
   }   
}