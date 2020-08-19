/*
   Stream: Flow of data from a source to a terminator with possible modifiers in between.
   
   source --> stream1 --> modifier --> stream2
   
   Each of the modifiers will be specified by a function
   
   Streams describes more what we want computed instead of specifying how to compute it.
 
*/
import java.util.stream.IntStream;

public class SumStreams
{
   public static void main(String[] args)
   {
      
      // classic way to compute the sum of the squares of integers 1-5
      /*
      int sum = 0;
      for(int i=1; i<=5; i++)
      {
         sum = sum + i * i;
      }
      
      System.out.println(sum); 55
      */
      
      //Using Streams:
      
      /*     
      int sum2 = IntStream.range(1, 6).sum();
      
      System.out.println(sum2); 15 (1+2+3+4+5)
      */
      
      /*
         Using map: What map does is to produce a new stream that has the result of
         applying the given function to each element of the original stream.     
      */
      
      /*
         Read this on a high-level:
         To assign the variable sum, first form the given range of integers, then map the
         given function over those integers, and then find their sum.
      */
      
      int sum2 = IntStream.range(1, 6) // source sequence [1, 2, 3, 4, 5]
         .map(n -> n * n) // modifier [1, 4, 9, 16, 25]
         .sum(); // terminator 55
      
      System.out.println(sum2);
      
      
      
         
   }
}  