import java.util.Random;
import java.util.Scanner;

public class Quiz
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      giveProblems(console, 5, "+");
      giveProblems(console, 5, "*");
   }
   
   public static void giveProblems(Scanner console, int numProblems, String text)
   {
      Random r = new Random();
      int numRight = 0;
      
      for(int i=1; i <= numProblems; i++)
      {
         int x = r.nextInt(12) + 1;
         int y = r.nextInt(12) + 1;
         System.out.print(x + " " + text + " " + y + " = ");
         
         //int answer = x text y; we can't do this for multiplication
         
         int answer = x + 5;
         
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
   }
}