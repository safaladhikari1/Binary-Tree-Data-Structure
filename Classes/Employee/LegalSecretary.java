// A class to represent legal secretaries.
public class LegalSecretary extends Secretary
{
   // Overrides getSalary from Employee class
   @Override
   public double getSalary()
   {
      return 45000.0;
   }
   
   // new behavior of LegalSecretary objects
   public void fileLegalBriefs()
   {
      System.out.println("I could file all day!");
   }   
}