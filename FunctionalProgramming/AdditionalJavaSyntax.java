public class AdditionalJavaSyntax
{
   public static void main(String[] args)
   {
      // Ternary Operator ? allows us to choose between two expressions based on the value of a boolean test
      // <test> ? <expression1> : <expression2>
      
      // if d > 10.0, set x to 5; else set x to 2
      double d = 5.0;
      int x = d > 10.0 ? 5 : 2;
      
      System.out.println(x); //2
      
      // e.g. "I have 3 buddies" or "I have 1 buddy"
      int pals = 5;
      String msg = "I have " + pals + " " + (pals == 1 ? "buddy" : "buddies");
      
      System.out.println(msg); // I have 5 buddies
      
      System.out.println(max(5, 2)); // 5
       
   }
   
   // Returns the larger of a and b
   public static int max(int a, int b)
   {
      return (a > b) ? a : b; 
   }  
}