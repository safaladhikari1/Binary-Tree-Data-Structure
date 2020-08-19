// Counts the factors of 12.

import java.util.stream.IntStream;

public class GoodScope
{
   public static void main(String[] args)
   {
      // Classic Way
      /*
      int n = 10;
      int count = 0;
      
      for(int i = 1; i <= n; i++)
      {
         if(isMultiple(i, n))
         {
            count++;
         }
      }
      
      System.out.println("count = " + count);
      */  
      
      // Using Streams
      // n is a free variable, that is within a function closure
      int n = 10;
      long count = IntStream.range(1, n+1)
         .filter(x -> n % x == 0)
         .count();
      
      System.out.println("count = " + count);
      
      /*
         Java puts together the code of the lambda expression along with the parameters,
         free variables into one big object. This object is the closure
         
         int min = 10;
         int max = 50;
         int multiplier = 3;
         compute((x, y) -> Math.max(x, min) * Math.max(y, max) * multiplier);
         
         //Function closure below
         
         parameters: (x, y)
         free variables: min = 10, max = 50, multiplier = 3
         code: Math.max(x, min) * Math.max(y, max) * multiplier 
         
         // Java requires that any free variable included in a lambda expression be a constant
         // with the keyword final        
        
      */
         
       
   }
   
   // Returns true if n is a multiple of (is divisible by) x.
   public static boolean isMultiple(int x, int n)
   {
      return n % x == 0;
   }
}