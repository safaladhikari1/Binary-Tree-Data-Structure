// A Date Class where each Date object represents a given year/month/day.

public class Date
{
   // fields
   private int year;
   private int month;
   private int day;
   
   // constructors - initialize the state of created objects
   
   public Date(int year, int month, int day)
   {
      setYear(year);
      setMonth(month);
      setDay(day);
   }
   
   public Date(Date other)
   {
      this(other.year, other.month, other.day);
   }
   
   // methods
   
   public int getDay()
   {
      return this.day;
   }
   
   public int getMonth()
   {
      return this.month;
   }
   
   public int getYear()
   {
      return this.year;
   }
   
   public void setDay(int day)
   {
      if(day < 1 || day > getDaysInMonth())
      {
         throw new IllegalArgumentException("Illegal day: " + day);
      }
      
      this.day = day;
   }
   
   public void setMonth(int month)
   {
      if(month < 1 || month > 12)
      {
         throw new IllegalArgumentException("Illegal month: " + month);
      }
      
      this.month = month;
   }
   
   public void setYear(int year)
   {
      this.year = year;
   }
   
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
   
   // Returns true if this Date occurs in a leap year.
   public boolean isLeapYear()
   {
      return (this.year % 400 == 0 || (this.year % 4 == 0 && this.year % 100 != 0));
   }
   
   // Advances a Date
   public void nextDay()
   {
      this.day++;
      
      if(this.day > getDaysInMonth())
      {
         this.month++;
         this.day = 1;
         
         if(this.month > 12)
         {
            this.year = 1;
         }
      }     
   }
   
   public int daysBetween(Date other)
   {
      // count number of days
      // start at this date, move forward until we reach 'other'
      
      int count = 0;
          
      // assumes that this date < other date
      if(before(other))
      {
         Date temp = new Date(this);
         
         while(temp.year != other.year || temp.month != other.month || temp.day != other.day)
         {
            temp.nextDay();
            count++;
         }   
      }
      else
      {
         // this date is >= other date        
         Date temp = new Date(other);
         
         while(temp.year != this.year || temp.month != this.month || temp.day != this.day)
         {
            temp.nextDay();
            count++;
         }         
      }    
      return count;
   }
   
   public boolean before(Date other)
   {
      return (this.year < other.year || 
      this.year == other.year && this.month < other.month || 
      this.month == other.month && this.day < other.day);
   } 
}