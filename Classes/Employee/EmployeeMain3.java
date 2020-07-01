// Demonstrates polymorphism by passing many types of employees
// as parameters to the same meethod.

import java.text.DecimalFormat;

public class EmployeeMain3
{
   public static void main(String[] args)
   {
      Employee sarah = new Employee();
      Lawyer john = new Lawyer();
      Secretary amanda = new Secretary();
      LegalSecretary julia = new LegalSecretary();
      
      printInfo(sarah);
      printInfo(john);
      printInfo(amanda);
      printInfo(julia);   
   }
   
   // Prints information about any kind of employee
   public static void printInfo(Employee e)
   {
      DecimalFormat output = new DecimalFormat("$00000.00");
      
      System.out.print(e.getHours() + ", ");
      System.out.print(output.format(e.getSalary()) + ", ");
      System.out.print(e.getVacationDays() + ", ");
      System.out.print(e.getVacationForm() + ", ");
      System.out.println(e); // toString representation of employee objects, calls the toString method on the Object class 
                             // because we don't have toString method on our classes.       
   }
}  