// This client program uses the Date class.

public class DateMain
{
   public static void main(String[] args)
   {
      Date d1 = new Date(2009, 10, 17);     
      Date d2 = new Date(2008, 2, 3);
      Date d3 = new Date(d1);
      
      System.out.println(d1.getDaysInMonth());
      System.out.println(d1.isLeapYear());
      System.out.println(d1.getDaysInYear());
      
      System.out.println(d2.getDaysInMonth());
      System.out.println(d2.isLeapYear());
      System.out.println(d2.getDaysInYear());
      
      System.out.println(d3.getDaysInMonth());
      System.out.println(d3.isLeapYear());
      System.out.println(d3.getDaysInYear());
         
   }
}  