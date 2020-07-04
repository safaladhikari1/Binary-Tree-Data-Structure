// A class to represent lawyers.
public class Lawyer extends Employee
{
   public Lawyer(int initialYears)
   {
      super(initialYears);
   }
   
   // override getVacationDays from Employee class
   @Override
   public int getVacationDays()
   {
      return 10 * getYears();
   }
   
   // override getSalary from Employee class
   @Override
   public double getSalary()
   {
      return super.getSalary() + 10000.0; 
   }
   
   // override getVacationForm from Employee class
   @Override
   public String getVacationForm()
   {
      return "pink";
   }
   
   // this is the lawyer's added behavior
   public void sue()
   {
      System.out.println("I'll see you in court!");
   }
}