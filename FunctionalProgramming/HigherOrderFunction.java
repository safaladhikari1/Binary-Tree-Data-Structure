import java.util.Arrays;

public class HigherOrderFunction
{
   // Methods like map, filter, and reduce are functions that accept other functions as arguments.
   // they are higher-order functions.
   
   public static void main(String[] args)
   {
      int[] numbers = {3, -4, 8, 4, -2, 17, 9, -10, 14, 6, -12};
      
      // suppose we want to find the sum of the absolute values of the even integers
      // in this list and we want to exclude any duplicates.
      
      /*
      int sum = Arrays.stream(numbers) // [3, -4, 8, 4, -2, 17, 9, -10, 14, 6, -12]
         .map(n -> Math.abs(n)) // [3, -4, 8, 4, -2, 17, 9, -10, 14, 6, -12]
         .filter(n -> n%2 == 0) // [4, 8, 4, 2, 10, 14, 6, 12]
         .distinct() // [4, 8, 2, 10, 14, 6, 12]
         .sum(); // 56
      */
               
      int sum = Arrays.stream(numbers)
         .map(Math::abs) // method reference, by directly calling Math.abs method
         .filter(n -> n % 2 == 0)
         .distinct()
         .sum();
         
      int[] subList = Arrays.stream(numbers)
         .map(Math::abs)
         .filter(n -> n % 2 == 0)
         .distinct()
         .toArray();
         
      System.out.println(Arrays.toString(subList));    
      
   }   
}