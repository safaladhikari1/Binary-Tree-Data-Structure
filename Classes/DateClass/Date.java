// A Date Class where each Date object represents a given year/month/day.

public class Date
{
   // fields
   int year;
   int month;
   int day;
   
   // constructors - initialize the state of created objects
   
   public Date(int year, int month, int day)
   {
      this.year = year;
      this.month = month;
      this.day = day;
   }
   
   public Date(Date other)
   {
      this(other.year, other.month, other.day);
   }
   
   // methods
   
   // Returns the number of days in the month
   public int getDaysInMonth()
   {
      if(this.month == 9 || this.month == 4 || this.month == 6 || this.month == 11)
      {
         return 30;
      }
      else if(this.month == 2)
      {
         if(isLeapYear())
         {
            return 29;
         }
         else
         {
            return 28;
         }
      }
      else
      {
         return 31;
      }
   }
   
   // Returns the number of days in the year
   public int getDaysInYear()
   {
      if(isLeapYear())
      {
         return 366;
      }
      else
      {
         return 365;   
      }
   }
   
   // Leap Years : (those divisible by 4 but not by 100), (divisible by 400)          
   // have 366 days (extra day on Feb, 29); other years have 365.
   public boolean isLeapYear()
   {
      return (this.year % 400 == 0 || (this.year % 4 == 0 && this.year % 100 != 0));
   }
}