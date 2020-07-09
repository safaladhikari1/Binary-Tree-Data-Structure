// This program examines a series of daily high temperatures from the user,
// computes the average high temperature, and count how many days were above that average temperature.
import java.util.Scanner;

public class Temperatures
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("How many days' temperatures? ");
      int days = keyboard.nextInt();
      
      int[] daysArray = new int[days];
      
      int tempSum = 0;
      
      for(int i=0; i < daysArray.length; i++)
      {
         System.out.print("Day " + (i+1) + "'s high temp: ");
         daysArray[i] = keyboard.nextInt();
         tempSum += daysArray[i];       
      }
      
      double average = (double)(tempSum)/ days;
      
      System.out.print("Average = " + average + "\n");
      
      int daysAboveAverage = 0;
      
      for(int i=0; i < daysArray.length; i++)
      {
         if(daysArray[i] > average)
         {
            daysAboveAverage++;
         }
      }
      
      System.out.print(daysAboveAverage + " days above average");      
   }   
}