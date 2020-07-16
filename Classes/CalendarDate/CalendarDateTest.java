// Implementing the Comparable interface, gives us access to built-in utilities like Collections.sort

// Short program that creates a list of the birthdays of the 
// first 5 U.S. Presidents and that puts them into sorted order.

import java.util.*;

public class CalendarDateTest
{
   public static void main(String[] args)
   {
      ArrayList<CalendarDate> dates = new ArrayList<>();
      
      dates.add(new CalendarDate(2, 22)); //Washington
      dates.add(new CalendarDate(10, 30)); //Adams
      dates.add(new CalendarDate(4, 13)); //Jefferson
      
      System.out.println("birthdays = " + dates);
      Collections.sort(dates);
      System.out.println("birthdays = " + dates);
      
   }
}