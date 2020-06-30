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
      
      System.out.print("Secretary: ");
      Secretary amanda = new Secretary();
      System.out.print(amanda.getHours() + ", ");
      System.out.print(output.format(amanda.getSalary()) + ", ");
      System.out.print(amanda.getVacationDays() + ", ");
      System.out.println(amanda.getVacationForm());
      amanda.takeDictation("hello");
      
   }
}