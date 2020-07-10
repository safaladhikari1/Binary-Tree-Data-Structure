import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class TallyQuizScores
{
   public static void main(String[] args) throws FileNotFoundException
   {
      
      // creating an array from 0 to 4, that's how quiz scores are being graded on this program
      // if we were to grade from 0 to 100, we just have to change 5 to 101.
      int[] scores = new int[5];
      
      // reading numbers from the file using Scanner
      
      File quizScores = new File("quizScores.txt");
      
      Scanner fileScanner = new Scanner(quizScores);
      
      while(fileScanner.hasNext())
      {
         int score = fileScanner.nextInt();
         scores[score]++;
      }
      
      System.out.println("Scores\tOccurrences");
      
      for(int i = 0; i < scores.length; i++)
      {
         System.out.println(i + "\t\t\t" + scores[i]);
      }
      
      
      
      
      
      
   }
}