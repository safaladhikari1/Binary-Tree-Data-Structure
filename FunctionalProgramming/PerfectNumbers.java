// This program will write a program that looks for the first 5 perfect numbers,
// using a functional programming approach including a specification that the
// computation can be performed in parallel to speed it up.

// A perfect number is defined as one that is equal to the sum of its divisors other than itself.
// For example: the divisors of 6 are [1, 2, 3, 6], if you exclude 6, the other divisors add up to 6 (1+2+3)
// 6 is the smallest perfect number
// The next perfect number is 28, who divisors are [1, 2, 4, 7, 14, 28].

import java.util.stream.*;

public class PerfectNumbers
{
   public static void main(String[] args)
   {
      long start = System.currentTimeMillis();
      IntStream.iterate(1, n -> n+1)
         .parallel()
         .unordered()
         .filter(n -> n == sumDivisors(n))
         .limit(5)
         .forEach(System.out::println);
      double elapsed = (System.currentTimeMillis() - start) / 1000.0;
      System.out.println();
      System.out.println("time = " + elapsed);
      
   }
   
   // pre: n >= 1
   // post: returns the sum of the proper divisors of n (i.e., not including n itself)
   public static int sumDivisors(int n)
   {
      int root = (int)Math.sqrt(n);
      int sum = IntStream.range(2, root + 1)
         .filter(x -> n % x == 0)
         .map(x -> x + n / x)
         .sum();
         
      if(n == root * root)
      {
         sum = sum - root;
      }
      
      return sum + 1;
   }   
}