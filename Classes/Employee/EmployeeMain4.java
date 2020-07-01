// Demonstrates polymorphism in an array of objects.
import java.text.DecimalFormat;

public class EmployeeMain4
{
   public static void main(String[] args)
   {
      // making objects for different employees     
      Employee emp1 = new Employee();
      Lawyer emp2 = new Lawyer();
      LegalSecretary emp3 = new LegalSecretary();
      Secretary emp4 = new Secretary();
      
      // Making an array of Employee
      Employee[] allEmployees = {emp1, emp2, emp3, emp4};
            
      DecimalFormat output = new DecimalFormat("$00000.00");
      
      for(int i=0; i<allEmployees.length; i++)
      {
         System.out.print(allEmployees[i].getHours() + ", ");
         System.out.print(output.format(allEmployees[i].getSalary()) + ", ");
         System.out.print(allEmployees[i].getVacationDays() + ", ");
         System.out.print(allEmployees[i].getVacationForm() + ", ");
         System.out.println(allEmployees[i]);   
      }
   }
}