// A class to represent lawyers.
public class Lawyer extends Employee
{
   // override getVacationDays from Employee class
   @Override
   public int getVacationDays()
   {
      return 15;
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