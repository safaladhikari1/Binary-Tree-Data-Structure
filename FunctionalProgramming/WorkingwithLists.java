import java.util.Arrays;
import java.util.List;

public class WorkingwithLists
{
   public static void main(String[] args)
   {
      // Java doesn't care about what the source of a stream is
      // It only cares about the kind of data in the stream.
      
      // List interface now includes a method called stream that can be used
      // to create a stream of values from a list
      List<String> words = Arrays.asList("To", "be", "or", "Not", "to", "be");
      
      // Classic way to simply print these wors on a line of output
      /*
      System.out.print("words: ");
      for(String s: words)
      {
         System.out.print(" " + s);
      }
      
      System.out.println();
      */
      
      // Using Stream: We can add more modifiers to this stream computation, we can apply the
      // toLowerCase method to eliminate any differences,
      // distinct method to eliminate duplicates,
      // sorted method to put the results into sorted order.
      
      System.out.print("words:");
      words.stream()             //["To", "be", "or", "Not", "to", "be"]
         .map(String::toLowerCase) // ["to", "be", "or", "not", "to", "be"]
         .distinct()                // ["to", "be", "or", "not"]
         .sorted()                  // ["be", "not", "or", "to"]
         .map(s -> " " + s)         // [" be", " not", " or", " to"]
         .forEach(System.out::print); // prints: "be not or to"
      System.out.println();
      
      // If we want to know the sum of the lengths of the strings in the original list
      // map command will produce a stream of objects
      
      /*
      int totalLength = words.stream()
         .map(String::length)
         .sum();
      */
         
      // if we really want it to produce a stream of simple int values, we have to call
      // the mapToInt method that changes the stream type
      
      int totalLength = words.stream() //["To", "be", "or", "Not", "to", "be"]
         .mapToInt(String :: length) //[2, 2, 2, 3, 2, 2]
         .sum(); //[13]
      
      System.out.println(totalLength);    
   }
}