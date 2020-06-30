// A client program to test the Employee Classes.
import java.text.DecimalFormat;

public class EmployeeMain
{
   public static void main(String[] args)
   {
      DecimalFormat output = new DecimalFormat("$00000.00");
      
      System.out.print("Employee: ");
      Employee sarah = new Employee();
      System.out.print(sarah.getHours() + ", ");
      System.out.print(output.format(sarah.getSalary()) + ", ");
      System.out.print(sarah.getVacationDays() + ", ");
      System.out.println(sarah.getVacationForm());
      
      System.out.println();
      System.out.print("Secretary: ");
      Secretary amanda = new Secretary();
      System.out.print(amanda.getHours() + ", ");
      System.out.print(output.format(amanda.getSalary()) + ", ");
      System.out.print(amanda.getVacationDays() + ", ");
      System.out.println(amanda.getVacationForm());
      amanda.takeDictation("hello");
      
      System.out.println();
      System.out.print("Lawyer: ");
      Lawyer john = new Lawyer();
      System.out.print(john.getHours() + ", ");
      System.out.print(output.format(john.getSalary()) + ", ");
      System.out.print(john.getVacationDays() + ", ");
      System.out.println(john.getVacationForm());
      john.sue();
      
      System.out.println();
      System.out.print("LegalSecretary: ");
      LegalSecretary julia = new LegalSecretary();
      System.out.print(julia.getHours() + ", ");
      System.out.print(output.format(julia.getSalary()) + ", ");
      System.out.print(julia.getVacationDays() + ", ");
      System.out.println(julia.getVacationForm());
      julia.takeDictation("neato");
      julia.fileLegalBriefs();
      
      
      
   }
}