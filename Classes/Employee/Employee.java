// A class to represent employees in general.
public class Employee
{
   private int years;
   
   public Employee(int initialYears)
   {
      this.years = initialYears;
   }
   
   public int getYears()
   {
      return this.years;
   }
   
   public int getHours()
   {
      return 40;
   }
   
   public double getSalary()
   {
      return 40000.0;
   }
   
   public int getVacationDays()
   {
      return 10 + 2 * this.years;
   }
   
   public String getVacationForm()
   {
      return "yellow";
   }
}