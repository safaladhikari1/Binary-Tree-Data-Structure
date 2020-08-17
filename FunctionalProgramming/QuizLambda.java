//import java.util.Random;
//import java.util.Scanner;
import java.util.*;
//import java.util.function.ToIntFunction;
import java.util.function.IntBinaryOperator;

/*
   Lambda Expressions
   <parameters> -> <expression>
   
   (int x, int y) -> x + y
   
   it is same as
   
   public static int sum(int x, int y)
   {
      return x + y;
   }
   
   We can eliminate the types for the parameters because they can
   usually be inferred by the surrounding context. It will be:
   
   (x, y) -> x + y
*/

public class QuizLambda
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      giveProblems(console, 5, "+", (x, y) -> x+y);
      giveProblems(console, 5, "*", (x, y) -> x*y);
   }
   
   public static void giveProblems(Scanner console, int numProblems, String text, IntBinaryOperator operator)
   {
      Random r = new Random();
      int numRight = 0;
      
      for(int i=1; i <= numProblems; i++)
      {
         int x = r.nextInt(12) + 1;
         int y = r.nextInt(12) + 1;
         System.out.print(x + " " + text + " " + y + " = ");
         
         int answer = operator.applyAsInt(x, y);
         
         int response = console.nextInt();
         
         if(response == answer)
         {
            System.out.println("you got it right");
            numRight++;
         }
         else
         {
            System.out.println("incorrect...the answer was " + answer);
         }           
      }
      
      System.out.println(numRight + " of " + numProblems + " correct");
      System.out.println();
   }
}