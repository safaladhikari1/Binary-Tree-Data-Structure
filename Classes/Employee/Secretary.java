// A class to represent secretaries.
public class Secretary extends Employee
{
   public Secretary(int initialYears)
   {
      super(initialYears);
   }
   
   public void takeDictation(String text)
   {
      System.out.println("Dictating text: " + text);
   }
}