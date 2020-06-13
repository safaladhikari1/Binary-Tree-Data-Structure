/*
   @author Safal Adhikari
   @class IT 220
   @date 06/12/2020
   @Binary Trees Programming Assignment: Construction of Basic Binary Tree to Generic Search Tree.
      This java file is a client program which constructs a SearchTree<String> and SearchTree<Integer>
      and puts words into alphabetical worder and puts number into numerical order.
*/

// This program uses the SearchTree class to construct a binary
// search tree of strings and a binary search tree of integers
// and print out each.

import java.util.*;

public class SearchTreeClient
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      
      SearchTree<String> names = new SearchTree<>();
      System.out.print("Name (blank to quit)? ");
      String name = console.nextLine();
      
      while(name.length() > 0)
      {
         names.add(name);
         System.out.print("Name (blank to quit)? ");
         name = console.nextLine();
      }
      
      System.out.println();
      
      System.out.println("Alphabetized list:");
      names.printInOrder();
      System.out.println();
      
      SearchTree<Integer> numbers = new SearchTree<>();
      System.out.print("Next in (0 to quit)? ");
      int number = console.nextInt();
      while(number != 0)
      {
         numbers.add(number);
         System.out.print("Next int (0 to quit)? ");
         number = console.nextInt();
      }
      System.out.println();
      System.out.println("Sorted list:");
      numbers.printInOrder();      
   }
}