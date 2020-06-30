// A class to represent legal secretaries.
public class LegalSecretary extends Secretary
{
   // Overrides getSalary from Employee class
   @Override
   public double getSalary()
   {
      return super.getSalary() + 5000.0; // 5k more than general employee
   }
   
   // new behavior of LegalSecretary objects
   public void fileLegalBriefs()
   {
      System.out.println("I could file all day!");
   }   
}